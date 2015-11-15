package com.alonmack.service;

import com.alonmack.repository.PersonRepository;
import com.alonmack.object.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;

    }

    @Override
    public Person get(Integer id) {
        return personRepository.findOne(id);
    }
}
