package org.example.InputHandler;

import org.example.Services.HostelService;
import org.example.Services.RoomService;
import org.example.Services.StudentAllocationService;
import org.example.Services.StudentService;
import org.example.Utils.DatabaseIntegration;

import java.sql.Connection;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StudentAllocationInputHandler implements InputHandler{

    Connection conn = DatabaseIntegration.getConnection();

    @Override
    public void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Student Management...\n\n");
        System.out.println("student id (ex: abc001)\n\n");
        String studentId = input.nextLine();

        StudentService studentService = new StudentService();
        studentService.getStudent(studentId,conn);

        System.out.println("Hostel ID (ex: abc001)\n\n");
        String hostalId = input.nextLine();
        RoomService roomService = new RoomService();
        roomService.viewRoom(hostalId,conn);

        System.out.println("Choose a room to allocate(roomID): \n\n");
        String roomId = input.nextLine();
        StudentAllocationService studentAllocationService = new StudentAllocationService();

    }

    @Override
    public void update() {


    }

    @Override
    public void view() {
        Scanner input = new Scanner(System.in);
        System.out.println("student id (ex: abc001)\n\n");
        String studentId = input.nextLine();

        StudentAllocationService studentAllocationService = new StudentAllocationService();
        studentAllocationService.getHostel(studentId,conn);

    }

    @Override
    public void remove() {

    }
}
