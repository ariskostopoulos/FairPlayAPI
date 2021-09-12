package com.fairplay.service;

import com.fairplay.domain.dto.PlayerDTO;

import java.util.List;

/**
 * Player service interface.
 *
 * @author Stavros Grigoriou
 */
public interface PlayerService {

    /**
     * Retrieves all the available players in the database.
     * <p>
     * TODO: Pagination
     *
     * @return {@link List<PlayerDTO>} the players retrieved.
     */
    List<PlayerDTO> getAllPlayers();

}
