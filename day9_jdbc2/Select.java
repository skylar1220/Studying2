package day9_jdbc2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		// db 연결 후 추가
		// db 연결 후 조회
		// db 연결 후 삭제
		// db 연결 후 업데이트
		
		// 조회 기능 
		
		String sql = "select * from student";
		
		try(
				// 1. 드라이버 로드 + 2. 데이터베이스 연결 메소드 -> conn 
				DbConnect dbco = new DbConnect();
				// 3. statement 객체 만들기
				Statement stmt = dbco.getStatement();
				// 4. SQL문 처리명령
				ResultSet rs =  stmt.executeQuery(sql);
				)
		{
			while (rs.next()) {
				System.out.println(
						rs.getInt("id") + " " + rs.getString("name")
				+ " " + rs.getInt("age") + " " + rs.getInt("gender") 
				+ " " + rs.getInt("grade") + " " + rs.getInt("type")
						);
			}
			
			
			// 5. catch문
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

//3. statement 객체 만들기
//ResultSet rs =  stmt.executeQuery(sql);
// 저번에는 그냥 excuteupdate였는데 그건 수정사항 반영이라?
// 만약 그냥 execute라면 실행만, 출력x
// 이번에는 executeQuery로 결과까지 가져오기


//rs.next();
// 홍길동 하나의 로우를 가져옴.
// 리턴타입은 불린인데: rs 자체가 데이터를 반환하는 게 아니라, rs가 넥스트하면서 가장먼저나온 데이터 집합을 가리키는 것
// 마지막에 아무것도 없으면 널 반환

// 	rs.getString(0)
// 얘는 첫줄이 0이 아니라 인덱스가 1로 시작되어서 추천x
// rs.getInt("id")
// 얘로 해서 

//4. SQL문 처리명령
//executeQuery
//select 명령문에서 사용
//반환값 : ResultSet 클래스의 인스턴스로 반환
//
//executeUpdate
//insert, update, delete 명령문에서 사용
//반환값 : int

// 저 위에 try에 리소스가 들어가면 그 리소스가 상속받은 autoclosable에 의해서 자동으로 close가 실행됨 (static이 아니어야)
// static 아니니 객체 생성해서 쓰긴 해야함. DbConnect dbco = new DbConnect();


//개선2. Statement stmt 객체
// getStatement() 메소드로 만들어버리기