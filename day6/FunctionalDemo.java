package day6;

//1

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;

public class FunctionalDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> add = x -> x+2 ;
		Function<Integer, Integer> mul = x -> x*2 ;
		
		add.apply(2); // 5
		mul.apply(3); // 6
		
		add.andThen( mul ).apply(3);
		System.out.println(add.andThen( mul ).apply(3));
		
		add.compose(mul).apply(3);
		System.out.println(add.compose(mul).apply(3));
		
		IntToDoubleFunction half = x -> x / 2.0 ;
		System.out.println(half.applyAsDouble(5));
		
		ToDoubleBiFunction<Double, Integer > circleArea =  (a, b ) -> a * b * b ;
		System.out.println(circleArea.applyAsDouble(3.14, 5));
				 
		ToDoubleBiFunction<Double, Integer > circleArea1 =  (a, b ) 
				->  Double.parseDouble(a) * b* b;
				System.out.println(circleArea.applyAsDouble(3.14, 5));

		
	}

}
