//7
package day4_generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionDemo1 {

	public static void main(String[] args) {
		// 
		String [] names = { "a","b","c","d","a","b" };

		List<String> lists =  Arrays.asList(names); // @ Arrays.asList: 배열을 리스트로 만들어줌!
		System.out.println(lists);
		// Q names 배열의 중복을 제거해라
		Set<String> sets = new HashSet<String>(lists);
		System.out.println(sets);
		sets.toArray();
		// 중복 제거 됐으니
		// 최종 타입은 string[]로 변환 : 숙제
		
		
	}

}
