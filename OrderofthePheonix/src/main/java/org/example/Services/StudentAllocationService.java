package org.example.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentAllocationService {

    public void allocateRoom(String student_id, String room_id,String date, Connection conn) {
        // Add a Student to the database
        String sql = "SELECT * FROM rooms WHERE room_id = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, room_id);
            preparedStatement.executeQuery();

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int roomNumber = resultSet.getInt("room_number");
                int capacity = resultSet.getInt("capacity");
                int availableCapacity = resultSet.getInt("available_capacity");
                if(availableCapacity > 0) {
                    String sql2 = "INSERT INTO allocations (allocation_id, student_id, room_id, date) VALUES (?, ?, ?, ?)";

                    try {
                        PreparedStatement preparedStatement2 = conn.prepareStatement(sql2);
                        preparedStatement2.setString(1, allocation_id);
                        preparedStatement2.setString(2, student_id);
                        preparedStatement2.setString(3, room_id);
                        preparedStatement2.setString(4, date);
                        preparedStatement2.executeUpdate();

                        System.out.println("Student Allocation added successfully");

                    } catch (SQLException e) {
                        System.out.println("An error occurred while adding a Student Allocation to the database " + e.getMessage());
                    }

                } else {
                    System.out.println("Room is full");
                }


            } else {
                System.out.println("Room not found");
            }

        } catch (SQLException e) {
            System.out.println("An error occurred while retrieving an Room from the database " + e.getMessage());
        }


    }

    public void deleteAllocation(String allocation_id, Connection conn) {
        // Delete a Student from the database
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

    public void updateStudent(String student_id, String name, int age,String department, Connection conn) {
        // Update a Student in the database
        String sql = "UPDATE students SET student_id = ?, name = ?, age = ?, department = ? WHERE student_id = ?";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, student_id);
            preparedStatement.setString(2, name);
            preparedStatement.setInt(3, age);
            preparedStatement.setString(4, department);
            preparedStatement.setString(5, student_id);
            preparedStatement.executeUpdate();
            System.out.println("Student updated successfully");
        } catch (SQLException e) {
            System.out.println("An error occurred while updating an student in the database " + e.getMessage());
        }
    }
    public void getHostel(String student_id, Connection conn) {
        // Get a Student from the database
        String sql = "SELECT * FROM students WHERE student_id = ?";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, student_id);
            preparedStatement.executeQuery();
            System.out.println("Studnet retrieved successfully");

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                int studentId = resultSet.getInt("student_id");
                String studentName = resultSet.getString("name");
                int studentAge = resultSet.getInt("age");
                int studentDepartment = resultSet.getInt("department");
                System.out.println("Student ID: " + studentId);
                System.out.println("Student Name: " + studentName);
                System.out.println("Student Age: " + studentAge);
                System.out.println("Student Department: " + studentDepartment );
            } else {
                System.out.println("Student not found");
            }

        } catch (SQLException e) {
            System.out.println("An error occurred while retrieving an Student from the database " + e.getMessage());
        }

    }

}
