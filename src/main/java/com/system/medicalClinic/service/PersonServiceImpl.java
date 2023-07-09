package com.system.medicalClinic.service;

import com.system.medicalClinic.model.Person;
import com.system.medicalClinic.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository productRepository;

    @Override
    public Person save(Person person) {
        return productRepository.save(person);
    }

    @Override
    public List<Person> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Person> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Person update(Person person) {
        return productRepository.save(person);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }
}
