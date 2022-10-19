package Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Process_Student {
	MySQL con = new MySQL();
	
	// Phương thức "Lấy danh sách"
	public ArrayList<Student> getListStudent(){
		Connection conn = con.getCon();
		
		// Lệnh SQL
		String sql = "Select * from tb_student";
		
		// Tạo danh sách 
		ArrayList<Student> list = new ArrayList();
		try {
			// Tạo truy vấn
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			
			// Thực thi truy vấn
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				
				// Tạo biến trong lớp "Student"
				Student s = new Student();
				s.setID(rs.getString("ID"));
				s.setName(rs.getString("Name"));
				s.setClassID(rs.getString("ClassID"));
				s.setGender(rs.getString("Gender"));
				s.setBirth(rs.getString("Birth"));
				s.setAddress(rs.getString("Address"));
				list.add(s);
			}
			conn.close();
		}
		catch (SQLException e) {
			System.out.print("\nCan't Display List Student");
		}
		return list;
	}
	
	// Phương thức "Thêm"
	public boolean insert_Student(String ID, String Name, String ClassID, String Gender, String Birth, String Address) {
		Connection conn = con.getCon();
		String sql = "insert into tb_student(ID, Name, ClassID, Birth, Gender, Address)" + "values(?,?,?,?,?,?)";
		try {
			// Tạo truy vấn
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, ID);
			ps.setString(2, Name);
			ps.setString(3, ClassID);
			ps.setString(4, Gender);
			ps.setString(5, Birth);
			ps.setString(6, Address);
			ps.executeUpdate();
			conn.close();
			return true;
		}
		catch (SQLException e) {
			System.out.print("\nCan't Insert Student");
			return false;
		}
	}
	
	// Phương thức "Xóa"
	public boolean delete_Student(String ID) {
		Connection conn = con.getCon();
		String sql = "delete from tb_student where ID = ?";
		try {
			// Tạo truy vấn
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, ID);
			ps.executeUpdate();   
			conn.close();
			return true;
		}
		catch (SQLException e) {
			System.out.print("\nCan't Delete Student");
			return false;
		}
	}
	
	// Phương thức "Cập nhật"
	public boolean update_Student(String ID, String Name, String ClassID, String Gender, String Birth, String Address) {
		Connection conn = con.getCon();
		String sql = "update tb_student set Name = ?, ClassID = ?, Gender = ?, Birth = ?, Address = ? Where (ID = ?)";
		try {
			// Tạo truy vấn
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, ID);
			ps.setString(2, Name);
			ps.setString(3, ClassID);
			ps.setString(4, Gender);
			ps.setString(5, Birth);
			ps.setString(6, Address);
			ps.executeUpdate();
			conn.close();
			return true;
		}
		catch (SQLException e) {
			System.out.print("\nCan't Update Student");
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
