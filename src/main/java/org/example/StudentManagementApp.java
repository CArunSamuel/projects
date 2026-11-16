package org.example;

import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();

        for(;;){
            System.out.println("\n 1.Add 2.Display Student Details 3.Search Student  4.Update Student Details. 5.Exit");
            System.out.print("\n Enter your choice : ");

            int choice = sc.nextInt();
            if(choice==1){
                studentManagement.addStudent();
            } else if (choice == 2) {
                studentManagement.displayAllStudents();
            }
            else if (choice == 3) {
                studentManagement.searchStudentById();
            }
            else if (choice == 4) {
                studentManagement.searchStudentByName();
            }
            else if (choice == 5) {
                studentManagement.updateStudent();
            } else if (choice == 6) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
