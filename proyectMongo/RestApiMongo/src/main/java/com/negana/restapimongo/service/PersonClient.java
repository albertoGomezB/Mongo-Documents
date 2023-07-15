package com.negana.restapimongo.service;

import com.negana.restapimongo.entity.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@FeignClient(name ="restperson")
public interface PersonClient {

    @GetMapping("/persons")
    List<Person> getAll();

    @PostMapping("/persons")
    Person save(@RequestBody Person person);

    @GetMapping("/persons/{id}")
    Person getPersonById(@PathVariable("id") int id);
}



