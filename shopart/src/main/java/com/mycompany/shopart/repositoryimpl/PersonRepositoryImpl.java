/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shopart.repositoryimpl;

import com.mycompany.shopart.model.Person;
import com.mycompany.shopart.repository.AbstractDAO;
import com.mycompany.shopart.repository.IPersonRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eyuel
 */
@Repository
public class PersonRepositoryImpl implements IPersonRepository {

    public PersonRepositoryImpl() {
    }

    @Override
    public Person findPersonById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPerson(Person person) {

        DataSource.addPerson(person);
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

        return DataSource.getAllPerson();
    }

}
