import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataBase {
    String dbUrl = "jdbc:mysql://localhost:3307/hope_haven";
    String dbUname = "root";
    String dbPassword = "";
    String dbDriver = "com.mysql.cj.jdbc.Driver";
    String name, phone, email, message;

    DataBase(String name, String phone, String email, String message) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.message = message;
    }

    void store() {
    	System.out.println(name);
		System.out.println(phone);
		System.out.println(email);
		System.out.println(message);
        try (Connection con = DriverManager.getConnection(dbUrl, dbUname, dbPassword)) {
            Class.forName(dbDriver); // No need to assign it to a variable
            String sql = "INSERT INTO contact_sec_table(name, email, phone_no, message) VALUES (?, ?, ?, ?)";

            try (PreparedStatement preparedStatement = con.prepareStatement(sql)) {
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, email);
                preparedStatement.setString(3, phone);
                preparedStatement.setString(4, message);

                preparedStatement.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
