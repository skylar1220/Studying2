package day7;

import java.util.Random;
import java.util.stream.IntStream;

public class Laziness1Demo_4 {

	public static void main(String[] args) {
		
		IntStream is = IntStream.rangeClosed(1, 5) ;
		is.filter(x -> {
			System.out.println("filter:"+ x);
			return x % 2==0;
		}).map ( x -> {
			System.out.println("map:"+x);
			return x*x;
		}).forEach(x -> System.out.println("foreach="+ x)); ;
		
	}

}

//@ filter에 왜 리턴이 들어갔지?