package codSoftTask5;

import java.util.Scanner;

public class StudentManagementSystemApp {
    public static void main(String[] args) {
    	StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add a new student");
            System.out.println("2. Remove a student");
            System.out.println("3. Search for a student");
            System.out.println("4. Display all students");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    String rollNumber = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    String grade = scanner.nextLine();
                    Student student = new Student(name, rollNumber, grade);
                    sms.addStudent(student);
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    System.out.print("Enter roll number to remove: ");
                    String removeRollNumber = scanner.nextLine();
                    sms.removeStudent(removeRollNumber);
                    System.out.println("Student removed successfully!");
                    break;
                case 3:
                    System.out.print("Enter roll number to search: ");
                    String searchRollNumber = scanner.nextLine();
                    Student foundStudent = sms.searchStudent(searchRollNumber);
                    if (foundStudent != null) {
                        System.out.println("Student found:");
                        System.out.println("Name: " + foundStudent.name);
                        System.out.println("Roll Number: " + foundStudent.rollNumber);
                        System.out.println("Grade: " + foundStudent.grade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    sms.displayAllStudents();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
