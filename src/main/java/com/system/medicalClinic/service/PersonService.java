package com.system.medicalClinic.service;

import com.system.medicalClinic.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    Person save(Person person);
    List<Person> findAll();
    Optional<Person> findById(Long id);
    Person update(Person person);
    void deleteById(Long id);
}
