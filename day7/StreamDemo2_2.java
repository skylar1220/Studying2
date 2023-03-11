package day7;
// 쉬는시간 과제 완성하기
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.IntStream;

public class StreamDemo2_2 {

	public static void main(String[] args) {
		// 로또번호 생성기 1~ 45
		// 중복없이 랜덤하게 번호 생성
		
		// 방법 1:
//		List<Integer> lists = new ArrayList<Integer>();
//		for (int i = 0; i < 45; i++) {
//			lists.add(i+1);			
//		}
//		Collections.shuffle(lists);
//		lists.subList(0, 6).forEach(x -> System.out.print(x+ " "));

		
		
		// 방법 2: stream 이용한
		
		// 중복없이 랜덤하게 번호 생성
		int [] ary=  IntStream.iterate(1, x->x+1).limit(45).toArray();
		// 배열을 list로 변환
		Arrays.stream(ary).forEach( x -> System.out.println(x+" "));
		
		
	}

}


// subList:
// Collections.shuffle: 