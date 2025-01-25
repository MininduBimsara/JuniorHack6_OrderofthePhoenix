package org.example.Services;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class HostelService {


        public void addHostel(String hostal_id, String hostal_name, Integer number_of_rooms, Connection conn) {
            // Add an hostel to the database
            String sql = "INSERT INTO hostals (hostal_id, hostal_name, number_of_rooms) VALUES (?, ?, ?)";

            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, hostal_id);
                preparedStatement.setString(2, hostal_name);
                preparedStatement.setInt(3, number_of_rooms);
                preparedStatement.executeUpdate();
                System.out.println("Hostel added successfully");
            } catch (SQLException e) {
                System.out.println("An error occurred while adding an Hostel to the database " + e.getMessage());
            }

        }

        public void deleteHostel(int hostal_id, Connection conn) {
            // Delete an Hostel from the database
            String sql = "DELETE FROM hostals WHERE id = ?";

            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setInt(1, hostal_id);
                preparedStatement.executeUpdate();
                System.out.println("Hostel deleted successfully");
            } catch (SQLException e) {
                System.out.println("An error occurred while deleting an Hostel from the database " + e.getMessage());
            }

        }

        public void updateHostel(String hostal_id, String hostal_name, int number_of_rooms, Connection conn) {
            // Update an Hostel in the database
            String sql = "UPDATE hostals SET hostal_id = ?, hostal_name = ?, number_of_rooms = ? WHERE id = ?";

            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, hostal_id);
                preparedStatement.setString(2, hostal_name);
                preparedStatement.setInt(3, number_of_rooms);
                preparedStatement.executeUpdate();
                System.out.println("Hostel updated successfully");
            } catch (SQLException e) {
                System.out.println("An error occurred while updating an Hostel in the database " + e.getMessage());
            }
        }
        public void getHostel(String id, Connection conn) {
            // Get an Hostel from the database
            String sql = "SELECT * FROM hostals WHERE id = ?";

            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, id);
                preparedStatement.executeQuery();
                System.out.println("Hostel retrieved successfully");

                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    String HostelId = resultSet.getString("hostal_id");
                    String HostelName = resultSet.getString("hostal_name");
                    int HostelRooms= resultSet.getInt("number_of_rooms");
                    System.out.println("Hostel ID: " + HostelId);
                    System.out.println("Hostel Name: " + HostelName);
                    System.out.println("Hostel Salary: " + HostelRooms);

                } else {
                    System.out.println("Hostel not found");
                }

            } catch (SQLException e) {
                System.out.println("An error occurred while retrieving an Hostel from the database " + e.getMessage());
            }

        }


}
