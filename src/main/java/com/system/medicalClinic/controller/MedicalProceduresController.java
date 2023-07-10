package com.system.medicalClinic.controller;

import com.system.medicalClinic.model.MedicalProcedures;
import com.system.medicalClinic.service.MedicalProceduresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("v1/medical-procedures")
public class MedicalProceduresController {

    @Autowired
    private MedicalProceduresService medicalProceduresService;

    @GetMapping
    public ResponseEntity<List<MedicalProcedures>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(medicalProceduresService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<MedicalProcedures>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(medicalProceduresService.findById(id));
    }

    @PostMapping
    public ResponseEntity<MedicalProcedures> create(@RequestBody MedicalProcedures mp){
        return ResponseEntity.status(HttpStatus.CREATED).body(medicalProceduresService.save(mp));
    }

    @PutMapping
    public ResponseEntity<MedicalProcedures> update(@RequestBody MedicalProcedures mp){
        return ResponseEntity.status(HttpStatus.OK).body(medicalProceduresService.update(mp));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        medicalProceduresService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
