package ir.maktab.hw15.service.impl;


import ir.maktab.hw15.domain.StudentTakenCourse;
import ir.maktab.hw15.repository.StudentTakenCourseRepository;
import ir.maktab.hw15.service.StudentTakenCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentTakenCourseServiceImpl implements StudentTakenCourseService {
    private final StudentTakenCourseRepository studentTakenCourseRepository;

    @Override
    public StudentTakenCourse save(StudentTakenCourse studentTakenCourse) {
        return studentTakenCourseRepository.save(studentTakenCourse);
    }

    @Override
    public StudentTakenCourse update(StudentTakenCourse studentTakenCourse) {
        return studentTakenCourseRepository.save(studentTakenCourse);
    }

    @Override
    public Optional<StudentTakenCourse> findById(Long id) {
        return studentTakenCourseRepository.findById(id);
    }

    @Override
    public List<StudentTakenCourse> findAll() {
        return studentTakenCourseRepository.findAll();
    }

    @Override
    public void deleteById(StudentTakenCourse studentTakenCourse) {
        studentTakenCourseRepository.deleteById(studentTakenCourse.getId());
    }
}