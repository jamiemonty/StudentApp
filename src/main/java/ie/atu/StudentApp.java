package ie.atu;

import java.util.Scanner;

public class StudentApp {
    private String name;
    private String email;
    private String course;

    public StudentApp(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public StudentApp(String name) {
        this.name = name;
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
