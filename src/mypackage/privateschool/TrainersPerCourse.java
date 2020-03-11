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
public class TrainersPerCourse {
    private Course course;
    List<Trainer> listOfTrainers;

    public TrainersPerCourse(Course course) {
        this.course = course;
        this.listOfTrainers =new ArrayList();
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Trainer> getListOfTrainers() {
        return listOfTrainers;
    }

    public void setListOfTrainers(List<Trainer> listOfTrainers) {
        this.listOfTrainers = listOfTrainers;
    }

    @Override
    public String toString() {
        return "TrainersPerCourse{" + "course=" + course + ", listOfTrainers=" + listOfTrainers + '}';
    }
    
    
    
}
