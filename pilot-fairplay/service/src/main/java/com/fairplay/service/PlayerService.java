package com.fairplay.service;

import com.fairplay.domain.Player;
import com.fairplay.domain.repo.PlayerRepository;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Basic service to handle {@link Player} actions.
 *
 * @author Stavros Grigoriou
 */
@Slf4j
@Service
public class PlayerService {

    /**
     * {@link PlayerRepository} instance.
     */
    @Getter
    private PlayerRepository playerRepository;

    /**
     * Set the instance of {@link #playerRepository}.
     *
     * @param repo {@link PlayerRepository} instance.
     */
    @Autowired
    private void setPlayerRepository(final PlayerRepository repo) {
        this.playerRepository = repo;
    }

    /**
     * Fetch all the players from the database.
     *
     * @return {@link List<Player>} the players information.
     */
    public List<Player> getAllPlayers() {
        log.debug("Fetching all players from the database.");
        return getPlayerRepository().getAllPlayers();
    }

}
