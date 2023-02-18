// 2-1
package day1;

public class Circle {
	
	public Circle() {
		System.out.println("부모의 기본생성자");
	}
	
	public Circle(int a) {
		System.out.println( "부모의 매개변수생성자: " + a);
	}
	
	double radius = 10. ;
	
	public void secret() {
		System.out.println("비밀");
	}

	
	public void findRadius() {
		System.out.println("반지름" + radius + "센티미터");
	}
	
	public void findArea () {
		System.out.println("면적은 원주율*반지름*반지름");
		
	}

}


