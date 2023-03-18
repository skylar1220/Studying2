package practice;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class OperatorDemo2 {

	public static void main(String[] args) {
		Comparator<Integer> comparator = ( a, b) -> a- b ;
		BinaryOperator<Integer> a = BinaryOperator.maxBy(comparator);
		System.out.println(a.apply(5, 2));
	}

}


// operator의 아류작 두번 째, binary
// 어떻게 구현해야할지 모르겠으면
// binary에 뜨는 빨간줄로 익명클래스 넣어보고
// 그걸 보고 뭘 구현해야할지 따라하기