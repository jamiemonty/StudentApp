package ie.atu;

import java.sql.SQLOutput;

public class StudentApp {
    private String name;
    private String email;
    private String course;

    public StudentApp(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public void displayInfo(){
        System.out.println("Name is: " + name + "\nEmail is: " + email + "\nCourse is: " + course);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
