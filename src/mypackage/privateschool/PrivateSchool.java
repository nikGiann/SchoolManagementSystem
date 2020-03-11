package mypackage.privateschool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PrivateSchool {

    public static void main(String[] args) {
        List<Student> listOfStudents = new ArrayList();
        List<Student> listOfStudentsJavaFullTime = new ArrayList();
        List<Student> listOfStudentsJavaPartTime = new ArrayList();
        List<Student> listOfStudentsCFullTime = new ArrayList();
        List<Student> listOfStudentsCPartTime = new ArrayList();

        List<Course> listOfCourses = new ArrayList();

        List<Assignment> listOfAssignments = new ArrayList();
        List<Assignment> listOfAssignmentsJavaFullTime = new ArrayList();
        List<Assignment> listOfAssignmentsJavaPartTime = new ArrayList();
        List<Assignment> listOfAssignmentsCFullTime = new ArrayList();
        List<Assignment> listOfAssignmentsCPartTime = new ArrayList();

        List<Trainer> listOfTrainers = new ArrayList();
        List<Trainer> listOfTrainersJavaFullTime = new ArrayList();
        List<Trainer> listOfTrainersJavaPartTime = new ArrayList();
        List<Trainer> listOfTrainersCFullTime = new ArrayList();
        List<Trainer> listOfTrainersCPartTime = new ArrayList();

        Student s1 = new Student("Nikos", "Giannopoulos", LocalDate.of(1984, 01, 15), 2000);
        Student s2 = new Student("Ioanna", "Alexopoulou", LocalDate.of(1983, 05, 27), 1800);
        Student s3 = new Student("Petros", "Petrou", LocalDate.of(1986, 01, 23), 1600);
        Student s4 = new Student("Giannis", "Giannou", LocalDate.of(1988, 11, 15), 1900);
        Student s5 = new Student("Maria", "Maraki", LocalDate.of(1989, 01, 28), 2000);
        Student s6 = new Student("Sotiria", "Sotiriou", LocalDate.of(1984, 07, 25), 2200);
        Student s7 = new Student("Pavlos", "Pavlou", LocalDate.of(1992, 05, 20), 2000);
        Student s8 = new Student("jenia", "Jeniou", LocalDate.of(1984, 12, 15), 2500);
        Student s9 = new Student("Dionisis", "Dionisiou", LocalDate.of(1987, 05, 15), 1500);
        Student s10 = new Student("Areti", "Aretiou", LocalDate.of(1990, 04, 15), 800);
        Course javaFullTime = new Course("CB 9", "Java", "Full Time", LocalDate.of(2019, 10, 14), LocalDate.of(2020, 01, 22));
        Course javaPartTime = new Course("CB 10", "Java", "Part Time", LocalDate.of(2019, 10, 14), LocalDate.of(2020, 04, 30));
        Course cFullTime = new Course("CB 9", "C#", "Full Time", LocalDate.of(2019, 10, 14), LocalDate.of(2020, 01, 22));
        Course cPartTime = new Course("CB 10", "C#", "Part Time", LocalDate.of(2019, 10, 14), LocalDate.of(2020, 04, 30));
        Trainer t1 = new Trainer("Nikos", "Giannopoulos", "Java");
        Trainer t2 = new Trainer("Ioanna", "Alexopoulou", "C#");
        Trainer t3 = new Trainer("Petros", "Petrou", "C# and Python");
        Assignment a1 = new Assignment("Java Project", "Java Project Full Time 1", LocalDate.of(2019, 11, 03), 0.0, 0.0);
        Assignment a2 = new Assignment("Java Project", "Java Project Part Time 1", LocalDate.of(2019, 12, 10), 0.0, 0.0);
        Assignment a3 = new Assignment("Java Project", "Java Project Full Time 2", LocalDate.of(2020, 01, 20), 0.0, 0.0);
        Assignment a4 = new Assignment("C# Project", "C# Project Full Time 1", LocalDate.of(2019, 11, 03), 0.0, 0.0);
        Assignment a5 = new Assignment("C# Project", "C# Project Part Time 1", LocalDate.of(2019, 12, 10), 0.0, 0.0);
        Assignment a6 = new Assignment("C# Project", "C# Project Full Time 3", LocalDate.of(2020, 01, 20), 0.0, 0.0);

        listOfStudents.add(s1);
        listOfStudents.add(s2);
        listOfStudents.add(s3);
        listOfStudents.add(s4);
        listOfStudents.add(s5);
        listOfStudents.add(s6);
        listOfStudents.add(s7);
        listOfStudents.add(s8);
        listOfStudents.add(s9);
        listOfStudents.add(s10);

        listOfStudentsJavaFullTime.add(s1);
        listOfStudentsJavaFullTime.add(s3);
        listOfStudentsJavaFullTime.add(s5);
        listOfStudentsJavaPartTime.add(s1);
        listOfStudentsJavaPartTime.add(s10);
        listOfStudentsJavaPartTime.add(s9);
        listOfStudentsJavaPartTime.add(s4);
        listOfStudentsCFullTime.add(s6);
        listOfStudentsCFullTime.add(s7);
        listOfStudentsCFullTime.add(s2);
        listOfStudentsCPartTime.add(s8);
        listOfStudentsCPartTime.add(s9);
        listOfStudentsCPartTime.add(s1);
        listOfStudentsCPartTime.add(s10);

        listOfCourses.add(javaFullTime);
        listOfCourses.add(javaPartTime);
        listOfCourses.add(cFullTime);
        listOfCourses.add(cPartTime);

        listOfTrainersJavaFullTime.add(t1);
        listOfTrainersJavaPartTime.add(t1);
        listOfTrainersCFullTime.add(t2);
        listOfTrainersCPartTime.add(t3);

        listOfAssignmentsJavaFullTime.add(a1);
        listOfAssignmentsJavaPartTime.add(a2);
        listOfAssignmentsJavaFullTime.add(a3);
        listOfAssignmentsCFullTime.add(a4);
        listOfAssignmentsCPartTime.add(a5);
        listOfAssignmentsCFullTime.add(a6);

        List<StudentsPerCourse> listOfStudentsPerCourse = new ArrayList();
        StudentsPerCourse studentJavaFullTime = new StudentsPerCourse(javaFullTime);  //Arxikopoiei thn lista per javaFulltime
        StudentsPerCourse studentJavaPartTime = new StudentsPerCourse(javaPartTime);
        StudentsPerCourse studentCFullTime = new StudentsPerCourse(cFullTime);
        StudentsPerCourse studentCPartTime = new StudentsPerCourse(cPartTime);

        
 
        //Start from Here!!!
        
        Scanner input = new Scanner(System.in);
        Control.menu();

        int userChoice = 0;
        int courseChoice = 0;
        int signUpChoice = 0;
        int studentListChoice = 0;
        int trainerListChoice = 0;

        while (userChoice != 5) {  //To bgazw an thelw na stamataei

            userChoice = input.nextInt();

            switch (userChoice) {

                case 1:

                    System.out.println("Please select the Course you want to sign up");
                    Control.menuCourses();

                    courseChoice = input.nextInt();

                    switch (courseChoice) {
                        case 1:
                            System.out.println("You selected Java Full Time");

                            System.out.println("Please select what do you want to sign up");
                            Control.menu2();

                            signUpChoice = input.nextInt();

                            switch (signUpChoice) {
                                case 1:
                                    System.out.println("You selected to Sign up a Student");
                                    Student s = Control.studentDetails();
                                    listOfStudents.add(s);
                                    listOfStudentsJavaFullTime.add(s);

                                    break;
                                case 2:
                                    System.out.println("You selected to Sign up a Trainer");
                                    Trainer t = Control.trainerDetails();
                                    listOfTrainers.add(t);
                                    listOfTrainersJavaFullTime.add(t);

                                    break;
                                case 3:
                                    System.out.println("You selected to Sign up an Assignment");
                                    Assignment a = Control.assignmentDetails();
                                    listOfAssignments.add(a);
                                    listOfAssignmentsJavaFullTime.add(a);

                                    break;
                                case 4:
                                    System.out.println("Exit selected");

                                    break;
                                default:
                                    System.out.println("Invalid selection, Make a new choise.");

                                    break;
                            }
                            break;

                        case 2:
                            System.out.println("You selected Java Part Time");

                            System.out.println("Please select what do you want to sign up");
                            Control.menu2();
                            signUpChoice = input.nextInt();
                            switch (signUpChoice) {
                                case 1:
                                    System.out.println("You selected to Sign up a Student");

                                    Student s = Control.studentDetails();
                                    listOfStudents.add(s);
                                    listOfStudentsJavaPartTime.add(s);

                                    break;
                                case 2:
                                    System.out.println("You selected to Sign up a Trainer");
                                    Trainer t = Control.trainerDetails();
                                    listOfTrainers.add(t);
                                    listOfTrainersJavaPartTime.add(t);

                                    break;
                                case 3:
                                    System.out.println("You selected to Sign up an Assignment");
                                    Assignment a = Control.assignmentDetails();
                                    listOfAssignments.add(a);
                                    listOfAssignmentsJavaPartTime.add(a);
                                case 4:
                                    System.out.println("Exit selected");

                                    break;
                                default:
                                    System.out.println("Invalid selection, Make a new choise.");
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("You selected C# Full Time");

                            System.out.println("Please select what do you want to sign up");
                            Control.menu2();
                            signUpChoice = input.nextInt();
                            switch (signUpChoice) {
                                case 1:
                                    System.out.println("You selected to Sign up a Student");

                                    Student s = Control.studentDetails();
                                    listOfStudents.add(s);
                                    listOfStudentsCFullTime.add(s);

                                    break;
                                case 2:
                                    System.out.println("You selected to Sign up a Trainer");
                                    Trainer t = Control.trainerDetails();
                                    listOfTrainers.add(t);
                                    listOfTrainersCFullTime.add(t);

                                    break;
                                case 3:
                                    System.out.println("You selected to Sign up an Assignment");
                                    Assignment a = Control.assignmentDetails();
                                    listOfAssignments.add(a);
                                    listOfAssignmentsCFullTime.add(a);

                                    break;
                                case 4:
                                    System.out.println("Exit selected");

                                    break;
                                default:
                                    System.out.println("Invalid selection, Make a new choise.");

                                    break;
                            }

                            break;
                        case 4:
                            System.out.println("You selected C# Part Time");
                            System.out.println("Please select what do you want to sign up");
                            Control.menu2();
                            signUpChoice = input.nextInt();
                            switch (signUpChoice) {
                                case 1:
                                    System.out.println("You selected to Sign up a Student");

                                    Student s = Control.studentDetails();
                                    listOfStudents.add(s);
                                    listOfStudentsCPartTime.add(s);

                                    break;
                                case 2:
                                    System.out.println("You selected to Sign up a Trainer");
                                    Trainer t = Control.trainerDetails();
                                    listOfTrainers.add(t);
                                    listOfTrainersCPartTime.add(t);

                                    break;
                                case 3:
                                    System.out.println("You selected to Sign up an Assignment");
                                    Assignment a = Control.assignmentDetails();
                                    listOfAssignments.add(a);
                                    listOfAssignmentsCPartTime.add(a);

                                    break;
                                case 4:
                                    System.out.println("Exit selected");

                                    break;
                                default:
                                    System.out.println("Invalid selection, Make a new choise.");

                                    break;
                            }

                            break;
                        case 5:
                            System.out.println("Exit selected");

                            break;
                        default:
                            System.out.println("Invalid selection, Make a new choise.");

                            break;
                    }

                    break;
                case 2:
                    System.out.println("Please select a search");
                    Control.menuStudents();
                    studentListChoice = input.nextInt();
                    switch (studentListChoice) {
                        case 1:
                            System.out.println("You selected All Students");
                            for (Student x : listOfStudents) {
                                System.out.println(x);
                            }

                            break;
                        case 2:
                            System.out.println("You selected Students of Java Full Time");
                            for (Student x : listOfStudentsJavaFullTime) {
                                System.out.println(x);
                            }

                            break;
                        case 3:
                            System.out.println("You selected Students of Java Part Time");
                            for (Student x : listOfStudentsJavaPartTime) {
                                System.out.println(x);
                            }

                            break;
                        case 4:
                            System.out.println("You selected Students of C# Full Time");
                            for (Student x : listOfStudentsCFullTime) {
                                System.out.println(x);
                            }

                            break;
                        case 5:
                            System.out.println("You selected Students of C# Part Time");
                            for (Student x : listOfStudentsCPartTime) {
                                System.out.println(x);
                            }

                            break;
                        case 6:
                            System.out.println("You selected Students with more than one courses");

                            List<Student> allListOfStudents = new ArrayList<>();
                            allListOfStudents.addAll(listOfStudentsJavaFullTime);
                            allListOfStudents.addAll(listOfStudentsJavaPartTime);
                            allListOfStudents.addAll(listOfStudentsCFullTime);
                            allListOfStudents.addAll(listOfStudentsCPartTime);

                            Set<Student> set = new HashSet<>();
                            Set<Student> StudentsMoreThanOneCourse = new HashSet<>();

                            for (Student x : allListOfStudents) {
                                if (!set.add(x)) {
                                    StudentsMoreThanOneCourse.add(x);
                                }
                            }
                            //System.out.println(set);
                            for (Student x : StudentsMoreThanOneCourse) {
                                System.out.println(x);
                            }
                            break;
                        case 7:
                            System.out.println("Exit selected");
                            break;
                        default:
                            System.out.println("Invalid selection, Make a new choise.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Please select a search");
                    Control.menuTrainers();
                    trainerListChoice = input.nextInt();
                    switch (trainerListChoice) {
                        case 1:
                            System.out.println("You selected all Trainers");
                            for (Trainer x : listOfTrainers) {
                                System.out.println(x);
                            }
                            break;
                        case 2:
                            System.out.println("You selected Trainers of Java Full Time");
                            for (Trainer x : listOfTrainersJavaFullTime) {
                                System.out.println(x);
                            }
                            break;
                        case 3:
                            System.out.println("You selected Trainers of java Part Time");
                            for (Trainer x : listOfTrainersJavaPartTime) {
                                System.out.println(x);
                            }
                            break;
                        case 4:
                            System.out.println("You selected Trainers of C# Full Time");
                            for (Trainer x : listOfTrainersCFullTime) {
                                System.out.println(x);
                            }
                            break;
                        case 5:
                            System.out.println("You selected Trainers of C# Part Time");
                            for (Trainer x : listOfTrainersCPartTime) {
                                System.out.println(x);
                            }

                            break;

                        case 6:
                            System.out.println("Exit selected");

                            break;
                        default:
                            System.out.println("Invalid selection, Make a new choise.");

                            break;
                    }

                    break;

                case 4:

                    break;
                case 5:
                    System.out.println("Exit selected");

                    break;

                default:
                    System.out.println("Invalid selection, Make a new choise.");

                    break;
            }

            Control.menu();
        }
    }

}
