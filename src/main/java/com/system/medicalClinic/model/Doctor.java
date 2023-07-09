package com.system.medicalClinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Doctor extends BaseEntity {

    private String name;

    @OneToMany(targetEntity = MedicalProcedures.class, cascade = CascadeType.ALL)
    @JoinColumn(name="doctor")
    private List<MedicalProcedures> medicalProcedures;
}
