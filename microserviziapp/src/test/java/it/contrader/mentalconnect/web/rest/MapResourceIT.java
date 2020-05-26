package it.contrader.mentalconnect.web.rest;

import it.contrader.mentalconnect.MicroserviziappApp;
import it.contrader.mentalconnect.domain.Map;
import it.contrader.mentalconnect.repository.MapRepository;
import it.contrader.mentalconnect.service.MapService;
import it.contrader.mentalconnect.service.dto.MapDTO;
import it.contrader.mentalconnect.service.mapper.MapMapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for the {@link MapResource} REST controller.
 */
@SpringBootTest(classes = MicroserviziappApp.class)
@AutoConfigureMockMvc
@WithMockUser
public class MapResourceIT {

    private static final String DEFAULT_MAP_NAME = "AAAAAAAAAA";
    private static final String UPDATED_MAP_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_ELIXIR_MAP = "AAAAAAAAAA";
    private static final String UPDATED_ELIXIR_MAP = "BBBBBBBBBB";

    @Autowired
    private MapRepository mapRepository;

    @Autowired
    private MapMapper mapMapper;

    @Autowired
    private MapService mapService;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restMapMockMvc;

    private Map map;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Map createEntity(EntityManager em) {
        Map map = new Map()
            .mapName(DEFAULT_MAP_NAME)
            .elixirMap(DEFAULT_ELIXIR_MAP);
        return map;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Map createUpdatedEntity(EntityManager em) {
        Map map = new Map()
            .mapName(UPDATED_MAP_NAME)
            .elixirMap(UPDATED_ELIXIR_MAP);
        return map;
    }

    @BeforeEach
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
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(mapDTO)))
            .andExpect(status().isCreated());

        // Validate the Map in the database
        List<Map> mapList = mapRepository.findAll();
        assertThat(mapList).hasSize(databaseSizeBeforeCreate + 1);
        Map testMap = mapList.get(mapList.size() - 1);
        assertThat(testMap.getMapName()).isEqualTo(DEFAULT_MAP_NAME);
        assertThat(testMap.getElixirMap()).isEqualTo(DEFAULT_ELIXIR_MAP);
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
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(mapDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Map in the database
        List<Map> mapList = mapRepository.findAll();
        assertThat(mapList).hasSize(databaseSizeBeforeCreate);
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
            .contentType(MediaType.APPLICATION_JSON)
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
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(map.getId().intValue())))
            .andExpect(jsonPath("$.[*].mapName").value(hasItem(DEFAULT_MAP_NAME)))
            .andExpect(jsonPath("$.[*].elixirMap").value(hasItem(DEFAULT_ELIXIR_MAP)));
    }
    
    @Test
    @Transactional
    public void getMap() throws Exception {
        // Initialize the database
        mapRepository.saveAndFlush(map);

        // Get the map
        restMapMockMvc.perform(get("/api/maps/{id}", map.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(map.getId().intValue()))
            .andExpect(jsonPath("$.mapName").value(DEFAULT_MAP_NAME))
            .andExpect(jsonPath("$.elixirMap").value(DEFAULT_ELIXIR_MAP));
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
            .mapName(UPDATED_MAP_NAME)
            .elixirMap(UPDATED_ELIXIR_MAP);
        MapDTO mapDTO = mapMapper.toDto(updatedMap);

        restMapMockMvc.perform(put("/api/maps")
            .contentType(MediaType.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(mapDTO)))
            .andExpect(status().isOk());

        // Validate the Map in the database
        List<Map> mapList = mapRepository.findAll();
        assertThat(mapList).hasSize(databaseSizeBeforeUpdate);
        Map testMap = mapList.get(mapList.size() - 1);
        assertThat(testMap.getMapName()).isEqualTo(UPDATED_MAP_NAME);
        assertThat(testMap.getElixirMap()).isEqualTo(UPDATED_ELIXIR_MAP);
    }

    @Test
    @Transactional
    public void updateNonExistingMap() throws Exception {
        int databaseSizeBeforeUpdate = mapRepository.findAll().size();

        // Create the Map
        MapDTO mapDTO = mapMapper.toDto(map);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restMapMockMvc.perform(put("/api/maps")
            .contentType(MediaType.APPLICATION_JSON)
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

        // Delete the map
        restMapMockMvc.perform(delete("/api/maps/{id}", map.getId())
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<Map> mapList = mapRepository.findAll();
        assertThat(mapList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
