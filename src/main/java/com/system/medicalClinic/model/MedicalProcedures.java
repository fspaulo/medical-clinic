package com.system.medicalClinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class MedicalProcedures extends BaseEntity {

    private String name;

    private String procedureCode;

    private int minimalAge;

    @ManyToOne
    private Doctor doctor;

}
