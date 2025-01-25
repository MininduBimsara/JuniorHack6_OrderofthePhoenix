package org.example.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentAllocationService {

    public void allocateRoom(String allocation_id, String student_id, String room_id,String date, Connection conn) {
        // Add a allocation to the database
        String sql = "INSERT INTO allocations (allocation_id, student_id, room_id, date) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, allocation_id);
            preparedStatement.setString(2, student_id);
            preparedStatement.setString(3, room_id);
            preparedStatement.setString(4, date);
            preparedStatement.executeUpdate();

            System.out.println("Student Allocation added successfully");
        } catch (SQLException e) {
            System.out.println("An error occurred while adding a Student Allocation to the database " + e.getMessage());
        }

    }

    public void deleteAllocation(String allocation_id, Connection conn) {
        // Delete a allocation from the database
        String sql = "DELETE FROM allocations WHERE allocation_id = ?";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, allocation_id);
            preparedStatement.executeUpdate();
            System.out.println("Deleted allocation successfully");
        } catch (SQLException e) {
            System.out.println("An error occurred while deleting an allocation from the database " + e.getMessage());
        }

    }

    public void getHostel(String allocation_id, Connection conn) {
        // Get a allocation from the database
        String sql = "SELECT * FROM allocations WHERE allocation_id = ?";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, allocation_id);
            preparedStatement.executeQuery();
            System.out.println("Allocation retrieved successfully");

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String allocationId = resultSet.getString("allocation_id");
                String studentId = resultSet.getString("student_id");
                String roomId = resultSet.getString("room_id");
                String date = resultSet.getString("date");
                System.out.println("Allocation ID: " + allocationId);
                System.out.println("Student ID: " + studentId);
                System.out.println("Room ID: " + roomId);
                System.out.println("Date: " + date);
            } else {
                System.out.println("Allocation not found");
            }

        } catch (SQLException e) {
            System.out.println("An error occurred while retrieving an allocation from the database " + e.getMessage());
        }

    }

}
