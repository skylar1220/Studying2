package day5;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

		Predicate<Integer> p = x -> x >= 0  ;
		System.out.println(p.test(-20));
		int [] ary = {-8, 2, 5, -9, 2 };
		for (int i : ary) {
			if ( p.test(i)) {
				System.out.println(i);
			}
		}
		
		Consumer<String> c = x -> System.out.println(x.toLowerCase()) ;
		c.accept("aaBaB");
		
		BiConsumer<String , String> bc = (a,b) -> System.out.println(a+b);
		bc.accept("a", "b");
		
//	    default IntConsumer andThen(IntConsumer after) {
//	        Objects.requireNonNull(after);
//	        return (int t) -> { accept(t); after.accept(t); };
//	    }
		System.out.println("----------------------");
		IntConsumer ic = x -> System.out.println(x);
		IntConsumer ic2 = ic.andThen( x -> System.out.println(x*10)  );
		ic2.accept(20);
		
		
	}

}

//void accept(int value);
// ic.andThen: ic 기능 하고 나서 얘도 추가로 기능하는 방식