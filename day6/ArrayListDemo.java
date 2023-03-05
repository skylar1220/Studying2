package day6;

//2


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListDemo {

	public static void main(String[] args) {

		// ArrayList 사용하고 이해하기
		// 객체 생성
		List<Integer> str = new ArrayList<Integer>();
		
		// 요소 저장
		str.add(1);
		str.add(1);
		str.add(1);
		str.add(1);
		str.add(1);

		// foreach 사용해서 출력하기
		str.forEach(x -> System.out.println(x) );
	}

}

// @ 왜 저기서 리턴이 엉ㅄ는지... 보이드라 그런가?