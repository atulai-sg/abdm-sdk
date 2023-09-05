package com.abdm.consent.repo;


import com.abdm.consent.models.ConsentArtefactResponse;
import com.abdm.consent.models.Consentgranted;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.UUID;

public interface ConsentArtefactFetchrepo extends MongoRepository<ConsentArtefactResponse, UUID> {



    public ConsentArtefactResponse findByrequestId(UUID requestId);
    public List<ConsentArtefactResponse> findByrequestId();


}
