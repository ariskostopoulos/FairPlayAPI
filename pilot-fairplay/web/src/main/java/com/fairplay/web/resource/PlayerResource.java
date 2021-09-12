package com.fairplay.web.resource;

import com.fairplay.domain.dto.PlayerDTO;
import com.fairplay.service.PlayerService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Player resource.
 *
 * @author Stavros Grigoriou
 */
@Slf4j
@RestController
@RequestMapping("/player")
public class PlayerResource {

    /**
     * {@link PlayerService} instance.
     */
    @Getter
    private PlayerService playerService;

    /**
     * Set the value of {@link #playerService} instance.
     *
     * @param service {@link PlayerService} instance to use.
     */
    @Autowired
    private void setPlayerService(final PlayerService service) {
        this.playerService = service;
    }

    /**
     * HTTP/GET /player/all
     *
     * @return {@link List<PlayerDTO>} all the players.
     */
    @RequestMapping(method = RequestMethod.GET, path = "/all", produces = "application/json")
    public @ResponseBody
    List<PlayerDTO> fetchAllPlayers() {
        log.debug("Call for /players/all");
        final List<PlayerDTO> players = getPlayerService().getAllPlayers();

        log.info("Found {} players", players.size());

        return players;
    }

}
