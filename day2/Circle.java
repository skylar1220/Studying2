package day2;

public class Circle extends Shape {
	private int radius ;
	
	public Circle(int radius) {
		this.radius = radius ;
	}
	@Override
	void draw() {
		System.out.println("원을 그린다.");
	}
	@Override
	public double findArea() {
		return pi *  radius * radius ;
	}
	
	

}
