package com.example.FlashyStudy.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@Document(collection = "cards")
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    @Id
    private ObjectId id;
    private String front;
    private String back;

    @DocumentReference
    private String deckId;
}
