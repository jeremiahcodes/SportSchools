package com.jeremiahcodes.sportschools;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends MongoRepository<Player, ObjectId> {
    Optional<Player> findMovieByExternalPlayerId(String externalPlayerId);
}
