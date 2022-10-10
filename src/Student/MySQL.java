package Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MySQL {
	public static Connection getCon() {
		Connection conn = null;
		try {
			// Nạp Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Tạo kết nối
			conn = DriverManager.getConnection("jdbc:mysql://url-----", "user-----", "password-----");
			
			/*
			Statement stmt = conn.createStatement();
			ResultSet res = stmt.executeQuery("Select * from db_student");
			*/
			
			//Kiểm tra kết nối SQL
			if (conn != null) {
				System.out.print("Connected Sucessfully To MySQL Workbench !");
			}
		}
		catch (ClassNotFoundException | SQLException e) {
			System.out.print("Not Connected To MySQL Workbench !");
		}
		return conn;
	}
	
	Connection cn() {
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getCon();
	}

}
