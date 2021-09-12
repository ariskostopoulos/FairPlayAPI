package com.fairplay.web.resource;

import com.fairplay.domain.Player;
import com.fairplay.service.PlayerService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Slf4j
@Controller
public class PlayerResource {

    @Getter
    private PlayerService playerService;

    @Autowired
    private void setPlayerService(final PlayerService service) {
        this.playerService = service;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/player/all", produces = "application/json")
    public List<Player> fetchAllPlayers() {
        log.debug("Call for /players/all");
        return getPlayerService().getAllPlayers();
    }

}
