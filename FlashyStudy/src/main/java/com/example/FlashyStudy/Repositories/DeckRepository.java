package com.example.FlashyStudy.Repositories;

import com.example.FlashyStudy.Models.Deck;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends MongoRepository<Deck, ObjectId> {
}
