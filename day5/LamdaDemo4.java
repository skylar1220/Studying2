package day5;
//@@ 와 어렵다 다 다시 쳐봐야겠다
interface NewObject<T> {
	T getObject(T o);
}

interface NewArray<T> {
	T [] getArray(int size);
}

public class LamdaDemo4 {
	public static void main(String[] args) {

		NewObject<String> s;
		NewArray<Integer> i;

		s = (String str) -> { return str; };
		s = str -> new String(str);
		s = String::new;
		String str = s.getObject("hello");
		
		i = size -> new Integer [size] ;
		i = Integer[]::new;
		System.out.println(i.getArray(10));
		
		
//		s = (String o) -> { return o + "?" ;};
//		s.getObject("d");
//		System.out.println(s.getObject("d"));
//		
//		i = (int size) -> { return  ;};

	}
}
