package DBproject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

import day9_jdbc2.DbConnect;

/*
 * CRUD를 제공
 * 1. 사용자로부터 데이터를 받아서 적절한 CRUD를 수행할 수 있도록
 * 다음 메소드를 만드세요
 * select (String id) 
 *  - select 쿼리문 호출하면서 
 * 	- 전체 or 특정 row
 * delete (String id)
 * 	-
 * update (Map<K, v> map, Sting id)
 * 	-
 * insert (List<T> lists)
 * 	- insert 쿼리문 호출하면서 
 * 	- data 전달
 */
public class DbManager_my {
	
	public void Select(String str) {
		try (
				DbConnect dbc = new DbConnect();
				PreparedStatement pstm = dbc.getPrepare(str);
				ResultSet rs = pstm.executeQuery(str);
				)
		{
			while (rs.next()) {
				System.out.println(
						rs.getInt("id") + " " + rs.getString("name")
				+ " " + rs.getInt("age") + " " + rs.getInt("gender") 
				+ " " + rs.getInt("grade") + " " + rs.getInt("type")
						);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Delete(String str) {
		try (
				DbConnect dbc = new DbConnect();
				PreparedStatement pstm = dbc.getPrepare(str);
				)
		{
//			pstm.setInt(2, 0);
//			pstm.setString(1, "");
			pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void Update(Map<K, v> map, String id) {
		
	}

}
