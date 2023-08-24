package com.abdm.consent.repo;

import com.abdm.consent.models.Consent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsentRepo extends MongoRepository<Consent,Integer> {
}
