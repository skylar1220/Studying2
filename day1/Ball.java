// 2-2

package day1;

public class Ball extends Circle {
	String color;
	
	Ball(String color, double radius) {
//		this()  --> 생성자 안에서 자기 생성자 다시 호출하는 방법! @
//		super() --> 생성자 안에서 부모 객체 호출하는 방법!
		this.color = color ;
		this.radius = radius; //this.radius는 써클에 있는 
	}
	
	Ball(int a){ // 부모의 매개변수생성자를 불러오려면 이렇게
		super(a);
	}
	
	public void findcolor() {
		System.out.println(color + " 공이다");
	}
	
	@Override // 요 표시는 alt+shift+s 에서 불러올 수 있음!
	public void findArea() {
		System.out.println("넓이는 "+  ( 3.14* radius * radius )+ "이다");
	}

	public void findVolume() {
		System.out.println("부피는 " +( 4.0 / 3 * (3.14 * radius* radius)) +"이다");
	}

}
