package com.jeremiahcodes.sportschools;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "schools")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class School {
    @Id
    private ObjectId id;
    private String name;
    private String yearEstablished;
    private LocalDateTime created;
    private LocalDateTime updated;
}
