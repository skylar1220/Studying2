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
		} catch (Exception e) {
			e.printStackTrace();
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
