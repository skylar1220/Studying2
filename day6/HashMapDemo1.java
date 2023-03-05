package day6;

//6

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashMapDemo1 {

	public static void main(String[] args) {
//		Map<String, Integer> maps = Map.of("홍길동", 95 , "철수", 100);
		Map<String, Integer> maps = new HashMap<String, Integer>();
		maps.put( "홍길동", 95);
		maps.put( "철수", 100);
		
		Map<String, Integer > peoples = new HashMap<String, Integer>(maps);
		
		Map<Student, Integer> stMap = new HashMap<Student, Integer>() ;
		stMap.put(new Student("kim"), 10);
		stMap.put(new Student("lee"), 20);
		stMap.put(new Student("kim"), 5);
		
		System.out.println(stMap.size());
		stMap.get(stMap);
		
		System.out.println(stMap);
		BiConsumer<String, String> bic = (a,b) -> System.out.println(a+b);
		bic.accept("aaa", "bbb");
		stMap.forEach((k,v) -> System.out.println("key:" + k.getName() + ", value: " + v) );
	}

}

// 버전 올리면 map.of 됨
// key value를 만들어주는 기능
// 저걸 씌워줬으니 이제 people은 완벽한 hashmap이 된 것

