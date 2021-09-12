package com.fairplay.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "TEAM")
public class Team {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "rating")
    private float rating;

    @ManyToMany(cascade = {CascadeType.MERGE})
    @JoinTable(
            name = "TEAM_PLAYERS",
            joinColumns = {@JoinColumn(name = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id")}
    )
    private List<Player> players;

}
