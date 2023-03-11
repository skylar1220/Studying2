package day7;
// 여기부터 이해 필요
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Demo_5 {

	public static void main(String[] args) {
		Stream<String> ss;
		List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");

		// 성이 김씨인 사람들 찾아서 출력
		names.stream().filter( x -> x.charAt(0)=='김').forEach(x -> System.out.println(x)) ;

		
		// 정렬
		names.stream().sorted().forEach(x -> System.out.println(x));
		System.out.println();
		
		// 총 몇 명인지 출력
		System.out.println(names.stream().count());
		// 역순
		names.stream().sorted(Collections.reverseOrder()).forEach(x -> System.out.println(x));
		
		
//		// 성이 김씨인 사람들 찾아서 출력
//		
//		Optional<List<String>> o = Optional.ofNullable(names);
//		if(o.isPresent()) {
//			System.out.println("있음");
//		} else {
//			System.out.println("없음");
//		}
//		
//		// 정렬
//		Collections.sort(names);
//		
//		// 총 몇 명인지 출력

	}

}

// charat은 char라 ''
