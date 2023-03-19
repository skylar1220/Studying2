package day9_jdbc2;

import java.sql.PreparedStatement;
import java.sql.Statement;

public class Insert_2 {

	public static void main(String[] args) {
		String str = "insert into student(name,age,gender,grade,type)";
		str += " values(?,?,0,1,1 )";

		try (
				DbConnect dbc = new DbConnect(); 
				PreparedStatement ptst = dbc.getPrepare(str);
				) 
		{
			ptst.setString(1, "d");
			ptst.setInt(2, 20);
			ptst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

// insert into student(name,age,gender,grade,type) values('홍길동',12,0,1,1 )
