//8
package day4_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo3 {

	public static void main(String[] args) {
		// 정수형 배열을 랜덤하게 만든다... 10개
		
		int [] arr = new int [10];
		Map<Integer, Integer> maps = new HashMap<Integer, Integer> ();
		List<Integer> lists = new ArrayList<Integer>();
		for (int j = 0; j < 10 ; j++) {
			lists.add((int) ( Math.random() * 5 ) + 1 )   ;
		}
		System.out.println(lists);
		

		// 쌤 방식 containskey 활용! containskey 정리하기!!
		for (Integer data : lists) {
			if (!maps.containsKey(data)) {
				maps.put(data, 1);
			}
			else {
				int a = maps.get(data) ;
				a++;
				maps.put(data, a) ;
			}
		}
		
		
		System.out.println(maps);
		
		
		// 내 방식
//		if (maps.containsKey(i)) {
//			maps.put(i, count);
//		}
		
//		for (int j = 0; j < 9; j++) {
//			for (int num = 1; num < 5; num++) {
//				if (lists.get(j) == num ) {
//					count++;
//					maps.put(j+1, count) ;
//				}
//			}
//
//		}
		
		
	}

}
