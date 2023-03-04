package day5;
//@@ 와 어렵다 다 다시 쳐봐야겠다

interface Mathmatical{
	double calculate(double b);
}

interface Pickable{
	char pick (String s, int i);
}

interface Computeble{
	int compute (int x , int y);
}

class Utils{
	int add( int a, int b) {
		return a+b;
	}
}



public class LamdaDemo3 {
	public static double my(double b) {
		return Math.abs(b);
	}

	public static void main(String[] args) {
		
		
		Mathmatical m ; 
		Pickable p;
		Computeble c ; 
		
		// 람다식 기능을 구현 ( - 도 +로 만들어주는 함수로 만들어서 )
		m = ( double b ) -> { return (b>0)? b : -b ; };
		m = b -> (b>0)? b : -b ;
		m.calculate(-5.5);
		System.out.println(m.calculate(-5.5));
		
		
		// 람다식 기능을 구현 ( 기존 math.abs를 이용한 )
		m = b -> Math.abs(b);
		m.calculate(-50.2);
		System.out.println(m.calculate(-50.2));
		
		
		// 기존 math 클래스의 abs 함수를 m으로 참조
		m = Math::abs;
		m.calculate(-53.2);
		System.out.println(m.calculate(-53.2));
		
//		String a = "abc";
//		a.charAt(0);
		p = (String s, int i) -> { return s.charAt(i) ;};
		p = (String s, int i) ->   s.charAt(i) ;
		p = (s, i) ->   s.charAt(i) ;
		p = String::charAt;
		p.pick("abc", 0);
		
//		c = Math.addExact(2, 3)
		c = Math::addExact;
		c.compute(2, 3);
		System.out.println(c.compute(2, 3));
		
		// 클래스도 Math 방법으로 부를 수 있음
		Utils u = new Utils();
		c = (a,b) -> u.add(a, b);
		c = u::add;
	}
	
}

// 삼항연산자

// 직접 구현해도 되고 
// 기존 math의 abs 기능을 써도 되고, 
// 속해있는 위에거::쓸 함수, 메소드