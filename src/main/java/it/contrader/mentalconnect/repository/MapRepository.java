package it.contrader.mentalconnect.repository;

import it.contrader.mentalconnect.domain.Map;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Map entity.
 */
@SuppressWarnings("unused")
@Repository
public interface MapRepository extends JpaRepository<Map, Long> {

}
