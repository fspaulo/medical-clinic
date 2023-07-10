package com.system.medicalClinic.service;

import com.system.medicalClinic.model.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {

    Doctor save(Doctor doctor);
    List<Doctor> findAll();
    Optional<Doctor> findById(Long id);
    Doctor update(Doctor doctor);
    void deleteById(Long id);
}
