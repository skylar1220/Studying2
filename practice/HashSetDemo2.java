package practice;

import java.util.HashSet;
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
	
	
}

public class HashSetDemo2 {

	public static void main(String[] args) {
		Set<Fruit> fruits = new HashSet<Fruit>();
		fruits.add(new Fruit("apple"));
		fruits.add(new Fruit("apple"));
		System.out.println(fruits.size()); 
		fruits.forEach( x -> System.out.println(x) );
		

	}

}
