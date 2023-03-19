package day9_jdbc2;

import java.sql.PreparedStatement;

public class Delete_4 {

	public static void main(String[] args) {
		String sql = " DELETE FROM student WHERE id = ?";

		try(
				DbConnect dbcon = new DbConnect();
				PreparedStatement pstmt = dbcon.getPrepare(sql);
				)
		{
			pstmt.setInt(1, 2);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

//DELETE FROM student WHERE id = 2