package com.system.medicalClinic.bussiness;

import com.system.medicalClinic.model.Person;
import com.system.medicalClinic.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class PersonBusiness {

    @Autowired
    private PersonService personService;

    public List<Person> getPersons(){
        return personService.findAll();
    }
}
