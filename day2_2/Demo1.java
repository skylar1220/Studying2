package day2_2;

public class Demo1 {
// 인터페이스를 사용하지 않는 함수 - 커플링
	public static void show(Adult a) {
		a.howOldAreYou();
	}

	// 인터페이스를 사용해서 디커플링된 함수 -- 왠만하면 이 인터페이스 타입으로 만들어라
	public static void showObject(Person a) {
		a.howOldAreYou();
	}
	
	public static void main(String[] args) {
		// 인터페이스 버전
		Person data = new Child();
		showObject(data);
		
		// 커플링 안좋은 버전
		Adult ad = new Adult();
		show(ad);
	}

}
