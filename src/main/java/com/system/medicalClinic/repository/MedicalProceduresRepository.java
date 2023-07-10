package com.system.medicalClinic.repository;

import com.system.medicalClinic.model.MedicalProcedures;
import com.system.medicalClinic.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalProceduresRepository extends JpaRepository<MedicalProcedures, Long> {

}
