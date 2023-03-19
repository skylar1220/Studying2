package day9_jdbc2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect implements AutoCloseable {
	// 드라이버 로드
	private final String URL = "jdbc:mysql://localhost:3306/javadb";
	private final String ID = "javadb";
	private final String PASSWORD = "admin1234";
	private Connection conn;

	public Connection getConn() {
		return conn;
	}

	public DbConnect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		this.conn = DriverManager.getConnection(URL, ID, PASSWORD);
	}

	public Statement getStatement() throws Exception  {
		return conn.createStatement();
	}

	public PreparedStatement getPrepare(String str) throws Exception  {
		return conn.prepareStatement(str);
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}

// 예외처리를 	public Connection getConnection() 에서 해야할까?
// 얘를 던지면 캐치한 애가 설명을 해야하니까, 
// 얘를 호출하는 함수는 필요한 애들이 계속 호출을 해야할테니
// 걔네들이 매번 예외를 처리하는 것보다는 얘가 처리하는 게 낫지 않을까?
// 100군데라면 100군데에서 다 처리해야하니까 여기서 한 번 쓰고 말자

//  getConnection()함수: DbConnect 클래스를 계속 객체로 만들어서 해야할까? vs static으로 해서 클래스에서 바로 부를수 있게할까?
// 판단은 getconne함수 안에 변수들이 static이면 static으로 바꾸는 게 낫겠지!

// 참고1. auto가 안불려서 static은 안

// 받아쓰는 얘는 트라이 캐치 필요없지 않나? 어차피 데모에서 하니까 지우자!

// 개선3. 
// getPrepare(String sql)
// 이걸 써서 ?를 채우기만 하게 하자!

//개선 4.
// getconnection 계속 쓰니가 생성자로 하면 좋겠다!
////원래
//public  Connection getConnection() throws Exception {
//	Class.forName("com.mysql.cj.jdbc.Driver");
//	System.out.println("데이터베이스 연결중...");
//	conn = DriverManager.getConnection(URL, ID, PASSWORD);
//	return conn;
//}
