package ir.maktab.hw15.domain;

import ir.maktab.hw15.base.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Course extends BaseEntity<Long> {


    private String title;

    private Integer credit;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE})
    @JoinColumn(name = "course_department_id")
    private Department courseDepartment;

    public Course() {
    }

    public Course(String title, Integer credit, Department courseDepartment) {
        this.title = title;
        this.credit = credit;
        this.courseDepartment = courseDepartment;
    }
}
