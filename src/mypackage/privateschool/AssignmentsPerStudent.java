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
public class AssignmentsPerStudent {
    private Student student;
    //List<Assignment> listOfAssignments;
    private Assignment assignment;

    
//    public AssignmentsPerStudent(Student student) {
//        this.student = student;
//        this.assignment = assignment;
//    }

    public Student getStudent() {
        return student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

//    public List<Assignment> getListOfAssignments() {
//        return listOfAssignments;
//    }
//
//    public void setListOfAssignments(List<Assignment> listOfAssignments) {
//        this.listOfAssignments = listOfAssignments;
//    }

    @Override
    public String toString() {
        return "AssignmentsPerStudent{" + "student=" + student + ", Assignment=" + assignment + '}';
    }
    
    
}
