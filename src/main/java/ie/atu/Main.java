package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Student1
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

        //Student2
        System.out.println("\nEnter details for the second student:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Email: ");
        String email2 = scanner.nextLine();
        System.out.print("Course: ");
        String course2 = scanner.nextLine();

        StudentApp student2 = new StudentApp(name2);
        student2.setEmail(email2);
        student2.setCourse(course2);

        //Student3
        System.out.println("\nEnter details for the third student:");
        System.out.print("Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Email: ");
        String email3 = scanner.nextLine();
        System.out.print("Course: ");
        String course3 = scanner.nextLine();

        StudentApp student3 = new StudentApp(name3, email3, course3);

        System.out.println("\nDetails of all students:");
        displayStudentDetails(student1);
        displayStudentDetails(student2);
        displayStudentDetails(student3);

        scanner.close();
    }

    public static void displayStudentDetails(StudentApp student) {
        System.out.println("\n\nName: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("Course: " + student.getCourse());
    }
}