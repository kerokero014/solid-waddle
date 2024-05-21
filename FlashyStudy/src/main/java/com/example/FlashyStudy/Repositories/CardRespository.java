package com.example.FlashyStudy.Repositories;

import com.example.FlashyStudy.Models.Card;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardRespository extends MongoRepository<Card, ObjectId> {
}
