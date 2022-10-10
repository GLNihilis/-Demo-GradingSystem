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
		String sql = "Select * from -----";
		
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
				s.setBirth(rs.getInt("Birth"));
				s.setGender(rs.getString("Gender"));
				s.setAddress(rs.getString("Address"));
				list.add(s);
			}
			conn.close();
		}
		catch (SQLException e) {
			System.out.print("Can't Display List Student");
		}
		return list;
	}
	
	// Phương thức "Thêm"
	public boolean insertStudent(String ID, String Name, String ClassID, int Birth, String Gender, String Address) {
		Connection conn = con.getCon();
		String sql = "insert into -----(ID, Name, ClassID, Birth, Gender, Address)" + "values(?,?,?,?,?,?)";
		try {
			// Tạo truy vấn
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, ID);
			ps.setString(2, Name);
			ps.setString(3, ClassID);
			ps.setInt(4, Birth);
			ps.setString(5, Gender);
			ps.setString(6, Address);
			ps.executeQuery();
			conn.close();
			return true;
		}
		catch (SQLException e) {
			System.out.print("Can't Insert Student");
			return false;
		}
	}
	
	// Phương thức "Xóa"
	public boolean deleteStudent(String ID, String Name, String ClassID, int Birth, String Gender, String Address) {
		Connection conn = con.getCon();
		String sql = "delete from ----- where ID = ?";
		try {
			// Tạo truy vấn
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, ID);
			ps.executeQuery();
			conn.close();
			return true;
		}
		catch (SQLException e) {
			System.out.print("Can't Delete Student");
			return false;
		}
	}
	
	// Phương thức "Cập nhật"
	public boolean updateStudent(String ID, String Name, String ClassID, int Birth, String Gender, String Address) {
		Connection conn = con.getCon();
		String sql = "update -----" + "set Name = ?, ClassID = ?, Birth = ?, Gender = ?, Address = ?" + "Where ID = ?";
		try {
			// Tạo truy vấn
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, ID);
			ps.setString(2, Name);
			ps.setString(3, ClassID);
			ps.setInt(4, Birth);
			ps.setString(5, Gender);
			ps.setString(6, Address);
			ps.executeQuery();
			conn.close();
			return true;
		}
		catch (SQLException e) {
			System.out.print("Can't Update Student");
			return false;
		}
	}
	
	// Phương thức "Tìm kiếm "
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
