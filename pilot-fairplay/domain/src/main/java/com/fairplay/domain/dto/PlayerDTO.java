package com.fairplay.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * PlayerDTO.
 *
 * @author Stavros Grigoriou
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class PlayerDTO {

    /**
     * Player's name.
     */
    public String name;

    /**
     * Player's rating.
     */
    public Long rating;

    /**
     * Player's availability.
     */
    public Boolean isAvailable;

}
