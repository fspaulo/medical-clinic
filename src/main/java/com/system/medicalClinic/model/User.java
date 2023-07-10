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
public class User extends BaseEntity {

    private String name;

    private String username;

    private String password;

    private String phone;

}
