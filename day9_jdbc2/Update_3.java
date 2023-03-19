package day9_jdbc2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update_3 {

	public static void main(String[] args) {
		// 데이터베이스 접속
		// 업데이트 구문
		// 실행
		
		String sql = " update student";
		sql += " set name =  ? , age = ? ";
		sql += " where id = 2";

		try (
				DbConnect dbc = new DbConnect();
				PreparedStatement pstmt = dbc.getPrepare(sql);
				) 
		{
			// 4. SQL문 처리명령
			pstmt.setString(1, "백s산"); 
			pstmt.setInt(2, 50);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

// sql += " set name =  ?, age = ? ";
// pstmt.setString(1, "백두산"); // @@ 여기 이해안감!!
// 스트링 중에 첫번째인 name
// 인트중에 첫번째인 
