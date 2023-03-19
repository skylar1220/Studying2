package day10_finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
	private static final String URL = "jdbc:mysql://localhost:3306/javadb";
	private static final String ID = "javadb";
	private static final String PASSWORD = "admin1234";
	private static Connection conn;
	private static PreparedStatement ptmt;
	private static ResultSet rs;
	
	public static void main(String[] args)  {
		try {
		// 1. db 접속
		// 	- 드라이버 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
		// 	- db 접속 정보를 가지고 실제 접속 (db서버경로, 아이디, 패스워드)
		conn = DriverManager.getConnection(URL, ID, PASSWORD);
		conn.setAutoCommit(false); // 자동 커밋 방지
		// 2. 쿼리 생성
		String sql = "insert into product(id, name, price) values(?,?,?)";
		
		// 쿼리문자의 실행을 위한 preparestatement 객체 생성
		ptmt =  conn.prepareStatement(sql);
		
		// 쿼리문에 동적으로 ? 자리에 들어갈 데이터 세팅
		ptmt.setString(1, "005");
		ptmt.setString(2, "Radio");
		ptmt.setString(3, "1,500,000");
		
		// 3. 실행 - insert
//		ptmt.executeUpdate(); // INSERT, UPDATE or DELETE
		
		// 4. 실행 - update
		// 	- 위에 정의한 2 과정과 3 과정을 실행한다.
		sql = "update product set price = ? where id = ? ";
		ptmt =  conn.prepareStatement(sql);
		ptmt.setString(1, "200,000");
		ptmt.setString(2, "001");
//		ptmt.executeUpdate();
		
		// 5. 실행 - delete
		sql = "delete from product where id = ?";
		ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, "005");
//		ptmt.executeUpdate();
		
		// 6. 실행 - select -> console에 출력
		sql = "select * from product ";
		ptmt = conn.prepareStatement(sql);
		rs = ptmt.executeQuery();
		while ( rs.next() ) {
			System.out.println(
					rs.getString("id") + " " + 
					rs.getString("name") + " " + 
					rs.getString("price")
					);
		}

		conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback(); // 4번에 에러있었다고 칠때, 3번은 실행안되게 하는 것 = 트랜젝션
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}

// 근데 3번 계속 실행되고 뒤에거 에러여도 자기는 계속 실행되니까...
// 그럼, 두 개 다 에러가 안나야지만 적용하는 게 필요함
// conn.setAutoCommit(false);
// 자동 커밋 방지

// rollback도 트라이캐치 해야해서 하게 된 것임
