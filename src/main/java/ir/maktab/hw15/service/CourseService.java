package ir.maktab.hw15.service;


import ir.maktab.hw15.domain.Course;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CourseService {
    Course saveCourse(Course course);
    Course updateCourse(Course course);
    Optional<Course> findById(Long id);
    List<Course> findAll();

    void deleteById(Course course);
}