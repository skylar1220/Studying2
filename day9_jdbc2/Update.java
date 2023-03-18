package day9_jdbc2;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Update {

	public static void main(String[] args) {
		// 데이터베이스 접속
		// 업데이트 구문
		// 실행
		
		String sql = " update student";
		sql += " set name =  ? , age = ? ";
		sql += " where id = 2";

		try (
				// 1. 드라이버 로드 + 2. 데이터베이스 연결 메소드 -> conn
				DbConnect dbc = new DbConnect();
				// 3. statement 객체 만들기
				PreparedStatement pstmt = dbc.getPrepare(sql);
				) 
		{
			// 4. SQL문 처리명령
//			String sql = "update student set name = '동해산', age = 100 where id = 2";
//			sql += " set name = " +  "'동해'";
			
		
			pstmt.setString(1, "백s산"); // @@ 여기 이해안감!!
			pstmt.setInt(2, 50);
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}


//근데  try 뒤에 ()랑 {} 차이는 뭐지?
// update student set name = '동해산', age = 100 where id = 2

// preparestatement가 필요
// 원래
// Statement stmt = dbc.getStatement();
// 개선 : PreparedStatement pstmt = dbc.getPrepare(sql);

// sql += " set name =  ?, age = ? ";
// pstmt.setString(1, "백두산"); // @@ 여기 이해안감!!
// 스트링 중에 첫번째인 name
// 인트중에 첫번째인 
// 둘 다 전체 중에서가 아니라 문자는 문자끼리, 
