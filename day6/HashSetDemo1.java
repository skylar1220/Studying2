package day6;

//3


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;

public class HashSetDemo1 {

	public static void main(String[] args) {
		String [] fruits = {"apple", "banana", "pineapple", "grape"  };
		Set<String> sets = new HashSet<String>();
		
		for (String s : fruits) {
			sets.add(s);
		}
		
		// 과일바구니에 바나나가 들어있는지
		sets.contains("banana");
		System.out.println(sets.contains("banana"));
		
		// array <-> collection 변환: Arrays.asList
		// list -> array
		List<String> lists = Arrays.asList(fruits);
		System.out.println(lists);

		// array -> list
		Object []  listsArray = ( Object [] ) lists.toArray();
		for (Object object : listsArray) {
			System.out.println(object.toString());
		}
	
		
		Integer [] it = new Integer [] { 1,2,3,4,};
		List<Integer> it2 =  Arrays.asList(it);
		
		IntFunction<Integer[]> temp = x -> new Integer [] {x+2, x-2, x*2 };
		Integer[] result = temp.apply(0);
		
	}

}

//
//@FunctionalInterface
//public interface IntFunction<R> {
//
//    /**
//     * Applies this function to the given argument.
//     *
//     * @param value the function argument
//     * @return the function result
//     */
//    R apply(int value);
//}
// int를 넣을 때 R이라는 타입으로 변환해준다는 뜻? -> 읽는 법 알아보자
