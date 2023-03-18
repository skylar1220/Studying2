package day9_jdbc2;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		String str = "  insert into student(name,age,gender,grade,type)";
		str += " values(?,?,?,?,1 ) ";

		try (
				DbConnect dbc = new DbConnect();
//				Statement stmt = dbc.getStatement();
				PreparedStatement pstmt = dbc.getPrepare(str);
				)
		{
			pstmt.setString(1, "김밥");
			pstmt.setInt(2, 20);
			pstmt.setInt(3, 0);
			pstmt.setInt(4, 2);
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}

// insert into student(name,age,gender,grade,type) values('홍길동',12,0,1,1 )


// 클래스를 하나 만든다.
// 데이터베이스 관련 클래스
// 네 개 기능을 하나로 모을 수 있게
// 메인 만들었을 때 그 때 그 때 빼쓸 수 있게