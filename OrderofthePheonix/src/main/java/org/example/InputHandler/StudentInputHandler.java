package org.example.InputHandler;

import org.example.Services.HostelService;
import org.example.Services.StudentService;
import org.example.Utils.DatabaseIntegration;

import java.sql.Connection;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StudentInputHandler implements InputHandler{

    Connection conn = DatabaseIntegration.getConnection();

    @Override
    public void add() {

        Scanner input = new Scanner(System.in);
        System.out.println("Student Management...\n\n");
        System.out.println("[1] Add the student id (ex: abc001)\n\n");
        String studentId = input.nextLine();
        System.out.println("[2] Add the Student name\n\n");
        String studentName = input.nextLine();
        System.out.println("[3] Enter the age\n\n");
        String studentAge = input.nextLine();
        System.out.println("[3] Enter the Department\n\n");
        String studentDepartment = input.nextLine();
        System.out.println("[0] Main Menu\n\n");
        String Menu = input.nextLine();

        StudentService studentService = new StudentService();
        studentService.addStudent(studentId,studentName,parseInt(studentAge),studentDepartment,conn);
    }

    @Override
    public void update() {

        Scanner input = new Scanner(System.in);
        System.out.println("Student Management...\n\n");
        System.out.println("[1] Update the student id (ex: abc001)\n\n");
        String studentId = input.nextLine();
        System.out.println("[2] Update the Student name\n\n");
        String studentName = input.nextLine();
        System.out.println("[3] Update the age\n\n");
        String studentAge = input.nextLine();
        System.out.println("[3] Update the Department\n\n");
        String studentDepartment = input.nextLine();
        System.out.println("[0] Main Menu\n\n");
        String Menu = input.nextLine();

        StudentService studentService = new StudentService();
        studentService.updateStudent(studentId,studentName,parseInt(studentAge),studentDepartment,conn);
    }

    @Override
    public void view(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please Give me the ID of the Student...\n\n");
        String studentId = input.nextLine();
        StudentService studentService = new StudentService();
        studentService.getHostel(studentId,conn);
    }

    @Override
    public void delete() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Give me the ID of the Student...\n\n");
        String studentId = input.nextLine();

        StudentService studentService = new StudentService();
        studentService.removeStudent(studentId,conn);
    }
}
