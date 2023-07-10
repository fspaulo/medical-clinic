package com.system.medicalClinic.service;

import com.system.medicalClinic.model.MedicalProcedures;
import com.system.medicalClinic.repository.MedicalProceduresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicalProceduresImpl implements MedicalProceduresService{

    @Autowired
    private MedicalProceduresRepository doctorRepository;

    @Override
    public MedicalProcedures save(MedicalProcedures mp) {
        return doctorRepository.save(mp);
    }

    @Override
    public List<MedicalProcedures> findAll() {
        return doctorRepository.findAll();
    }

    @Override
    public Optional<MedicalProcedures> findById(Long id) {
        return doctorRepository.findById(id);
    }

    @Override
    public MedicalProcedures update(MedicalProcedures mp) {
        return doctorRepository.save(mp);
    }

    @Override
    public void deleteById(Long id) {
        doctorRepository.deleteById(id);
    }
}
