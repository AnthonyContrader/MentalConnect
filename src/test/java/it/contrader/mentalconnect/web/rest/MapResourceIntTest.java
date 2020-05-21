package it.contrader.mentalconnect.web.rest;

import it.contrader.mentalconnect.MicroserviziappApp;

import it.contrader.mentalconnect.domain.Map;
import it.contrader.mentalconnect.repository.MapRepository;
import it.contrader.mentalconnect.service.MapService;
import it.contrader.mentalconnect.service.dto.MapDTO;
import it.contrader.mentalconnect.service.mapper.MapMapper;
import it.contrader.mentalconnect.web.rest.errors.ExceptionTranslator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;


import static it.contrader.mentalconnect.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the MapResource REST controller.
 *
 * @see MapResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MicroserviziappApp.class)
public class MapResourceIntTest {

    private static final Long DEFAULT_ID_MAP = 1L;
    private static final Long UPDATED_ID_MAP = 2L;

    private static final Long DEFAULT_ID_FOLDER = 1L;
    private static final Long UPDATED_ID_FOLDER = 2L;

    private static final String DEFAULT_MAP_NAME = "AAAAAAAAAA";
    private static final String UPDATED_MAP_NAME = "BBBBBBBBBB";

    @Autowired
    private MapRepository mapRepository;


    @Autowired
    private MapMapper mapMapper;
    

    @Autowired
    private MapService mapService;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    private MockMvc restMapMockMvc;

    private Map map;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final MapResource mapResource = new MapResource(mapService);
        this.restMapMockMvc = MockMvcBuilders.standaloneSetup(mapResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Map createEntity(EntityManager em) {
        Map map = new Map()
            .idMap(DEFAULT_ID_MAP)
            .idFolder(DEFAULT_ID_FOLDER)
            .mapName(DEFAULT_MAP_NAME);
        return map;
    }

    @Before
    public void initTest() {
        map = createEntity(em);
    }

    @Test
    @Transactional
    public void createMap() throws Exception {
        int databaseSizeBeforeCreate = mapRepository.findAll().size();

        // Create the Map
        MapDTO mapDTO = mapMapper.toDto(map);
        restMapMockMvc.perform(post("/api/maps")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(mapDTO)))
            .andExpect(status().isCreated());

        // Validate the Map in the database
        List<Map> mapList = mapRepository.findAll();
        assertThat(mapList).hasSize(databaseSizeBeforeCreate + 1);
        Map testMap = mapList.get(mapList.size() - 1);
        assertThat(testMap.getIdMap()).isEqualTo(DEFAULT_ID_MAP);
        assertThat(testMap.getIdFolder()).isEqualTo(DEFAULT_ID_FOLDER);
        assertThat(testMap.getMapName()).isEqualTo(DEFAULT_MAP_NAME);
    }

    @Test
    @Transactional
    public void createMapWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = mapRepository.findAll().size();

        // Create the Map with an existing ID
        map.setId(1L);
        MapDTO mapDTO = mapMapper.toDto(map);

