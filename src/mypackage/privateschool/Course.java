package mypackage.privateschool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {

    private String title;
    private String stream;
    private String type;
    private LocalDate startDate;
    private LocalDate endDate;

    public Course(String stream) {
        this.stream = stream;
    }

    public Course() {
    }

     
    
    public Course(String title, String stream, String type, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public static Course courseDetails() {
        Scanner input = new Scanner(System.in);

        System.out.println("Write the Title of the course");
        String title = input.next();

        System.out.println("Write the stream of the course");
        String stream = input.next();

        System.out.println("Write the type of the course");
        String type = input.next();

        System.out.println("Write the Start Date of the course like: yyyy-MM-dd");
        String startDateString = input.next();
        LocalDate startDate = LocalDate.parse(startDateString);

        System.out.println("Write the End Date of the course like: yyyy-MM-dd");
        String endDateString = input.next();
        LocalDate endDate = LocalDate.parse(endDateString);

        Course c = new Course(title, stream, type, startDate, endDate);
        return c;
    }

    public static void allCourses(List<Course> listOfCoursesDetails) {
        for (Course x : listOfCoursesDetails) {
            System.out.println(x);
        }
    }

    
    @Override
    public String toString() {
        return "Course{" + "Title= " + title + ", Stream= " + stream + ", Type= " + type + ", StartDate= " + startDate + ", EndDate= " + endDate + '}';
    }
}
