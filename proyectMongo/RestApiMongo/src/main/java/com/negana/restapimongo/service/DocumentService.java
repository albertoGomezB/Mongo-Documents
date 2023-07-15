package com.negana.restapimongo.service;

import com.negana.restapimongo.entity.Document;

import java.util.List;
import java.util.Optional;

public interface DocumentService {

    List<Document> findAll();

    Optional<Document> findById(String theId);

    Document save (Document thePerson);

    void deleteById(String theId);
}
