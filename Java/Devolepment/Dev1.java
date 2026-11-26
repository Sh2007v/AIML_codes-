
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dev1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/company_db";
        String user = "root";
        String password = "your_password";

        // SQL query with hardcoded values
        String sql = "INSERT INTO employee (id, name, role, salary) " +
                     "VALUES (101, 'Aarav Sharma', 'Software Engineer', 75000.00)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            int rowsAffected = stmt.executeUpdate(sql);
            System.out.println(rowsAffected + " record inserted successfully.");

              // 1. Create the employee table
            stmt.execute("CREATE TABLE employee (id INT PRIMARY KEY, name TEXT, role TEXT, salary REAL)");
            System.out.println("Table created.");

            // 2. Insert records using Statement
            stmt.executeUpdate("INSERT INTO employee VALUES (101, 'Aarav Sharma', 'Developer', 75000)");
            stmt.executeUpdate("INSERT INTO employee VALUES (102, 'Priya Verma', 'Designer', 68000)");
            System.out.println("2 records inserted.\n");

            // 3. Update a record
            stmt.executeUpdate("UPDATE employee SET salary = 85000 WHERE id = 101");
            System.out.println("Updated Aarav's salary.");

            // 4. Delete a record
            stmt.executeUpdate("DELETE FROM employee WHERE id = 102");
            System.out.println("Deleted Priya's record.\n");

            // 5. Display remaining records
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
            System.out.println("Current Employee Table:");
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("role") + " | " +
                    rs.getDouble("salary")
                );
            }
        } catch (SQLException e) {
            System.err.println("Error inserting record: " + e.getMessage());
        }

    }
}