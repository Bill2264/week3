package ie.atu.week3;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class StudentApp {
    static void main(String [] args) {
        int count = 0;

        List<Student> students = new ArrayList<>();
        Scanner scan1 = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Please enter the number of students: ");
        int totalStudents = scan1.nextInt();

        while(count<totalStudents)
        {
            System.out.println("Please enter your name: ");
            String name = scan1.next();
            System.out.println("Please enter your email: ");
            String email = scan1.next();
            System.out.println("Please enter your course name: ");
            String course = scan1.next();
            student.addStudent(name, email, course);
            students.add(student);
            count++;
        }
    }


}
