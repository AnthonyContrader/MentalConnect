package it.contrader.mentalconnect.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import it.contrader.mentalconnect.web.rest.TestUtil;

public class MapDTOTest {

    @Test
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
}
