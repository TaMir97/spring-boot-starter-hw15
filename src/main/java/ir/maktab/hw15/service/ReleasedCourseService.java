package ir.maktab.hw15.service;

import ir.maktab.hw15.domain.Course;
import ir.maktab.hw15.domain.ReleasedCourse;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ReleasedCourseService {
    ReleasedCourse save(ReleasedCourse releasedCourse);
    ReleasedCourse update(ReleasedCourse releasedCourse);
    Optional<ReleasedCourse> findById(Long id);
    List<ReleasedCourse> findAll();
    void deleteById(ReleasedCourse releasedCourse);
}