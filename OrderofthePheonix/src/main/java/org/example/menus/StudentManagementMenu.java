package org.example.menus;
import java.util.Scanner;

public class StudentManagementMenu {
    public int studentMenu() {

        Scanner input = new Scanner(System.in);
        System.out.println("Student Management...\n");
        System.out.println("[1] Add Student");
        System.out.println("[1] Remove Student");
        System.out.println("[2] Update Student");
        System.out.println("[3] View Student Details");
        System.out.println("[0] Main Menu");

        int numberStudent = input.nextInt();

        return numberStudent;
    }
}
