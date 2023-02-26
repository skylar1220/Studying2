// 5

package day4_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EntryDemo3 {
	public static void main(String[] args) { 
		

		List<Map<String, Integer>> lists = new ArrayList<Map<String, Integer>>(); // lists는 = 그 maps짝들 입력받은대로 모은 어레이리스트
//		Map <String, Integer> maps = new HashMap <String, Integer> () ; // maps는 = { 이름, 점수 }인 키,밸류 짝인 맵 
																		// @case1) 얘가 여기있으면  [{a=3, f=5}, {a=3, f=5}] 이렇게 출력 (x)
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {
			Map <String, Integer> maps = new HashMap <String, Integer> () ; // @case2) 얘가 여기있어야  [{a=3}, {f=5}] 이렇게 출력 (o) 
																			// -> 새로운 maps 객체가 만들어지고 이전 maps 주소에 추가하지 않게 되므로
			System.out.println("이름");
			String name = sc.next();
			System.out.println("점수");
			int jumsu = sc.nextInt();
			
			maps.put(name, jumsu) ;
			System.out.println(maps);
			lists.add(maps); 
			
		}
		System.out.println(lists); // @case1) [{a=3, f=5}, {a=3, f=5}] 이렇게 출력되는이유
									// 객체지향이므로 이전 반복했던 maps의 주소가 참조되어 그 값까지 바뀐 것

	
	}
}

