package com.negana.restperson.dao;

import com.negana.restperson.entity.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {

    // Genera el id incremental de mysql en el documento mongo
    @Query(value = "SELECT NEXTVAL('person_id_sequence')", nativeQuery = true)
    int getNextIdFromSequence();
}
