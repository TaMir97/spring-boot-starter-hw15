package ir.maktab.hw15.domain;

import ir.maktab.hw15.base.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "released_course")
public class ReleasedCourse extends BaseEntity<Long> {

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE})
    private Teacher teacher;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE})
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE})
    @JoinColumn(name = "semester_id")
    private Semester semester;

    public ReleasedCourse(Teacher teacher, Course course, Semester semester) {
        this.teacher = teacher;
        this.course = course;
        this.semester = semester;
    }

    public ReleasedCourse() {

    }
}
