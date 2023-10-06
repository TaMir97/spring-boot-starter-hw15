package ir.maktab.hw15.service;

import ir.maktab.hw15.domain.Course;
import ir.maktab.hw15.domain.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DepartmentService {
    Department save(Department department);
    Department update(Department department);
    Optional<Department> findById(Long id);
    List<Department> findAll();
    void deleteById(Department department);
}
