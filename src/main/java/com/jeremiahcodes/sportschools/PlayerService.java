package com.jeremiahcodes.sportschools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository repository;

    public List<Player> findAllPlayers() {
        return repository.findAll();
    }
    public Optional<Player> findMovieByExternalPlayerId(String imdbId) {
        return repository.findMovieByExternalPlayerId(imdbId);
    }
}
