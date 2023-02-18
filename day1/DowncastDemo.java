// 7
package day1;

// 상속 관계에서만 허용 -- 클래스들간의 형변환
// Downcast: 타입을 자식 타입으로 변경한다 -- 형변환 (type casting)
// 부모타입의 객체를 자식타입으로 전달하는 모습, 이때 부모타입의 객체는 타입만 부모지 실제 자식객체일 때라 가능
public class DowncastDemo {

	public static void main(String[] args) {
		Person p = new Student() ; // 업캐스트 자동
		Student s = (Student) p ; // 다운캐스트 수동

		// 객체 p는 자신의 타입의 객체가 있을 수도 있고.. 자식들의 객체가 들어있을 수도 있다.
		
		// 이건 안 됨
		Person p1 = new Person();
		Student s1 = (Student) p1 ; // 강제로 타입변환하는 거라
		
		// 이건 됨
		Student s2 = new Student() ;
		Person p2 = s2;
		Student s3 = (Student) p2 ;
		
	}

}
