package day7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Array2StreamDemo_3 {

	public static void main(String[] args) {
		int [] array_int = {1,5,4,8,4,1,4,};
		IntStream is = Arrays.stream(array_int);
		IntStream is2 =IntStream.of(array_int);
		
		System.out.println(is.average().getAsDouble());
		System.out.println(is2.average().getAsDouble());
		
		String [] strs = {"aa","bb","cc","dd","bb"};
		Stream<String> ss = Stream.of(strs);
//		ss.distinct().forEach(x -> System.out.print(x+ " "));
//		System.out.println(ss.count());
		
		IntStream is1 = IntStream.iterate(1, x -> x+2).limit(5) ;
		IntStream is3 = new Random().ints(0, 10) ;
		is1.forEachOrdered(x -> System.out.println(x));
	}

}

// intstream의 기능 사용해보기
// average
// getAsDouble

// stream의 기능 사용해보기
// distinct: 중복제거
// count : 갯수세주기

// is/ is2 2가지 방법이 있다.

// string으로 된 strs 배열은  intstream 같은 애가 없으니
// 그냥 객체stream 으로 바꿔서 써야한다.
// stream은 한 번 쓰면 닫히니까 위에 막아줘야함

// is1, 3 : 무한히 반복하는 애가 되버렸음
// .limit(5): 해결!