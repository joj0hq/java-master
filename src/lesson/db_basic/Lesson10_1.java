package lesson.db_basic;

import java.sql.*;

public class Lesson10_1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost/sample";
            String user = "student";
            String password = "himitu";

            Connection connection = DriverManager.getConnection(url, user, password);

            String code = "7";
            String name = "John";
            String age = "21";
            String tel = "090-2344-1843";

            String sql = "SELECT * FROM employee ORDER BY age ASC";
//            String sql = "SELECT * FROM employee   WHERE name LIKE '%山%'";
//            String sql = String.format("INSERT INTO employee (code, name, age, tel) VALUES(%s,'%s',%s,'%s')", code, name, age, tel);

            PreparedStatement stmt = connection.prepareStatement(sql);

//            select
            ResultSet resultSet = stmt.executeQuery();
            while(resultSet.next()){
                System.out.print(resultSet.getInt("code"));
                System.out.print(" : " + resultSet.getString("name"));
                System.out.print(" : " + resultSet.getString("age"));
                System.out.print(" : " + resultSet.getString("tel"));
                System.out.println();
            }

//            insert
//            int rows = stmt.executeUpdate();
//            System.out.println("INSERT: " + rows);

            stmt.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}