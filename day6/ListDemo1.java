package day6;

//5

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		String[] animals1 = { "aa", "bbbb", "ccc" };
		List<String> animals2 = Arrays.asList(animals1);
		animals2.set(1, "tt");
		animals2.forEach(x -> System.out.println(x));

		System.out.println("--------------");
		List<String> animals3 = new ArrayList<String>(animals2);
		animals3.add(1, "t");
		animals3.forEach(x -> System.out.println(x));

		// 길이순 정렬 방법1
//		animals3.sort(new Comparator<String>() {
//			public int compare(String o1, String o2) {
//				return o1.length() - o2.length();
//			};
//		});
		
		System.out.println("--------------");
		// 길이순 정렬 방법2
		animals3.sort( (a,b) -> a.length() - b.length()  );
		animals3.forEach( x -> System.out.println(x));

		
	}

}

// animals2는 순수한 리스트가 아니라 스트링을 리스트로 바꾼거라 add 기느이 안되는 것