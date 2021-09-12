package com.fairplay.domain.repo;

import com.fairplay.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository for {@link Player} entity.
 *
 * @author Stavros Grigoriou
 */
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    /**
     * Fetch all the players.
     *
     * @return {@link List<Player>} all the players in the database.
     */
    @Query(value = "SELECT * FROM Player", nativeQuery = true)
    List<Player> getAllPlayers();

}
