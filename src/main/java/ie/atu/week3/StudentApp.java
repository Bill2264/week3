package ie.atu.week3;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class StudentApp {
    static void main(String [] args) {
        int count = 0;
        boolean check = false;

        List<Student> students = new ArrayList<>();//creates array list
        Scanner scan1 = new Scanner(System.in);



        System.out.println("Please enter the number of students: ");
        int totalStudents = scan1.nextInt();

        while (count < totalStudents) {
            Student student = new Student();

            //inputs name
            System.out.println("Please enter your name: ");
            String name = scan1.next();
            student.setName(name);

            //inputs email
            do {
                System.out.println("Please enter your email: ");
                String email = scan1.next();
                //verifies if email is not already in use
            for(Student s:students) {
                    if (s.getEmail().contains(email)) {
                        System.out.println("Sorry, email already in use, please enter a new email");
                        break;
                    }
                    check = false;
                }
                student.setEmail(email);
            }while (check);
            check = true;

            //inputs course name
            System.out.println("Please enter your course name: ");
            String course = scan1.next();
            student.setCourse(course);

            students.add(student);

            //increments count
            count++;
        }

        //displays student data
        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

    }
}
