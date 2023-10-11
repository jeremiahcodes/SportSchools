package com.jeremiahcodes.sportschools;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "sports")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sport {
    @Id
    private ObjectId id;
    private String name;
    private String yearEstablished;
    private int numberOfTeams;
    private int numberOfStates;
    private LocalDateTime created;
    private LocalDateTime updated;
}
