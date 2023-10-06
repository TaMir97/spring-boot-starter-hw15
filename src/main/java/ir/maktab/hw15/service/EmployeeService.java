package ir.maktab.hw15.service;


import ir.maktab.hw15.domain.Course;
import ir.maktab.hw15.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    Employee save(Employee employee);
    Employee update(Employee employee);
    Optional<Employee> findById(Long id);
    List<Employee> findAll();
    void deleteById(Employee employee);
}