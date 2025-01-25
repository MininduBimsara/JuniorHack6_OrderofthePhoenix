package org.example.menus;
import java.util.Scanner;

public class StudentAllocationManagementMenu {
    public int studentAllocationMenu() {

        Scanner input = new Scanner(System.in);
        System.out.println("Student Allocation Management...\n\n");
        System.out.println("[1] Allocate a Room to a Student\n\n");
        System.out.println("[1] Delete an Allocation\n\n");
        System.out.println("[1] View an Allocation\n\n");
        System.out.println("[0] Main Menu\n\n");

        int numberStudentAllocation = input.nextInt();

        return numberStudentAllocation;
    }
}
