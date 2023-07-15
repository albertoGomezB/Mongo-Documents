package com.negana.restapimongo.rest;

import com.negana.restapimongo.entity.Document;
import com.negana.restapimongo.entity.Person;
import com.negana.restapimongo.service.DocumentService;
import com.negana.restapimongo.service.PersonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/negana")
    public class DocumentRestController {

        @Autowired
        private DocumentService documentService;
        @Autowired
        private PersonClient personClient;

        public DocumentRestController(DocumentService documentService, PersonClient personClient) {
            this.documentService = documentService;
            this.personClient = personClient;
        }

        @PostMapping("/documents")
        public ResponseEntity<?> save(@RequestBody Document theDocument) {
            try {
                List<Person> persons = theDocument.getPersons();
                List<Person> updatedPersons = new ArrayList<>();

                for (Person person : persons) {
                    Person savedPerson = personClient.save(person);
                    updatedPersons.add(savedPerson);
                }

                theDocument.setPersons(updatedPersons);

                Document savedDocument = documentService.save(theDocument);

                return ResponseEntity.ok(savedDocument);
            } catch (Exception e) {
                e.printStackTrace();
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error when creating the document");
            }
        }

        @GetMapping("/documents")
        public List<Document> findAll() {
            return documentService.findAll();
        }

        @GetMapping("/documents/{id}")
        public Optional<Document> findById(@PathVariable String id) {
            return documentService.findById(id);
        }

        @DeleteMapping("/documents/{id}")
        public void deleteById(@PathVariable String id) {
            documentService.deleteById(id);
        }
    }

