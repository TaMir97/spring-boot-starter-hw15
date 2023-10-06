package ir.maktab.hw15.service.impl;

import ir.maktab.hw15.domain.Employee;
import ir.maktab.hw15.domain.Semester;
import ir.maktab.hw15.repository.SemesterRepository;
import ir.maktab.hw15.service.SemesterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SemesterServiceImpl implements SemesterService {
    private final SemesterRepository semesterRepository;


    @Override
    public Semester save(Semester semester) {
        return semesterRepository.save(semester);
    }

    @Override
    public Semester update(Semester semester) {
        return semesterRepository.save(semester);
    }

    @Override
    public Optional<Semester> findById(Long id) {
        return semesterRepository.findById(id);
    }

    @Override
    public List<Semester> findAll() {
        return semesterRepository.findAll();
    }

    @Override
    public void deleteById(Semester semester) {
        semesterRepository.deleteById(semester.getId());
    }
}