package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for the first student:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Email: ");
        String email1 = scanner.nextLine();
        System.out.print("Course: ");
        String course1 = scanner.nextLine();

        StudentApp student1 = new StudentApp(name1);
        student1.setEmail(email1);
        student1.setCourse(course1);

        System.out.println("\nDetails of all students:");
        displayStudentDetails(student1);

        scanner.close();
    }

    public static void displayStudentDetails(StudentApp student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Course: " + student.getCourse());
    }
}