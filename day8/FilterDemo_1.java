package day8;

import java.io.PrintStream;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import day7.Nation;
import day7.Nation_0;
import day7.Util;

public class FilterDemo_1 {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2", "c3");
		
		
		String str = "abcde";
		System.out.println(str.startsWith("a"));
		
		// Q1 c로 시작하는 문자열들만 추출
//		s1.filter( x -> x.startsWith("c")).forEach(x -> System.out.print(x + " "));
		Stream<String> s2 = s1.filter( x -> x.startsWith("c"));
//		s2.forEach(x -> System.out.print(x + " "));
		s2.forEach(Util::print);
		
		System.out.println();
		IntStream i1 = IntStream.of(1,4,5,1,4,5,8,4,7,4,1,5);
		// Q2 짝수만 골라서 출력
		i1.filter( x-> {return x%2 == 0;} ).forEach(Util::print);
		System.out.println();
		
		// Q3 population 100보다 큰 나라만 출력
		List<Nation> lists = Nation.nations;
		Stream<Nation> sn1 = Nation.nations.stream();
		Stream<Nation> sn2 = sn1.filter(x -> x.getPopulation() > 100 );
		sn2.forEach(x -> System.out.print(x.getName() + " "));
	}

}

// c로 시작하는 문자열들만 추출
// x.startsWith("c")

// 길게 sysout 쓰지말고 
// 이전에 만들어둔 (Util::print) 쓰면 편함