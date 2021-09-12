package com.fairplay.service.impl;

import com.fairplay.domain.dto.PlayerDTO;
import com.fairplay.domain.entity.Player;
import com.fairplay.domain.repo.PlayerRepository;
import com.fairplay.service.PlayerService;
import com.fairplay.service.utils.Conversions;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation of basic service to handle {@link Player} actions.
 *
 * @author Stavros Grigoriou
 */
@Slf4j
@Service
public class PlayerServiceImpl implements PlayerService {

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
     * {@inheritDoc}
     */
    public List<PlayerDTO> getAllPlayers() {
        log.debug("Fetching all players from the database.");
        return getPlayerRepository()
                .getAllPlayers()
                .stream()
                .map(Conversions.convertPlayerToDto)
                .collect(Collectors.toList());
    }

}
