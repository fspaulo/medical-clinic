package com.system.medicalClinic.service;

import com.system.medicalClinic.model.MedicalProcedures;

import java.util.List;
import java.util.Optional;

public interface MedicalProceduresService {

    MedicalProcedures save(MedicalProcedures mp);
    List<MedicalProcedures> findAll();
    Optional<MedicalProcedures> findById(Long id);
    MedicalProcedures update(MedicalProcedures mp);
    void deleteById(Long id);
}
