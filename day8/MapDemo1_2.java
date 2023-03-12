
package day8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import day7.Util;

public class MapDemo1_2 {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
		// 대문자로 변경
		Stream<String> s2 = s1.map(String::toUpperCase);
		s2.forEach(Util::print);
		System.out.println();
		
		// 숫자만 뽑아서 출력
		s1 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
		Stream<String> s3 = s1.map( x -> x.substring(1));
		IntStream s4 =  s3.mapToInt(Integer::valueOf);
		s4.forEach(Util::print);

	}

}

// x -> x.toUpperCase() 
// => String::toUpperCase


// x -> Integer.valueOf(x)
// => Integer::valueOf

// 원래는 charat을 쓸 텐데 그렇게 하면 아래줄에서 valueof, parseint 를 못쓰니 (string이여야해서)
// 그래서 비슷한 역할인 string ver . substring으로 씀