
package mypackage.privateschool;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Control {
    
    public static void menu(){
        /**
         * **************************************************
         */
        System.out.println("|         MENU SELECTION              |");
        System.out.println("| Options:                            |");
        System.out.println("|        1. Chooce Course             |");
        System.out.println("|        2. Lists Of Students         |");
        System.out.println("|        3. Lists Of Trainers         |");
        System.out.println("|        4. Find Assignment by date   |");
        System.out.println("|        5. Exit                      |");
        
    }
    
    public static void menu2(){
        /**
         * **************************************************
         */
        System.out.println("|         MENU SELECTION             |");
        System.out.println("| Options:                           |");
        System.out.println("|        1. Sign up a Student        |");
        System.out.println("|        2. Sign up a Trainer        |");        
        System.out.println("|        3. Sign up an Assignement   |");
        System.out.println("|        4. Exit                     |");
        
    }
    
   public static void menuCourses(){
        System.out.println("|     MENU SELECTION Of Courses      |");
        System.out.println("| Options:                           |");
        System.out.println("|        1. Java Full Time           |");
        System.out.println("|        2. Java Part Time           |");
        System.out.println("|        3. C# Full Time             |");
        System.out.println("|        4. C# Part Time             |");
        System.out.println("|        5. Exit                     |");
        
   }
        
public static void menuStudents(){
        /**
         * **************************************************
         */
        System.out.println("|     MENU SELECTION of Students                 |");
        System.out.println("| Options:                                       |");
        System.out.println("|     1. All Students                            |");
        System.out.println("|     2. Students of Java Full Time              |");        
        System.out.println("|     3. Students of Java Part Time              |");
        System.out.println("|     4. Students of C# Full Time                |");
        System.out.println("|     5. Students of C# Part Time                |");        
        System.out.println("|     6. Students with more than one courses     |");
        System.out.println("|     7. Exit                                    |");
        }

public static void menuTrainers(){
    /**
         * **************************************************
         */
        System.out.println("|     MENU SELECTION of Students                 |");
        System.out.println("| Options:                                       |");
        System.out.println("|     1. All Trainers                            |");
        System.out.println("|     2. Trainers of Java Full Time              |");
        System.out.println("|     3. Trainers of java Part Time              |");
        System.out.println("|     4. Trainers of C# Full Time                |");
        System.out.println("|     5. Trainers of C# Part Time                |");
        System.out.println("|     6. Exit                                    |");
    
}

    public static void menuAssignments(){
        /**
         * **************************************************
         */
        System.out.println("|     MENU SELECTION of Assignments              |");
        System.out.println("| Options:                                       |");
        System.out.println("|     1. All Assignments                         |");
        System.out.println("|     2. Students of Java Full Time              |");        
        System.out.println("|     3. Students of Java Part Time              |");
        System.out.println("|     4. Students of C# Full Time                |");
        System.out.println("|     5. Students of c# Part Time                |");
        System.out.println("|     7. Exit                                    |");
        
    }
    
    public static Student studentDetails() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Write the Firstname of the student");
        String firstName = input.next();

        System.out.println("Write the Lastname of the student");
        String lastName = input.next();

        System.out.println("Write the Date of the student's Birth like: yyyy-MM-dd");
        String dateOfBirthString = input.next();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);

        System.out.println("Write the Tuition Fees of the student");
        double fees = input.nextInt();

        Student s = new Student(firstName, lastName, dateOfBirth, fees);
        return s;
    }
    
    public static Trainer trainerDetails() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Write the Firstname of the trainer");
        String firstName = input.next();

        System.out.println("Write the Lastname of the trainer");
        String lastName = input.next();

        System.out.println("Write the Subject of the trainer");
        String subject = input.next();

        Trainer t = new Trainer(firstName, lastName, subject);
        return t;

    }
    
    public static Assignment assignmentDetails() {

        Scanner input = new Scanner(System.in);
       
        System.out.println("Write the Title of the Assignment");
        String title = input.next();

        System.out.println("Write the description of the Assignment ");
        String description = input.next();

        System.out.println("Write the subDateTime of the Assignment like: yyyy-MM-dd");
        String subDateTimeString = input.next();
        LocalDate subDateTime = LocalDate.parse(subDateTimeString);

        System.out.println("Write the oral mark of the Assignment");
        double oralMark = input.nextInt();

        System.out.println("Write the total mark of the Assignment");
        double totalMark = input.nextInt();

        Assignment a = new Assignment(title, description, subDateTime, oralMark, totalMark);

        return a;

    }
    
   
    
    
    
}
