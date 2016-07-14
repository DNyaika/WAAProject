/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.serviceimpl;

import com.mycompany.shopart.model.Person;
import com.mycompany.shopart.model.Product;
import com.mycompany.shopart.repository.IPersonRepository;
import com.mycompany.shopart.service.IPersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author eyuel
 */
@Service
@Transactional
public class PersonServiceImpl implements IPersonService {

    public PersonServiceImpl() {
    }
    
    @Autowired
    private IPersonRepository personRepository;

    @Override
    public Person findById(int personId) {
        return personRepository.findPersonById(personId);
    }

    @Override
    public void addPerson(Person person) {
        personRepository.addPerson(person);
    }

    @Override
    public void deletePerson(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updatePerson(Person person) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Person> findAllPerson() {
        return personRepository.findAllPerson();
    }


}
