package ir.maktab.hw15.repository;


import ir.maktab.hw15.domain.Student;
import ir.maktab.hw15.domain.enums.StudentState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findStudentByFirstnameAndLastname (String firstName, String lastName);
    @Query("from Student s where s.studentState=:studentState")
    List<Student> findAllByStudentState(StudentState studentState);

}
