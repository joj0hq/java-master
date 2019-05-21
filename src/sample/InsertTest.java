package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver"); // tarファイルのクラスからドライバーを登録
//            Class.forName("com.mysql.cj.jdbc.Driver"); // tarファイルのクラスからドライバーを登録

            String url = "jdbc:mysql://localhost/sample";
            String user = "student";
            String password = "himitu";

            Connection connection = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO emp(code, name, age, tel) VALUES(9, 'マイケル', 32, '03-5333-6533')";
            PreparedStatement statement = connection.prepareStatement(sql);
            int rows = statement.executeUpdate();
            System.out.println(rows + "件、データベースに追加しました");

            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
