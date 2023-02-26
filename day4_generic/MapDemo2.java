//4

package day4_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {

		List <Map<String, String>> lists = new ArrayList <Map<String, String>> ();
		Map<String, String> maps = new HashMap<String, String>();
		lists.add(maps);	// 여기?
		maps.put("name", "a");
		maps.put("age", "29");
		maps.put("id", "b");
//		lists.add(maps);	// 여기?
		
		maps = new HashMap<String, String>(); // 이름은 같지만 새로운 주소값이 생긴 것
		maps.put("name", "f");
		maps.put("age", "39");
		maps.put("id", "g");
		lists.add(maps);
		
		System.out.println(lists);
	}

}
