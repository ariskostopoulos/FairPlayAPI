package com.fairplay.service.utils;

import com.fairplay.domain.dto.PlayerDTO;
import com.fairplay.domain.entity.Player;

import java.util.function.Function;

/**
 * Conversions from DTO to DAO etc.
 *
 * @author Stavros Grigoriou
 */
public interface Conversions {

    /**
     * Converts a {@link Player} to {@link PlayerDTO}.
     */
    Function<Player, PlayerDTO> convertPlayerToDto = player -> new PlayerDTO(
            player.getName(),
            player.getRating(),
            player.getIsAvailable()
    );

}
