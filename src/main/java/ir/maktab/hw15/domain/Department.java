package ir.maktab.hw15.domain;


import ir.maktab.hw15.base.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Department extends BaseEntity<Long> {

    @Column(name = "department_name")
    private String departmentName;

    public Department() {
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }


}
