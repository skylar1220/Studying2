package day6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//7

public class Demo1 {

	public static void main(String[] args) {
		List<String> temp = new ArrayList<String>();
		temp.add("333");
		temp.add("111");
		temp.add("444");
		temp.add("222");
//		List<String> temp = List.of("111","222");
		
		List<String>lists = new ArrayList<String>(temp);
		Set<String>sets = new HashSet<String>();
		Collections.sort(lists, Collections.reverseOrder());
		System.out.println(lists);
		

		String [] strarray = { "333" , "222", "111", "444"};
		List<String>lists2 = Arrays.asList(strarray);
		Collections.sort(lists2);
		System.out.println(lists2);
		int index = Collections.binarySearch(lists2, "111");
		System.out.println(index);
	}

}

// collection을 이용한 정렬 방법
// Collections.reverseOrder()를 통한 뒤집기
// 저 아래 binarysearch는 치기만 해서 한 번 해봐야 알겠다...