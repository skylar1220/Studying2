package day10_DBproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

enum STUDENTCOLS {
	NAME {
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}
	},
	AGE {
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}
	},
	GENDER {
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}
	},
	GRADE {
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}
	},
	TYPE {
		@Override
		public String toString() {
			return super.toString().toLowerCase();
		}
	},

	;

}

public class DbManager implements DBHandler, AutoCloseable {
	private final String URL = "jdbc:mysql://localhost:3306/javadb?useUnicode=true&characterEncoding=utf8";
	private final String ID = "javadb";
	private final String PASSWORD = "admin1234";
	private Connection conn;

	public DbManager() {
		super();
		connectDB();
	}

	@Override
	public Connection connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.conn = DriverManager.getConnection(URL, ID, PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public boolean insertData(Map<String, Object> insertMap) {
		String sql = "  insert into student(name,age,gender,grade,type) values(?,?,?,?,?) ";
		try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
			pstmt.setString(1, (String) insertMap.get(STUDENTCOLS.NAME.toString()));
			pstmt.setInt(2, (int) insertMap.get(STUDENTCOLS.AGE.toString()));
			pstmt.setInt(3, (int) insertMap.get(STUDENTCOLS.GENDER.toString()));
			pstmt.setInt(4, (int) insertMap.get(STUDENTCOLS.GRADE.toString()));
			pstmt.setInt(5, (int) insertMap.get(STUDENTCOLS.TYPE.toString()));
			if (pstmt.executeUpdate() == 1)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
// 선생님 방법 이해@@
	@Override
	public boolean updateData(String id, Map<String, Object> datas) {
		String sql = "update student set ";
		
		for (Entry<String, Object> entry : datas.entrySet()) {
			if(entry.getValue() instanceof String)
				sql += entry.getKey()+" = '" + entry.getValue() + "' ,";
			else
				sql += entry.getKey()+" = " + entry.getValue() + " ,";
		} 
		// update student set name = 동해 ,age = 20 ,
		sql = sql.substring(0, sql.length()-1);
		sql += " where id = "+id;
		
		try(
				PreparedStatement pstmt =  conn.prepareStatement(sql);
				) 
		{
			if(pstmt.executeUpdate() == 1)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public List< Map<String, Object> > selectData() {
		List< Map<String, Object> > result = new ArrayList< Map<String, Object> >();
		String sql = "select * from student";
		try (
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery(sql);
				)
		{
			while (rs.next()) {
				Map<String, Object> m = new HashMap<String, Object>();
				m.put("name", rs.getString("name")) ;
				m.put("id", rs.getInt("id")) ;
				m.put("age", rs.getInt("age")) ;
				m.put("gender", rs.getInt("gender")) ;
				m.put("grade", rs.getInt("grade")) ;
				m.put("type", rs.getInt("type")) ;
				result.add(m);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public boolean deleteData(String id) {
		String sql = " DELETE FROM student WHERE id = ?";
		try (
				PreparedStatement pstmt = conn.prepareStatement(sql);
				) {
			pstmt.setInt(1, Integer.parseInt(id));
			if (pstmt.executeUpdate() == 1)
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void close() throws Exception {
		conn.close();

	}

}

// 개선1. enum으로 name,... 오타날 가능성도 줄이고, 딱 그것밖에 못받게 만들어놓기
// 원래: pstmt.setString(1, (String) datas.get("name"));
// pstmt.setString(1, (String) datas.get(STUDENTCOLS.NAME));
// 근데 enum 대문자로 쓰고 싶은데 들어갈 때는 소문자로 들어가야하니까
// 각각 enum tostring으로 소문자로 재정의

// insert에서 결과를 왜 execute 가 아니라 저 방식을 추가하더라도 executeupdate를 쓰는 이유?

// public class DbManager: 상속은 퍼블릭을 받아서 프라이빗으로 좁게 바꿀수는 없음

// 업데이트 내 방식
//String sql = " update student";
//sql += " set name =  ? , age = ? ";
//sql += " where id = 2";
//
//try (
//		PreparedStatement pstmt = conn.prepareStatement(sql); 
//		) 
//{
//	pstmt.setString(1, (String) updateMap.get(STUDENTCOLS.NAME.toString()) ); 
//	pstmt.setInt(2,(int) updateMap.get(STUDENTCOLS.AGE.toString()));
//	pstmt.setInt(3, (int) updateMap.get(STUDENTCOLS.GENDER.toString()));
//	pstmt.setInt(4,(int) updateMap.get(STUDENTCOLS.GRADE.toString()));
//	pstmt.setInt(5, (int) updateMap.get(STUDENTCOLS.TYPE.toString()));
//	pstmt.setInt(6, Integer.parseInt(id));
//	if ( pstmt.executeUpdate() == 1 )
//		return true;
//} catch (Exception e) {
//	e.printStackTrace();
//}
//return false;

// selec 내 방식
//Map<String, Object> result = new HashMap<String, Object>();
//// db select 결과물을 가지고 ResultSet 객체에 담긴걸...
//// result에 put 해서 리턴
//String sql = "select * from student";
//try (PreparedStatement pstmt = conn.prepareStatement(sql);) {
//	ResultSet rs = pstmt.executeQuery(sql);
//	while (rs.next()) {
//		result.put(STUDENTCOLS.NAME.toString(), rs.getString(STUDENTCOLS.NAME.toString()));
//		result.put(STUDENTCOLS.AGE.toString(), rs.getInt(STUDENTCOLS.AGE.toString()));
//		result.put(STUDENTCOLS.GENDER.toString(), rs.getInt(STUDENTCOLS.GENDER.toString()));
//		result.put(STUDENTCOLS.GRADE.toString(), rs.getInt(STUDENTCOLS.GRADE.toString()));
//		result.put(STUDENTCOLS.TYPE.toString(), rs.getInt(STUDENTCOLS.TYPE.toString()));
//	}
//	return result;
//} catch (Exception e) {
//	e.printStackTrace();
//}