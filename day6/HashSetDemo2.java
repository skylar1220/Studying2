package day6;

//3


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Fruit{
	String name;

	public Fruit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Fruit target = (Fruit) obj ;
		return this.name.equals(target.name);
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	
	
}

public class HashSetDemo2 {

	public static void main(String[] args) {
		Set<Fruit> fruits = new HashSet<Fruit>();
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("banana"));
		// set의 성격을 이해하면서
		// fruits의 개수 출력
		System.out.println(fruits.size()); 
		// 모든 요소 출력
		fruits.forEach( x -> System.out.println(x) );
		
		Fruit f1 = new Fruit("pineapple");
		Fruit f2 = new Fruit("pineapple");
		System.out.println(f1.equals(f2));
		
		
		
		
//		String s1 = "apple";
//		String s2 = "apple";
//
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		
//		System.out.println(s1.equals(s2));
//		List<Object> lists = Arrays.asList(fruits.toArray());
//		System.out.println(lists.get(0).equals(lists.get(1)));
		
		
	}

}

// new 로 만들면 set이어도 중복 가능
// 근데 이 비교가 hashcode로 이루어지는 거니까
// equlas, hashcode를 오버라이딩해서 new이어도 이름 같으면 중복 안되게 만들 수 있음