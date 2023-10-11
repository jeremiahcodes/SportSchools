package com.jeremiahcodes.sportschools;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "players")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    private ObjectId id;
    private String externalPlayerId;
    private String name;
    private String birthDate;
    private String highlightLink;
    private String poster;
    @DocumentReference
    private Sport sports;
    @DocumentReference
    private List<School> schoolIds;
    private List<String> posters;
    private List<String> highlightReel;
    @DocumentReference
    private List<Award> awardIds;

    public Player(String externalPlayerId, String name, String birthDate, String highlightLink, String poster, Sport sports) {
        this.externalPlayerId = externalPlayerId;
        this.name = name;
        this.birthDate = birthDate;
        this.highlightLink = highlightLink;
        this.poster = poster;
        this.sports = sports;
    }
}
