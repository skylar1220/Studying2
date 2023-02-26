// 5

package day4_generic;

import java.util.HashMap;
import java.util.Map;

public class EntryDemo2 {
	public static void main(String[] args) { 
		Map<String, Map<String, Integer>> maps2 = new HashMap<String, Map<String, Integer>>(); // 1. 이렇게 틀을 다 만들어놓고 
		Map <String, Integer> maps = new HashMap <String, Integer> () ;

		maps2.put("홍길동", maps);

	maps.put("수학", 90); // 2. 데이터 삽입은 나중에 할 수 있음
	maps.put("영어", 100);
	maps.put("국어", 98);
	maps.put("수학", 95);

	
	/////////////////////////// 3. 이렇게도 됨
//		Map<String, Integer>  maps3 = new HashMap<String, Integer> (); // 4. 이거 생략하고 아래처럼
	
	maps = new HashMap <String, Integer> () ;
	maps2.put("백두산", maps);
//	
//	maps3.put("수학", 90);
//	maps3.put("영어", 100);
//	maps3.put("국어", 98);
//	maps3.put("수학", 95);
	
	System.out.println(maps2);

	
	
	}
}

