package it.contrader.mentalconnect.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MapMapperTest {

    private MapMapper mapMapper;

    @BeforeEach
    public void setUp() {
        mapMapper = new MapMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 1L;
        assertThat(mapMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(mapMapper.fromId(null)).isNull();
    }
}
