package ir.maktab.hw15.service;


import ir.maktab.hw15.domain.Course;
import ir.maktab.hw15.domain.Person;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface PersonService {
    Person save(Person person);
    Person update(Person person);
    Optional<Person> findById(Long id);
    List<Person> findAll();
    void deleteById(Person person);
}