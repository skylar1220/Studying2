// 1-2
package day2;

// 놀이공원 입장객의 총 입장 수입
// 어른은 30000 어린이는 5000 청소년은 20000
public class Person {
	protected int price = 30000; // 상속이 될테니까

	private static int count = 0 ;
	Person(){count++;}
	
	public static int getCount() {
		return count;
	}

	public int getPrice() {
		return price;
	}
	
	
}
