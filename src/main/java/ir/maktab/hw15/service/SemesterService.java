package ir.maktab.hw15.service;

import ir.maktab.hw15.domain.Course;
import ir.maktab.hw15.domain.Employee;
import ir.maktab.hw15.domain.Semester;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SemesterService {
    Semester save(Semester semester);
    Semester update(Semester semester);
    Optional<Semester> findById(Long id);
    List<Semester> findAll();
    void deleteById(Semester semester);
}