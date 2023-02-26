//4

package day4_generic;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// key value 한 쌍...  key 에 들어가는 값은 unique 하다
		Map <String, Integer > map = new HashMap <String, Integer >();
		map.put("123", 123);
		map.put("123", 45);
		map.put("123", 156); // key 값이 같으므로 update
		
		System.out.println(map.get("123"));
		System.out.println(map.size());

		map.put("456", 45);
		System.out.println(map.size());
		
		map.remove("123");
		System.out.println(map.size());
		
		map.remove("1235");
		System.out.println(map.size());

	}

}
