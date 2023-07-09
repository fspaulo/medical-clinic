package com.system.medicalClinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
@EqualsAndHashCode(callSuper = false)
public class Person extends BaseEntity {

    private String firstName;

    private String lastName;

    private int age;

    private String gender;

    private String phone;

    @OneToMany(targetEntity = MedicalProcedures.class, cascade = CascadeType.ALL)
    @JoinColumn(name="person")
    private List<ScheduleProcedures> scheduleProcedures;
}
