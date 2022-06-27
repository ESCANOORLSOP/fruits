package com.sriram.fruits;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface FruitRepository extends MongoRepository<Fruitsinfo, String> {

    @Query("{fruitId:'?0'}")
    Fruitsinfo findFruitsinfoById(String fruitId);
}
