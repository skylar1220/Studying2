package day7;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo2_6 {

	public static void main(String[] args) {
		Stream<String> ss;
		
		List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
		List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
		List<Gender> genders 
		= List.of(Gender.MALE, Gender.FEMALE, Gender.MALE, Gender.MALE, Gender.MALE, Gender.FEMALE);
		
		Stream<Integer> as =  ages.stream() ;
		System.out.println(as.reduce( 0, (a, b) -> a+b ));
		
		as =  ages.stream() ;
		
		
//		System.out.println(as.max( (a,b) -> a-b ).get() );
		System.out.println("최댓값: " + as.max( Integer::compare ).get() );
		
		as =  ages.stream() ;
		System.out.println("최소값: " +ages.stream().min( Integer::compare ).get() );
		
		IntStream is =  ages.stream().mapToInt(x -> x.intValue());
		System.out.println("평균: "+ is.average().getAsDouble());
		
	}

}

enum Gender {
	MALE, FEMALE
}

// 매번 여는게 귀찮으면 ages.stream() 이렇게 앞에 붙이기
// intstream으로 바꿀 땐 mapToInt