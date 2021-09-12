package com.fairplay.web.resource;

import com.fairplay.service.PlayerService;
import com.fairplay.web.resource.PlayerResource;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.util.Collections;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Test class for "/player" Resource.
 *
 * @author Stavros Grigoriou
 */
@WebMvcTest(PlayerResource.class)
class PilotFairplayApplicationTests {

    /**
     * Mock the player service.
     */
    @MockBean
    private PlayerService playerService;

    /**
     * MockMVC.
     */
    @Autowired
    private MockMvc mockMvc;

    /**
     * Test that the endpoint "/player/all" works properly.
     *
     * @throws Exception in case of an error.
     */
    @Test
    void getAllPlayersTest() throws Exception {
        Mockito.doReturn(Collections.emptyList()).when(playerService).getAllPlayers();

        final MvcResult result = mockMvc.perform(get("/player/all"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();

        Mockito.verify(playerService, Mockito.times(1)).getAllPlayers();
    }

}
