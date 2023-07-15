package com.negana.restapimongo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@org.springframework.data.mongodb.core.mapping.Document(value = "documents")
public class Document {

    @Id
    private String id;

    private String title;

    private String description;

    private List<Person> persons;

    public Document() {
    }

    public Document(String id, String title, String description, List<Person> persons) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.persons = persons;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
