// 6 
package day1;

// 상속 관계에서만 허용 -- 클래스들간의 형변환
// upcast: 타입을 상위 타입으로 변경한다 -- 형변환 (type casting)
// 상속관계에서 자식이 부모타입으로 변경하는 것
// 오토캐스팅
public class UpcastDemo {

	public static void main(String[] args) {
		Person p = null ; // 객체 초기화
		Student s = new Student() ;
		
		p = s ; // = (Person) s 
		
	}

}
