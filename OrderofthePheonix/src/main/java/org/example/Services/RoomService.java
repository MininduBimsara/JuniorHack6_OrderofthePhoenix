package org.example.Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoomService {

    public void addRoom(String room_id, String hostel_id, int room_number, int capacity, Connection conn) {
        // Add a Room to the database
        String sql = "INSERT INTO rooms (room_id, hostal_id, room_number, capacity, available_capacity) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, room_id);
            preparedStatement.setString(2, hostel_id);
            preparedStatement.setInt(3, room_number);
            preparedStatement.setInt(4, capacity);
            preparedStatement.setInt(5, capacity);
            preparedStatement.executeUpdate();
            System.out.println("Room added successfully");
        } catch (SQLException e) {
            System.out.println("An error occurred while adding an Room to the database " + e.getMessage());
        }

    }

    public void deleteRoom(String room_id, Connection conn) {
        // Delete a Room from the database
        String sql = "DELETE FROM rooms WHERE room_id = ?";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, room_id);
            preparedStatement.executeUpdate();
            System.out.println("Room removed successfully");
        } catch (SQLException e) {
            System.out.println("An error occurred while deleting an room from the database " + e.getMessage());
        }

    }

    public void updateRoom(String room_id, String hostel_id, int room_number, int capacity, int avalable_capacity, Connection conn) {
        // Update a Room in the database
        String sql = "UPDATE students SET room_id = ?, hostel_id = ?, room_number = ?, capacity = ?, avalable_capacity = ?  WHERE room_id = ?";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, room_id);
            preparedStatement.setString(2, hostel_id);
            preparedStatement.setInt(3, room_number);
            preparedStatement.setInt(4, capacity);
            preparedStatement.setInt(5, avalable_capacity);
            preparedStatement.executeUpdate();
            System.out.println("Room updated successfully");
        } catch (SQLException e) {
            System.out.println("An error occurred while updating an room in the database " + e.getMessage());
        }
    }
    public void viewRoom(String room_number, Connection conn) {
        // Get a Room from the database
        String sql = "SELECT * FROM rooms WHERE room_number = ?";

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, room_number);
            preparedStatement.executeQuery();
            System.out.println("Room retrieved successfully");

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String roomId = resultSet.getString("room_id");
                String hostelId = resultSet.getString("hostel_id");
                int roomNumber = resultSet.getInt("room_number");
                int capacity = resultSet.getInt("capacity");
                int avalableCapacity = resultSet.getInt("avalable_capacity");

                System.out.println("Room ID: " + roomId);
                System.out.println("Hostel ID: " + hostelId);
                System.out.println("Room Number: " + roomNumber);
                System.out.println("Capacity " + capacity );
                System.out.println("Avalable Capacity " + avalableCapacity);
            } else {
                System.out.println("Room not found");
            }

        } catch (SQLException e) {
            System.out.println("An error occurred while retrieving an room from the database " + e.getMessage());
        }

    }
}
