package day6;

//4


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("a", "b", "c");
		
		list.forEach( x -> System.out.println(x));
		System.out.println("----------------");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
//			String string = (String) it.next();
			System.out.println(it.next());
		}
		System.out.println("----------------");
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		
	}

}

// it.hasNext(): 다음 다음 데이터를 찾아가는 것
// (String) it.next();: 쟤의 타입은 뭐든 올 수 있으니까 원래는 오브젝트
// 이터레이터는 몇 번 반복해서 출력하려고 하면 안된다.
// 반복하려면 Iterator<String> it = list.iterator(); 얘를 다시 가져와야해서
// 경우에 따라 foreach vs iterator