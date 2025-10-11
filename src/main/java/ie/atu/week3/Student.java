package ie.atu.week3;


public class Student {
    private String Name, Email, Course;

    public  Student()
    {
        Name = "";
        Email = "";
        Course = "";
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCourse(String course) {
        Course = course;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getCourse() {
        return Course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Course='" + Course + '\'' +
                '}';
    }
}
