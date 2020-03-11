/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage.privateschool;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikos
 */
public class AssignmentsPerCourse {
    private Course course;
    private List<Assignment> listOfAssignments;

    public AssignmentsPerCourse(Course course) {
        this.course = course;
        this.listOfAssignments = new ArrayList();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Assignment> getListOfAssignments() {
        return listOfAssignments;
    }

    public void setListOfAssignments(List<Assignment> listOfAssignments) {
        this.listOfAssignments = listOfAssignments;
    }

    @Override
    public String toString() {
        return "AssignmentsPerCourse{" + "course=" + course + ", listOfAssignments=" + listOfAssignments + '}';
    }
    
    
    
    
    
}
