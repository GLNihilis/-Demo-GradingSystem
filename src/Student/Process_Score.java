package Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Process_Score {
	MySQL con = new MySQL();
	
	// Phương thức "Lấy danh sách"
	public ArrayList<Student> getListScore(){
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
				s.setMark(rs.getDouble("Mark"));
				
				
				
				list.add(s);
			}
			conn.close();
		}
		catch (SQLException e) {
			System.out.print("Can't Display List Score");
		}
		return list;
	}

	// Phương thức "Thêm"
	public boolean insertScore(Double Mark                                     ) {
		Connection conn = con.getCon();
		String sql = "insert into -----(Mark,                        )" + "values(?,?,?,?,?,?)";
		try {
			// Tạo truy vấn
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setDouble(1, Mark);
			
			
			
			
			
			ps.executeQuery();
			conn.close();
			return true;
		}
		catch (SQLException e) {
			System.out.print("Can't Insert Score");
			return false;
		}
	}
	
	// Phương thức "Xóa"
	public boolean deleteScore(Double Mark                    ) {
		Connection conn = con.getCon();
		String sql = "delete from ----- where            ";
		try {
			// Tạo truy vấn
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setDouble(1, Mark);
			
			
			
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
	public boolean updateScore(Double Mark                        ) {
		Connection conn = con.getCon();
		String sql = "update -----" + "set Mark = ?,                    " + "Where                ";
		try {
			// Tạo truy vấn
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setDouble(1, Mark);
			
			
			
			
			
			
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

