package com.jeremiahcodes.sportschools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/players")
public class PlayerController {

    @Autowired
    private PlayerService service;
    @GetMapping
    public ResponseEntity<List<Player>> getPlayers() {
        return new ResponseEntity<List<Player>>(service.findAllPlayers(), HttpStatus.OK);
    }

    @GetMapping("/{externalPlayerId}")
    public ResponseEntity<Optional<Player>> getSinglePlayer(@PathVariable String externalPlayerId){
        return new ResponseEntity<Optional<Player>>(service.findMovieByExternalPlayerId(externalPlayerId), HttpStatus.OK);
    }
}
