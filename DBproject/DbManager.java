package DBproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import day9_jdbc2.DbConnect;

public class DbManager implements DBHandler {

	@Override
	public Connection connectDB() {
		DbConnect dbc = new DbConnect();
		return dbc.getConn();
	}

	@Override
	public boolean insertData(Map<String, Object> datas) {
		String str = "  insert into student(name,age,gender,grade,type)";
		str += " values(?,?,?,?,?) ";
		try (
		DbConnect dbc = new DbConnect();
		PreparedStatement pstmt = dbc.getPrepare(str);
				)
		{
			pstmt.setString(1, (String) datas.get("name"));
			pstmt.setInt(2, (int) datas.get("age"));
			pstmt.setInt(3, (int) datas.get("gender"));
			pstmt.setInt(4, (int) datas.get("grade"));
			pstmt.setInt(5, (int) datas.get("type"));
			return pstmt.execute() ;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Map<String, Object> selectData() {
		return null;
	}

	@Override
	public boolean updateData(String id, Map<String, Object> datas) {
		return false;
	}

	@Override
	public boolean deleteData(String id) {
		return false;
	}

}
