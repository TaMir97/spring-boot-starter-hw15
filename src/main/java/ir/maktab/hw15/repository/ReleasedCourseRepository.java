package ir.maktab.hw15.repository;

import ir.maktab.hw15.domain.ReleasedCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleasedCourseRepository extends JpaRepository<ReleasedCourse, Long> {
}