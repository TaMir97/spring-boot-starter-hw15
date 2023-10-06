package ir.maktab.hw15.repository;


import ir.maktab.hw15.domain.StudentTakenCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentTakenCourseRepository extends JpaRepository<StudentTakenCourse, Long> {
}