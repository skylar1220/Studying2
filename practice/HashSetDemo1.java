package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;

public class HashSetDemo1 {

	public static void main(String[] args) {
		String [] fruits = {"apple", "banana", "pineapple", "grape"  };
		Set<String> sets = new HashSet<String>() ;
		
		for (String s : fruits) {
			sets.add(s);
		}
		
	}

}


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
