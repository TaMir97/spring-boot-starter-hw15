package ir.maktab.hw15.service.impl;

import ir.maktab.hw15.domain.Department;
import ir.maktab.hw15.repository.DepartmentRepository;
import ir.maktab.hw15.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public Department save(Department department) {
       return departmentRepository.save(department);
    }

    @Override
    public Department update(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public Optional<Department> findById(Long id) {
        return departmentRepository.findById(id);
    }

    @Override
    public List<Department> findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public void deleteById(Department department) {
        departmentRepository.deleteById(department.getId());
    }
}
