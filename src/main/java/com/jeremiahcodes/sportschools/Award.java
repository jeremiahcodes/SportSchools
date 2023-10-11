package com.jeremiahcodes.sportschools;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "awards")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Award {
    @Id
    private ObjectId id;
    private String award;
    private String yearAwarded;
    private LocalDateTime created;
    private LocalDateTime updated;

}
