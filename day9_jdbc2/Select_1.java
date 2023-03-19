package day9_jdbc2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select_1 {
	// 조회 기능 
	public static void main(String[] args) {
		
		String sql = "select * from student";
		
		try(
				// 1. 드라이버 로드 + 2. 데이터베이스 연결 메소드 -> conn 
				DbConnect dbco = new DbConnect();
				// 3. statement 객체 만들기
				Statement stmt = dbco.getStatement();
				
				// 4. SQL문 처리명령
				ResultSet rs = stmt.executeQuery(sql);

				)
		{
			// 데이터 읽어오는 부분 ( 다음줄이 있을 때까지)
			while ( rs.next() ) {
				System.out.println(
						rs.getInt("id") + " " + rs.getString("name")
				+ " " + rs.getInt("age") + " " + rs.getInt("gender") 
				+ " " + rs.getInt("grade") + " " + rs.getInt("type")
						);			}
			
			// 0. catch문
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


//rs.next();
// 홍길동 하나의 로우를 가져옴.
// 리턴타입은 불린인데: rs 자체가 데이터를 반환하는 게 아니라, rs가 넥스트하면서 가장먼저나온 데이터 집합을 가리키는 것
// 마지막에 아무것도 없으면 널 반환

// try with resources 구문으로 자동 리소스 close
// 사용되는 리소스(try옆())는 autoclosable 인터페이스 구현해야
// static 아니니 객체 생성해서 쓰긴 해야함.

//개선2. Statement stmt 객체
// getStatement() 메소드로 만들어버리기