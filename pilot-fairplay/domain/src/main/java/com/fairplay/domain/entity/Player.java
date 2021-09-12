package com.fairplay.domain.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * A Player Entity.
 *
 * @author Stavros Grigoriou
 */
@Data
@Entity(name = "PLAYER")
public class Player {

    /**
     * Primary key.
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * A player's full name.
     */
    @Column(name = "name")
    private String name;

    /**
     * A player's overall rating.
     */
    @Column(name = "rating")
    private Long rating;

    /**
     * Player's availability.
     */
    @Column(name = "is_available")
    private Boolean isAvailable;

}
