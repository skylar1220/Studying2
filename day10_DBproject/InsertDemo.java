package day10_DBproject;

import java.util.HashMap;
import java.util.Map;

public class InsertDemo {

	
	public static void main(String[] args) {
		// insert
		DbManager dbm = new DbManager();
		Map<String, Object> insertMap = new HashMap< String, Object>();
		insertMap.put(STUDENTCOLS.NAME.toString(), "철수");
		insertMap.put(STUDENTCOLS.AGE.toString() , 12);
		insertMap.put(STUDENTCOLS.GENDER.toString() , 1);
		insertMap.put(STUDENTCOLS.GRADE.toString() , 1);
		insertMap.put(STUDENTCOLS.TYPE.toString() , 1);
		dbm.insertData(insertMap);
		

	}
}
