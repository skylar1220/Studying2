package day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 
 * 스트림... 컬렉션과 비슷한 기능을 제공...
 * 람다를 이용해서 커스텀화... 버퍼링처럼 자료를 저장하지 않고
 * 
 * 랜덤하게 1~100 의 숫자 중에서 20개를 선택하고
 * 짝수만
 * 홀수만
 * 3의 배수만
 */

public class Demo4_8 {

	public static void main(String[] args) {
		
		Random r = new Random(100);
		List<Integer> lists = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			lists.add(i+1);
		}
		Collections.shuffle(lists);
		
		IntStream sm =  lists.stream().mapToInt( x-> x.intValue()).limit(20);
		sm.forEach(x -> System.out.print(x +" "));
		System.out.println();
		
		sm =  lists.stream().mapToInt( x-> x.intValue()).limit(20);
		sm.filter(x -> x % 2 == 0 ).forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		sm =  lists.stream().mapToInt( x-> x.intValue()).limit(20);
		sm.filter(x -> x % 2 != 0 ).forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		sm =  lists.stream().mapToInt( x-> x.intValue()).limit(20);
		sm.filter(x -> x % 3 == 0 ).forEach(x -> System.out.print(x + " "));
		
		
	}

}
