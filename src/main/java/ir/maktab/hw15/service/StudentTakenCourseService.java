package ir.maktab.hw15.service;


import ir.maktab.hw15.domain.Course;
import ir.maktab.hw15.domain.Employee;
import ir.maktab.hw15.domain.StudentTakenCourse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface StudentTakenCourseService {
    StudentTakenCourse save(StudentTakenCourse studentTakenCourse);
    StudentTakenCourse update(StudentTakenCourse studentTakenCourse);
    Optional<StudentTakenCourse> findById(Long id);
    List<StudentTakenCourse> findAll();
    void deleteById(StudentTakenCourse studentTakenCourse);
}