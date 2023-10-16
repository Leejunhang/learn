package class06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLTest {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/MySQL?serverTimezone=UTC",
					"root", "0000");
			System.out.println("성공");
			Statement stmt = conn.createStatement();
		}
		catch (SQLException e) {
			System.out.println(e);
		}

	}

}
