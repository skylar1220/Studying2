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
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1_1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javadb";
		// mysql url로 검색하기
		
		// 주의! sql 클래스인 애로 가져와야함 
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// 1. jdbc  드라이버(mysql-connector) 로드 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결중...");
			
			// 2. 데이터베이스 연결
			conn = DriverManager.getConnection(url, "root", "admin1234");
			System.out.println("데이터베이스 연결성공...");
			
			String str = "insert into student(name,age,gender,grade,type) values('홍동',12,0,1,1 )";
			stmt = conn.createStatement();
			int result = stmt.executeUpdate(str);
			if (result > 0)
				System.out.println("데이터 삽입 성공");
			else
				System.out.println("데이터 삽입 실패");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}

//Class.forName("com.mysql.jdbc.Driver");

// 1. 드라이버 로딩
// 드라이버 인터페이스를 구현한 클래스를 로딩
// mysql, oracle 등 각 벤더사 마다 클래스 이름이 다르다.
// mysql은 "com.mysql.jdbc.Driver"이며, 이는 외우는 것이 아니라 구글링하면 된다.
// 참고로 이전에 연동했던 jar 파일을 보면 com.mysql.jdbc 패키지에 Driver 라는 클래스가 있다.


//String url = "jdbc:mysql://localhost/dev";

// 2. 연결하기
// 드라이버 매니저에게 Connection 객체를 달라고 요청한다.
// Connection을 얻기 위해 필요한 url 역시, 벤더사마다 다르다.
// mysql은 "jdbc:mysql://localhost/사용할db이름" 이다.

//Connection conn =null; 			//연결을 맺어낼 객체
//PreparedStatement ps = null;	//명령을 선언할 객체
//ResultSet rs = null; 			//결과값을 담아낼 객체
// 3. 변수

//int result = stmt.executeUpdate(str);
//// 4
//Returns:
//either (1) the row count for SQL Data Manipulation Language (DML) statements or (2) 0 for SQL statements that return nothing