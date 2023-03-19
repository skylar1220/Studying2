package DBproject;

import java.util.HashMap;
import java.util.Map;

public class DbDemo_my {

	public static void main(String[] args) {
		Map<String, Object> datas = new HashMap<String, Object>();
		datas.put("name", "홍");
		datas.put("age", 12);
		datas.put("gender", 1);
		datas.put("grade", 1);
		datas.put("type", 1);
		insertData(datas);
	}



}
