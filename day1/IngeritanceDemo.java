// 2-3

package day1;

public class IngeritanceDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball ("빨간색", 5);
		Ball c3 = new Ball(2);
//		System.out.println("원 : ");
//		c1.findRadius(); 
//		c1.findArea(); // 원본
//		
//		System.out.println("\n공: ");
//		c2.findRadius();
//		c2.findcolor();
//		c2.findArea(); // 얘는 재정의
//		c2.findVolume();
	}

}



//메소드 public 없애봐야하는데

//자식이 기본생성자 호출할 때, 부모의 기본생성자는 자동으로 호출되지만 부모의 매개변수 생성자는 자동 호출되지는 않는다? 걔는 새로정의해줘야한다?