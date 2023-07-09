package com.system.medicalClinic.controller;

import com.system.medicalClinic.model.Person;
import com.system.medicalClinic.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public ResponseEntity<List<Person>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(personService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Person>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(personService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person product){
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.save(product));
    }

    @PutMapping
    public ResponseEntity<Person> update(@RequestBody Person product){
        return ResponseEntity.status(HttpStatus.OK).body(personService.update(product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        personService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
