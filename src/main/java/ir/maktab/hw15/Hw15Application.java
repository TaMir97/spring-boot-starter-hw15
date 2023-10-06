package ir.maktab.hw15;

import ir.maktab.hw15.domain.*;
import ir.maktab.hw15.domain.enums.CourseState;
import ir.maktab.hw15.domain.enums.Season;
import ir.maktab.hw15.domain.enums.StudentState;
import ir.maktab.hw15.domain.enums.TeacherLevel;
import ir.maktab.hw15.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class Hw15Application implements CommandLineRunner {
    private final DepartmentService departmentService;
    private final CourseService courseService;
    private final EmployeeService employeeService;
    private final PersonService personService;
    private final ReleasedCourseService releasedCourseService;
    private final SemesterService semesterService;
    private final StudentService studentService;
    private final StudentTakenCourseService studentTakenCourseService;
    private final TeacherService teacherService;



    public static void main(String[] args) {
        SpringApplication.run(Hw15Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Department department = new Department("Math");
        departmentService.save(department);

        Course course = new Course("math",3,department);
        courseService.saveCourse(course);

        ReleasedCourse releasedCourse = new ReleasedCourse();
        releasedCourse.setCourse(course);

        Semester semester = new Semester(Season.FALL,1398);
        semesterService.save(semester);

        releasedCourse.setSemester(semester);

        Teacher teacher = new Teacher(24,
                100000L,
                TeacherLevel.ADJUNCT,
                100000L,
                department,
                List.of(releasedCourse));

        releasedCourse.setTeacher(teacher);
        teacherService.save(teacher);
        releasedCourseService.save(releasedCourse);

        Student student = new Student();

        student.setStudentState(StudentState.ENROLLED);
        studentService.save(student);
        releasedCourseService.save(releasedCourse);


        StudentTakenCourse studentTakenCourse = new StudentTakenCourse(releasedCourse,
                12.5,
                CourseState.PASSED,
                student);

        student.setStudentTakenCourseList(List.of(studentTakenCourse));
        studentTakenCourseService.save(studentTakenCourse);



        studentService.findAllByStudentState(StudentState.ENROLLED).forEach(System.out::println);

    }
}
