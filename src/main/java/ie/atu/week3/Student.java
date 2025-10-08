package ie.atu.week3;


public class Student {
    String Name, Email, Course;

    public  Student()
    {
        Name = "";
        Email = "";
        Course = "";
    }
    public void addStudent(String tname,String temail,String tcourse) {
        Name = tname;
        Email = temail;
        Course = tcourse;
    }

}
