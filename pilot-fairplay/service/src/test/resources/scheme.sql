-----------------------
-- Table: PLAYER
-----------------------
CREATE TABLE player
(
    id           SERIAL,
    PRIMARY KEY (id),
    name         TEXT    NOT NULL,
    rating       FLOAT   NOT NULL,
    is_available BOOLEAN NOT NULL
);

COMMENT ON TABLE player IS 'Basic player information';
COMMENT ON COLUMN player.id IS 'Primary Key';
COMMENT ON COLUMN player.name IS 'Players full name';
COMMENT ON COLUMN player.rating IS 'The players overall rating';
COMMENT ON COLUMN player.is_available IS 'Check if the player is available';

-----------------------
-- Table: TEAM
-----------------------
CREATE TABLE team
(
    id     SERIAL,
    PRIMARY KEY (id),
    rating FLOAT
);

COMMENT ON TABLE team IS 'A team structure';
COMMENT ON COLUMN team.id IS 'Team id';
COMMENT ON COLUMN team.rating IS 'Overall rating of the team';

-----------------------
-- Table: TEAM_PLAYER
-----------------------
CREATE TABLE team_players
(
    team_id   INT NOT NULL REFERENCES team (id),
    player_id INT NOT NULL REFERENCES player (id)
);

COMMENT ON TABLE team_players IS 'A team with its players';
COMMENT ON COLUMN team_players.player_id IS 'A player id';
COMMENT ON COLUMN team_players.team_id IS 'A team id';