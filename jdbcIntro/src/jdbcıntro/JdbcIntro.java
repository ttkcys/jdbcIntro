package jdbcıntro;

import java.sql.*;

public class JdbcIntro {

    static String userName = "root";
    static String password = "*******";
    static String dbUrl = "jdbc:mysql://localhost:3306/world";

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbUrl, userName, password);
            System.out.println("Connection has been made.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            connection.close();
        }
    }

}
