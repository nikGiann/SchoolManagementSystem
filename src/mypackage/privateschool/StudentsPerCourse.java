package mypackage.privateschool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentsPerCourse {

    private Course course;
    private List<Student> listOfStudents;

    public StudentsPerCourse() {
    }

    public StudentsPerCourse(Course course) {
        this.course = course;
        listOfStudents = new ArrayList();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    @Override
    public String toString() {
        return "StudentsPerCourse{" + "course=" + course + ", listOfStudents=" + listOfStudents + '}';
    }

}
