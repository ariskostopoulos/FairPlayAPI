package com.fairplay.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * A Player Entity.
 */
@Data
@Entity(name = "PLAYER")
public class Player {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "rating")
    private Long rating;

    @Column(name = "is_available")
    private Boolean isAvailable;

}
