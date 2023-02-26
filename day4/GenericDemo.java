
//1
package day4;

public class GenericDemo {

	public static void main(String[] args) {

		Cup c = new Cup();
		c.setBeverage(new Boricha());
		Boricha boricha = (Boricha) c.getBeverage(); // 오른쪽 애는 오브젝트니까 다운캐스팅 해줘ㅑㅇ
		c.setBeverage(new Beer());
		Beer beer = (Beer)c.getBeverage();
		
//		Cup <T> cc = new 
		
	}

}
