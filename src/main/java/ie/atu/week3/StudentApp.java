package ie.atu.week3;

import java.io.*;


import java.util.Scanner;



public class StudentApp {
    static void main() {
        int count = 0;
        boolean check;

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
                check=checkFile(email);
                student.setEmail(email);
            }while (check);


            //inputs course name
            System.out.println("Please enter your course name: ");
            String course = scan1.next();
            student.setCourse(course);

            try(PrintWriter out = new PrintWriter(new FileWriter("Student.txt", true)))//if file valid
            {
                out.println(student);
                System.out.println("saved to " + "Student.txt");
            }
            catch(IOException ex)//if error occurs
            {
                System.out.println("Could not write to file: " + ex.getMessage());
            }
            //increments count
            count++;
        }

        //displays student data

        showFile();

    }
    static void showFile() {
        BufferedReader br = null;
        try {
            FileReader neverUsed = new FileReader("student.txt");//finds file
            br = new BufferedReader(neverUsed);
            System.out.println("Contents of student.txt:");
            String line;
            while ((line = br.readLine()) != null) {//prints till file empty
                System.out.println(" - " + line);
            }
        } catch (IOException ex) {//error if file not found
            System.out.println("Could not read file: " + ex.getMessage());
        } finally {
            if (br != null) {//closes file
                try {
                    br.close();
                } catch (IOException ex) {//error if file not closed
                    System.out.println("Could not close file: " + ex.getMessage());
                }
            }
        }
    }
    static boolean checkFile(String email) {
        BufferedReader br = null;
        try {
            FileReader neverUsed = new FileReader("student.txt");//finds file
            br = new BufferedReader(neverUsed);
            String line;

            while ((line = br.readLine()) != null) {//prints till file empty
                if(line.contains(email))
                {
                    System.out.println("Sorry, email already in use, please enter a new email");
                    return true;
                }
            }
            return false;
        } catch (IOException ex) {//error if file not found
            System.out.println("Could not read file: " + ex.getMessage());
        } finally {
            if (br != null) {//closes file
                try {
                    br.close();
                } catch (IOException ex) {//error if file not closed
                    System.out.println("Could not close file: " + ex.getMessage());
                }
            }
        }
        return true;
    }
}
