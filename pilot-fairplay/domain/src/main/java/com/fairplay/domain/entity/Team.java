package com.fairplay.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Team entity.
 *
 * @author Aristidis Kostopoulos
 */
@Data
@Entity(name = "TEAM")
public class Team {

    /**
     * Team primary ID.
     */
    @Id
    @Column(name = "id")
    private Long id;

    /**
     * Team's overall rating.
     */
    @Column(name = "rating")
    private float rating;

    /**
     * Players of the team.
     */
    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(
            name = "TEAM_PLAYERS",
            joinColumns = {@JoinColumn(name = "team_id")},
            inverseJoinColumns = {@JoinColumn(name = "player_id")}
    )
    private List<Player> players;

}
