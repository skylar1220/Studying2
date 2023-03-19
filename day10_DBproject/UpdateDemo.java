package day10_DBproject;

import java.util.HashMap;
import java.util.Map;

public class UpdateDemo {

	public static void main(String[] args) {
		DbManager dbm = new DbManager();
		Map<String, Object> updateMap = new HashMap<String, Object>();
		updateMap.put(STUDENTCOLS.NAME.toString(), "자동차");
		updateMap.put(STUDENTCOLS.NAME.toString(), "자동차");
		updateMap.put(STUDENTCOLS.TYPE.toString(), 4);
		
		System.out.println( dbm.updateData("20", updateMap) ?  "update success" : "update false") ;

	}

}

// update 내 방식
//Map<String, Object> updateMap = new HashMap< String, Object>();
//updateMap.put(STUDENTCOLS.NAME.toString(), "나는업뎃");
//updateMap.put(STUDENTCOLS.AGE.toString() , 12);
//updateMap.put(STUDENTCOLS.GENDER.toString() , 1);
//updateMap.put(STUDENTCOLS.GRADE.toString() , 1);
//updateMap.put(STUDENTCOLS.TYPE.toString() , 1);
//dbm.updateData("10", updateMap);