package ir.maktab.hw15.service;


import ir.maktab.hw15.domain.Course;
import ir.maktab.hw15.domain.Employee;
import ir.maktab.hw15.domain.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TeacherService {
    Teacher save(Teacher teacher);
    Teacher update(Teacher teacher);
    Optional<Teacher> findById(Long id);
    List<Teacher> findAll();
    void deleteById(Teacher teacher);
}