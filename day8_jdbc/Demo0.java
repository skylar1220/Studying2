package day8_jdbc;
/*jdbc 프로그래밍 순서
 * 1. jdbc  드라이버(mysql-connector) 로드 및 데이터 베이스 연결: mvnrepository검색
 * 2. sql 문 실행
 * 3. ResultSet 객체 처리
 * 4. 자원객체를 닫는다
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo0 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb";
		// mysql url로 검색하기
		// 1. jdbc  드라이버(mysql-connector) 로드 및 데이터 베이스 연결
		// 주의! sql 클래스인 애로 가져와야함 
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결중...");
			conn = DriverManager.getConnection(url, "root", "admin1234");
			System.out.println("데이터베이스 연결 성공");
			
			String str = "insert into student (name, age , gender, grade, type ) values ('김자숙', 13, 2, 2, 1)";

			stmt = conn.createStatement();
			int result = stmt.executeUpdate(str);
			if (result > 0) {
				System.out.println("데이터 삽입 성공 ");
			} else 
				System.out.println("실패");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if ( conn != null )
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		
		
		

	}

}
