package ir.maktab.hw15.service.impl;


import ir.maktab.hw15.domain.Student;
import ir.maktab.hw15.domain.enums.StudentState;
import ir.maktab.hw15.repository.StudentRepository;
import ir.maktab.hw15.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteById(Student student) {
        studentRepository.deleteById(student.getId());
    }

    @Override
    public Student findStudentByFirstnameAndLastname(String firstName, String lastName) {
        return studentRepository.findStudentByFirstnameAndLastname(firstName, lastName);
    }

    @Override
    public List<Student> findAllByStudentState(StudentState studentState) {
        return studentRepository.findAllByStudentState(studentState);
    }
}
