package org.example.Services;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class HostelService {



        public void addHostel(String name, int place, int date, Connection conn) {
            // Add an hostel to the database
            String sql = "INSERT INTO hostel (name, salary, age) VALUES (?, ?, ?)";

            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, place);
                preparedStatement.setInt(3, date);
                preparedStatement.executeUpdate();
                System.out.println("Hostel added successfully");
            } catch (SQLException e) {
                System.out.println("An error occurred while adding an Hostel to the database " + e.getMessage());
            }

        }

        public void deleteHostel(int id, Connection conn) {
            // Delete an Hostel from the database
            String sql = "DELETE FROM hostel WHERE id = ?";

            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
                System.out.println("Hostel deleted successfully");
            } catch (SQLException e) {
                System.out.println("An error occurred while deleting an Hostel from the database " + e.getMessage());
            }

        }

        public void updateHostel(int id, String name, int place, int date, Connection conn) {
            // Update an Hostel in the database
            String sql = "UPDATE Hostel SET name = ?, salary = ?, age = ? WHERE id = ?";

            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, place);
                preparedStatement.setInt(3, date);
                preparedStatement.setInt(4, id);
                preparedStatement.executeUpdate();
                System.out.println("Hostel updated successfully");
            } catch (SQLException e) {
                System.out.println("An error occurred while updating an Hostel in the database " + e.getMessage());
            }
        }
        public void getHostel(int id, Connection conn) {
            // Get an Hostel from the database
            String sql = "SELECT * FROM Hostel WHERE id = ?";

            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                preparedStatement.executeQuery();
                System.out.println("Hostel retrieved successfully");

                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    int HostelId = resultSet.getInt("id");
                    String HostelName = resultSet.getString("name");
                    int HostelSalary = resultSet.getInt("place");
                    int HostelAge = resultSet.getInt("date");
                    System.out.println("Hostel ID: " + HostelId);
                    System.out.println("Hostel Name: " + HostelName);
                    System.out.println("Hostel Salary: " + HostelSalary);
                    System.out.println("Hostel Age: " + HostelAge);
                } else {
                    System.out.println("Hostel not found");
                }

            } catch (SQLException e) {
                System.out.println("An error occurred while retrieving an Hostel from the database " + e.getMessage());
            }

        }


}
