package day5;

import java.util.ArrayList;

interface Negative{
	int neg(int x) ;
	
}

class NegativeImp implements Negative{ 

	@Override// @@
	public int neg(int x) { 
		return -x;
	}
	
}

public class LamdaDemo {

	public static void main(String[] args) {

		Negative n =new NegativeImp(); //@@
		n = new Negative() {
			
			@Override
			public int neg(int x) {
				return -x;
			}
		};
		
//		System.out.println(  n.neg(10)  );
		
		n= (int x) -> {return -x ;}; //@
//		System.out.println(  n.neg(8)  );

		// 다양한 변형, 생략 가능 
		n= (x) -> {return -x ;}; 
		n= x -> {return -x ;}; 
		n= x ->  (-x) ; 
		n= x ->  -x ; 
		
}
}

// 1. 인터페이스를 줬으니
// 얘를 구현해봐라
// 근데 이 인터페이스에 함수가 하나니까, 이런 경우, 바로 함수가 하나인 경우에만 람다를 쓸 수 있는 거다.
// 앞의 두 @@들을 @람다식으로 한 줄로 줄일 수 있음
// 그니까 위에서 인터페이스로 틀만 준거를 아래에서 이름 없이 함수 작동하는 내용만 서술하면 쓸 수 있다는 거지?
