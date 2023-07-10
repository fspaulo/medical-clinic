package com.system.medicalClinic.controller;

import com.system.medicalClinic.model.Doctor;
import com.system.medicalClinic.model.Person;
import com.system.medicalClinic.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public ResponseEntity<List<Doctor>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(doctorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Doctor>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(doctorService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Doctor> create(@RequestBody Doctor doctor){
        return ResponseEntity.status(HttpStatus.CREATED).body(doctorService.save(doctor));
    }

    @PutMapping
    public ResponseEntity<Doctor> update(@RequestBody Doctor doctor){
        return ResponseEntity.status(HttpStatus.OK).body(doctorService.update(doctor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        doctorService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
