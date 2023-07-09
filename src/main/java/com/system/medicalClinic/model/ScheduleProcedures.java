package com.system.medicalClinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class ScheduleProcedures extends BaseEntity {

    private LocalDateTime date;

    @ManyToOne(cascade = { CascadeType.ALL })
    private Person person;

    @ManyToOne(cascade = { CascadeType.ALL })
    private MedicalProcedures medicalProcedures;
}
