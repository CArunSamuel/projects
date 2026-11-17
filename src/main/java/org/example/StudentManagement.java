package org.example;

import java.util.*;

public class StudentManagement {

    Scanner sc = new Scanner(System.in);
    Student[] students = new Student[10];
    int count = 0;

    public void addStudent() {

        if (count == students.length) {
            System.out.println("Student Storage is Full");
            return;
        }

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter the Student Email: ");
        String email = sc.nextLine();

        System.out.print("Enter the Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter the Course: ");
        String course = sc.nextLine();

       students[count++] = new Student(id, name,age, email, course);
       System.out.println("New Student has been added!");
       System.out.println("Number of students in the system: " + count);
    }

    public void displayAllStudents() {
        for (int i = 0; i < count; i++) {

            Student student = students[i];
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Email: " + student.getEmail());
            System.out.println("Student Age: " + student.getAge());
            System.out.println("Student Course: " + student.getCourse());
            System.out.println("----------------------");

        }
    }
    public void searchStudentById() {

        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            Student student = students[i];

            if(student.getId() == id) {
                System.out.println("Student Found: " + student.getId());
                return;
            }
        }
        System.out.println("Student not found");
    }

    public void searchStudentByName() {

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();

        for (int i = 0; i < count; i++) {

            Student student = students[i];

            if(student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student Found: " + student.getName());
                return;
            }
        }
    }

    public void updateStudent() {

        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            Student student = students[i];
            if(student.getId() == id) {

                System.out.println("New Name: ");
                String name = sc.nextLine();

                System.out.println("New Email: ");
                String email = sc.nextLine();

                System.out.println("New Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.println("New Course: ");
                String course = sc.nextLine();

                student.setName(name);
                student.setEmail(email);
                student.setAge(age);
                student.setCourse(course);

                System.out.println("Student Updated successfully");
                return;

            }
        }

    }
}
