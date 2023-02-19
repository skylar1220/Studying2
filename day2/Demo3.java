// 4 작성 이해 안감
package day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// couple 

public class Demo3 {

	public static void main(String[] args) {
		// ArrayList<Integer> ary = new ArrayList<Integer>();
		// 이제 아래와 같이 쓰도록 권장 , 다형성을 최대한 활용하자
		List<Integer> ary = new LinkedList<Integer>() ; // 얘는 어레이랑 다르게 속도는 빠른데 순서 지정은 안 됨
		
		A a = new A();
		ABC abc = new C(); // 1
		
		ABC abc2 = new ImplABC(); //@2

		
		// 다형성
		a.display(abc);
		
		ImplABC temp = new ImplABC();
		a.displayCoupling(null);
		
//		ABC abc = new B();
//		a.display(abc);
		
		
	}

}
