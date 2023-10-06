package ir.maktab.hw15.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ir.maktab.hw15.base.BaseEntity;
import ir.maktab.hw15.domain.enums.CourseState;


@Entity
@Getter
@Setter
@Table(name = "student_taken_course")
public class StudentTakenCourse extends BaseEntity<Long> {
    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH})
    @JoinColumn(name = "released_course_id")
    private ReleasedCourse releasedCourse;

    private Double mark;

    @Enumerated(EnumType.STRING)
    @Column(name = "course_state")
    private CourseState courseState;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH})
    private Student student;

    public StudentTakenCourse(ReleasedCourse releasedCourse, Double mark, CourseState courseState, Student student) {
        this.releasedCourse = releasedCourse;
        this.mark = mark;
        this.courseState = courseState;
        this.student = student;
    }

    public StudentTakenCourse() {

    }

    private void setCourseState(){
        if (this.mark < 10){
            this.courseState = CourseState.FAILED;
        } else
            this.courseState = CourseState.PASSED;
    }


}
