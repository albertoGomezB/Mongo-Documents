package com.negana.restapimongo.service;

import com.negana.restapimongo.entity.Document;
import com.negana.restapimongo.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService {

    private DocumentRepository documentRepository;

    @Autowired
    public DocumentServiceImpl (DocumentRepository documentRepository) {

        this.documentRepository = documentRepository;
    }

    @Override
    public List<Document> findAll() {

        return documentRepository.findAll();
    }

    @Override
    public Optional<Document> findById(String theId) {

        Optional<Document> theDocument = documentRepository.findById(theId);

        if(theDocument == null) {

            throw new RuntimeException("Employee id not found - " + theId);
        }

        return theDocument;
    }

    @Override
    public Document save(Document theDocument) {

        return documentRepository.save(theDocument);
    }

    @Override
    public void deleteById(String theId) {

        documentRepository.deleteById(theId);
    }
}
