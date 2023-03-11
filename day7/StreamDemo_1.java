package day7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class StreamDemo_1 {

	public static void main(String[] args) {
		// 정수형 리스트 객체를 생성
		Random r = new Random();
		
		// 해당 리스트에 랜덤한 정수형 값을 저장 10개: r.nextInt(30)
		List<Integer> lists = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			lists.add(r.nextInt(30));
		}
				
		// 1. Collection 방식
		// 정수형 리스트 객체를 생성
		List<Integer> lists2 = new ArrayList<Integer>();
		// 위에서 저장한 리스트 중에서 값이 10 이상인 데이터만 새로운 리스트에 저장
		for (Integer data : lists) {
			if ( data > 10)
				lists2.add(data);
		}
		// 정렬
		Collections.sort(lists2);
		// 출력
		System.out.println(lists2);

		
		// 2. Streaming 방식: 위를 한 줄로 줄인 
		lists.stream().filter(x -> x>=10).sorted().forEach(x -> System.out.print(x+" "));
		
		
		
		
		
		
		
	}

}

// 정렬할 때 lists2.sort 가 아니라 collections.sort를 썼네?
