package day5;

import java.util.Arrays;
import java.util.Comparator;

class Rectangle implements Comparable<Rectangle> {
	private int width, height;
	public Rectangle( int width, int height){
		super();
		this.width = width ;
		this.height = height ;
	}
	public int findArea() {
		return width*height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	@Override
	public int compareTo(Rectangle o) {
		return -( this.findArea() - o.findArea()) ;
	}
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		Rectangle[] r = {
				new Rectangle(10,5),
				new Rectangle(2,5),
				new Rectangle(4,3)
		};
		
		System.out.println("----------------------------------------");
//		// 방법1. 클래스 내부에 정렬 기능을 내장
//		Arrays.sort(r);
//		for (Rectangle rectangle : r) {
//			System.out.println(rectangle);
//			
//		}
//		
//		// 방법2. 정렬을 수행하는 익명 클래스 객체를 바로 생성해서 사용
//		// -- 근데 이것도 길다? => 람다!
//		Arrays.sort( r, new  Comparator<Rectangle>() {
//			@Override
//			public int compare(Rectangle o1, Rectangle o2) {
//				return o1.findArea() - o1.findArea();
//			}
//		}
//		);
		
		Arrays.sort(r, ( a,b ) ->  a.findArea() - b.findArea() );
		for (Rectangle rectangle : r) {
			System.out.println(rectangle);
			
		}
		
	}

}

// 1. Arrays.sort(r); 하면 ClassCastException 오류가 발생하게 됨
// 2. 클래스가 comparable 이어야 한다고 하니 rectangle 클래스에 그걸 상속 해주면 되겠지 (추가 상식: ~able은 옛날거라 인터페이스 implements일 것이다.)

// @1. 람다
// @2. compare 기능만 하는 함수만 필요했던 거라
// @3. a.만 해도 얘가 랙탱글 클래스 객체라는 걸 안다.