package ir.maktab.hw15.service.impl;

import ir.maktab.hw15.domain.ReleasedCourse;
import ir.maktab.hw15.repository.ReleasedCourseRepository;
import ir.maktab.hw15.service.ReleasedCourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ReleasedCourseServiceImpl implements ReleasedCourseService {
    private final ReleasedCourseRepository releasedCourseRepository;


    @Override
    public ReleasedCourse save(ReleasedCourse releasedCourse) {
        return releasedCourseRepository.save(releasedCourse);
    }

    @Override
    public ReleasedCourse update(ReleasedCourse releasedCourse) {
        return releasedCourseRepository.save(releasedCourse);
    }

    @Override
    public Optional<ReleasedCourse> findById(Long id) {
        return releasedCourseRepository.findById(id);
    }

    @Override
    public List<ReleasedCourse> findAll() {
        return releasedCourseRepository.findAll();
    }

    @Override
    public void deleteById(ReleasedCourse releasedCourse) {
        releasedCourseRepository.deleteById(releasedCourse.getId());
    }
}