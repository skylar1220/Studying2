package day10_DBproject;

import java.util.List;
import java.util.Map;

public class SelectDemo {

	public static void main(String[] args) {
		// select
		DbManager dbm = new DbManager();
		List< Map<String, Object> > result = dbm.selectData();
		result.forEach(x -> System.out.println(x));
		
	}
}
