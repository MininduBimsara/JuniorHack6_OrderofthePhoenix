package org.example.menus;
import java.util.Scanner;

public class StudentAllocationManagementMenu {
    public int studentAllocationMenu() {

        Scanner input = new Scanner(System.in);
        System.out.println("Student Allocation Management...\n");
        System.out.println("[1] Allocate a Room to a Student");
        System.out.println("[1] Delete an Allocation");
        System.out.println("[1] View an Allocation");
        System.out.println("[0] Main Menu");

        int numberStudentAllocation = input.nextInt();

        return numberStudentAllocation;
    }
}