        // An entity with an existing ID cannot be created, so this API call must fail
        restMapMockMvc.perform(post("/api/maps")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(mapDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Map in the database
        List<Map> mapList = mapRepository.findAll();
        assertThat(mapList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    public void checkIdFolderIsRequired() throws Exception {
        int databaseSizeBeforeTest = mapRepository.findAll().size();
        // set the field null
        map.setIdFolder(null);

        // Create the Map, which fails.
        MapDTO mapDTO = mapMapper.toDto(map);

        restMapMockMvc.perform(post("/api/maps")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(mapDTO)))
            .andExpect(status().isBadRequest());

        List<Map> mapList = mapRepository.findAll();
        assertThat(mapList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void checkMapNameIsRequired() throws Exception {
        int databaseSizeBeforeTest = mapRepository.findAll().size();
        // set the field null
        map.setMapName(null);

        // Create the Map, which fails.
        MapDTO mapDTO = mapMapper.toDto(map);

        restMapMockMvc.perform(post("/api/maps")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(mapDTO)))
            .andExpect(status().isBadRequest());

        List<Map> mapList = mapRepository.findAll();
        assertThat(mapList).hasSize(databaseSizeBeforeTest);
    }

    @Test
    @Transactional
    public void getAllMaps() throws Exception {
        // Initialize the database
        mapRepository.saveAndFlush(map);

        // Get all the mapList
        restMapMockMvc.perform(get("/api/maps?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(map.getId().intValue())))
            .andExpect(jsonPath("$.[*].idMap").value(hasItem(DEFAULT_ID_MAP.intValue())))
            .andExpect(jsonPath("$.[*].idFolder").value(hasItem(DEFAULT_ID_FOLDER.intValue())))
            .andExpect(jsonPath("$.[*].mapName").value(hasItem(DEFAULT_MAP_NAME.toString())));
    }
    

    @Test
    @Transactional
    public void getMap() throws Exception {
        // Initialize the database
        mapRepository.saveAndFlush(map);

        // Get the map
        restMapMockMvc.perform(get("/api/maps/{id}", map.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(map.getId().intValue()))
            .andExpect(jsonPath("$.idMap").value(DEFAULT_ID_MAP.intValue()))
            .andExpect(jsonPath("$.idFolder").value(DEFAULT_ID_FOLDER.intValue()))
            .andExpect(jsonPath("$.mapName").value(DEFAULT_MAP_NAME.toString()));
    }
    @Test
    @Transactional
    public void getNonExistingMap() throws Exception {
        // Get the map
        restMapMockMvc.perform(get("/api/maps/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateMap() throws Exception {
        // Initialize the database
        mapRepository.saveAndFlush(map);

        int databaseSizeBeforeUpdate = mapRepository.findAll().size();

        // Update the map
        Map updatedMap = mapRepository.findById(map.getId()).get();
        // Disconnect from session so that the updates on updatedMap are not directly saved in db
        em.detach(updatedMap);
        updatedMap
            .idMap(UPDATED_ID_MAP)
            .idFolder(UPDATED_ID_FOLDER)
            .mapName(UPDATED_MAP_NAME);
        MapDTO mapDTO = mapMapper.toDto(updatedMap);

        restMapMockMvc.perform(put("/api/maps")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(mapDTO)))
            .andExpect(status().isOk());

        // Validate the Map in the database
        List<Map> mapList = mapRepository.findAll();
        assertThat(mapList).hasSize(databaseSizeBeforeUpdate);
        Map testMap = mapList.get(mapList.size() - 1);
        assertThat(testMap.getIdMap()).isEqualTo(UPDATED_ID_MAP);
        assertThat(testMap.getIdFolder()).isEqualTo(UPDATED_ID_FOLDER);
        assertThat(testMap.getMapName()).isEqualTo(UPDATED_MAP_NAME);
    }

    @Test
    @Transactional
    public void updateNonExistingMap() throws Exception {
        int databaseSizeBeforeUpdate = mapRepository.findAll().size();

        // Create the Map
        MapDTO mapDTO = mapMapper.toDto(map);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException 
        restMapMockMvc.perform(put("/api/maps")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(mapDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Map in the database
        List<Map> mapList = mapRepository.findAll();
        assertThat(mapList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deleteMap() throws Exception {
        // Initialize the database
        mapRepository.saveAndFlush(map);

        int databaseSizeBeforeDelete = mapRepository.findAll().size();

        // Get the map
        restMapMockMvc.perform(delete("/api/maps/{id}", map.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Map> mapList = mapRepository.findAll();
        assertThat(mapList).hasSize(databaseSizeBeforeDelete - 1);
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Map.class);
        Map map1 = new Map();
        map1.setId(1L);
        Map map2 = new Map();
        map2.setId(map1.getId());
        assertThat(map1).isEqualTo(map2);
        map2.setId(2L);
        assertThat(map1).isNotEqualTo(map2);
        map1.setId(null);
        assertThat(map1).isNotEqualTo(map2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(MapDTO.class);
        MapDTO mapDTO1 = new MapDTO();
        mapDTO1.setId(1L);
        MapDTO mapDTO2 = new MapDTO();
        assertThat(mapDTO1).isNotEqualTo(mapDTO2);
        mapDTO2.setId(mapDTO1.getId());
        assertThat(mapDTO1).isEqualTo(mapDTO2);
        mapDTO2.setId(2L);
        assertThat(mapDTO1).isNotEqualTo(mapDTO2);
        mapDTO1.setId(null);
        assertThat(mapDTO1).isNotEqualTo(mapDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(mapMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(mapMapper.fromId(null)).isNull();
    }
}
