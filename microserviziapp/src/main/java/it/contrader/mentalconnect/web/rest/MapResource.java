package it.contrader.mentalconnect.web.rest;

import it.contrader.mentalconnect.service.MapService;
import it.contrader.mentalconnect.web.rest.errors.BadRequestAlertException;
import it.contrader.mentalconnect.service.dto.MapDTO;

import io.github.jhipster.web.util.HeaderUtil;
import io.github.jhipster.web.util.PaginationUtil;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing {@link it.contrader.mentalconnect.domain.Map}.
 */
@RestController
@RequestMapping("/api")
public class MapResource {

    private final Logger log = LoggerFactory.getLogger(MapResource.class);

    private static final String ENTITY_NAME = "microserviziappMap";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final MapService mapService;

    public MapResource(MapService mapService) {
        this.mapService = mapService;
    }

    /**
     * {@code POST  /maps} : Create a new map.
     *
     * @param mapDTO the mapDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new mapDTO, or with status {@code 400 (Bad Request)} if the map has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/maps")
    public ResponseEntity<MapDTO> createMap(@Valid @RequestBody MapDTO mapDTO) throws URISyntaxException {
        log.debug("REST request to save Map : {}", mapDTO);
        if (mapDTO.getId() != null) {
            throw new BadRequestAlertException("A new map cannot already have an ID", ENTITY_NAME, "idexists");
        }
        MapDTO result = mapService.save(mapDTO);
        return ResponseEntity.created(new URI("/api/maps/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, false, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /maps} : Updates an existing map.
     *
     * @param mapDTO the mapDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated mapDTO,
     * or with status {@code 400 (Bad Request)} if the mapDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the mapDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/maps")
    public ResponseEntity<MapDTO> updateMap(@Valid @RequestBody MapDTO mapDTO) throws URISyntaxException {
        log.debug("REST request to update Map : {}", mapDTO);
        if (mapDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        MapDTO result = mapService.save(mapDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, false, ENTITY_NAME, mapDTO.getId().toString()))
            .body(result);
    }

    /**
     * {@code GET  /maps} : get all the maps.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of maps in body.
     */
    @GetMapping("/maps")
    public ResponseEntity<List<MapDTO>> getAllMaps(Pageable pageable) {
        log.debug("REST request to get a page of Maps");
        Page<MapDTO> page = mapService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(ServletUriComponentsBuilder.fromCurrentRequest(), page);
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * {@code GET  /maps/:id} : get the "id" map.
     *
     * @param id the id of the mapDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the mapDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/maps/{id}")
    public ResponseEntity<MapDTO> getMap(@PathVariable Long id) {
        log.debug("REST request to get Map : {}", id);
        Optional<MapDTO> mapDTO = mapService.findOne(id);
        return ResponseUtil.wrapOrNotFound(mapDTO);
    }

    /**
     * {@code DELETE  /maps/:id} : delete the "id" map.
     *
     * @param id the id of the mapDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/maps/{id}")
    public ResponseEntity<Void> deleteMap(@PathVariable Long id) {
        log.debug("REST request to delete Map : {}", id);

        mapService.delete(id);
        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, false, ENTITY_NAME, id.toString())).build();
    }
}
