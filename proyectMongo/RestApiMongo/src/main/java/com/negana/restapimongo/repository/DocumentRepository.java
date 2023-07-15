package com.negana.restapimongo.repository;

import com.negana.restapimongo.entity.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends MongoRepository<Document,String> {


}
