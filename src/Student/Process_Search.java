package Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Process_Search {
	MySQL con = new MySQL();
	
	// Phương thức "Lấy danh sách"
	public ArrayList<Student> getEntireList(){
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
				s.setBirth(rs.getString("Birth"));
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
	
	// Phương thức "Tìm kiếm ID"
	ArrayList<Student> getStudent_ByID(String ID){
		Connection conn = con.getCon();
		String sql = "Select * from tb_student where ID = ?";
		ArrayList<Student> list = new ArrayList<>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, ID);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				s.setID(rs.getString("ID"));
				s.setName(rs.getString("Name"));
				s.setClassID(rs.getString("ClassID"));
				s.setBirth(rs.getString("Birth"));
				s.setGender(rs.getString("Gender"));
				s.setAddress(rs.getString("Address"));
				list.add(s);
			}
			conn.close();
		}
		catch (SQLException e) {
			System.out.print("Can't Search Student By ID");
		}
		return list;
	}

/*
	// Phương thức "Tìm kiếm Name"
	ArrayList<Student> getStudent_ByName(String Name){
		Connection conn = con.getCon();
		String sql = "Select * from tb_student where Name = ?";
		ArrayList<Student> list = new ArrayList<>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, Name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				s.setID(rs.getString("ID"));
				s.setName(rs.getString("Name"));
				s.setClassID(rs.getString("ClassID"));
				s.setBirth(rs.getString("Birth"));
				s.setGender(rs.getString("Gender"));
				s.setAddress(rs.getString("Address"));
				list.add(s);
			}
			conn.close();
		}
		catch (SQLException e) {
			System.out.print("Can't Search Student By ID");
		}
		return list;
	}
		
	// Phương thức "Tìm kiếm 2 điều kiện"
	ArrayList<Student> getStudent_ByClassID_ByGender(String ClassID, String Gender){
		Connection conn = con.getCon();
		String sql = "Select * from tb_student where ClassID = ? and Gender = ?";
		ArrayList<Student> list = new ArrayList<>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1, ClassID);
			ps.setString(2, Gender);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				s.setID(rs.getString("ID"));
				s.setName(rs.getString("Name"));
				s.setClassID(rs.getString("ClassID"));
				s.setBirth(rs.getString("Birth"));
				s.setGender(rs.getString("Gender"));
				s.setAddress(rs.getString("Address"));
				list.add(s);
			}
			conn.close();
		}
		catch (SQLException e) {
			System.out.print("Can't Search Student By ClassID and Gender");
		}
		return list;
	}
*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}
