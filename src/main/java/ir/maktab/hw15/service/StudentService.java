package ir.maktab.hw15.service;


import ir.maktab.hw15.domain.Course;
import ir.maktab.hw15.domain.Employee;
import ir.maktab.hw15.domain.Student;
import ir.maktab.hw15.domain.enums.StudentState;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentService {
    Student save(Student student);
    Student update(Student student);
    Optional<Student> findById(Long id);
    List<Student> findAll();
    void deleteById(Student student);
    Student findStudentByFirstnameAndLastname (String firstName, String lastName);
    List<Student> findAllByStudentState(StudentState studentState);
}
