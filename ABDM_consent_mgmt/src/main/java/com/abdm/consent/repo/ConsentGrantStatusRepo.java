package com.abdm.consent.repo;

import com.abdm.consent.models.Consentgranted;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ConsentGrantStatusRepo extends MongoRepository<Consentgranted,String> {



    public Consentgranted findByreqid(String reqId);
    public List<Consentgranted> findByreqid();
}
