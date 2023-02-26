//3


package day4_generic;

public class EntryDemo {

	public static void main(String[] args) {
		Entry <Integer, String> e = new Entry <Integer, String> (2, "a") ;
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		

	}

}
