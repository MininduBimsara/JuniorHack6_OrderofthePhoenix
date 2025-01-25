package org.example.menus;
import java.util.Scanner;

public class StudentManagementMenu {
    public int studentMenu() {

        Scanner input = new Scanner(System.in);
        System.out.println("Student Management...\n\n");
        System.out.println("[1] Add Student\n\n");
        System.out.println("[1] Remove Student\n\n");
        System.out.println("[2] Update Student\n\n");
        System.out.println("[3] View Student Details\n\n");
        System.out.println("[0] Main Menu\n\n");

        int numberStudent = input.nextInt();

        return numberStudent;
    }
}
