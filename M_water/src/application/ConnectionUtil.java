package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();

			// 프로그램 강제 종료
			System.exit(1);
		}
	}

	public static Connection getConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/water?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false";
		String user = "root";
		String password = "hsh5022";

		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
}

