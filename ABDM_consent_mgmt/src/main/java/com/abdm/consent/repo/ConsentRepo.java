package com.abdm.consent.repo;

import com.abdm.consent.models.consent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsentRepo extends MongoRepository<consent,Integer> {
}
