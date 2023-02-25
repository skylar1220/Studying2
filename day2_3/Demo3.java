package day2_3;

public class Demo3 {

	
	public static void fff (Controllable a) { //@@ 이 메소드
		if(a instanceof NoteBook) { // 2. 인스턴스오브를 해보면 되지
			NoteBook ab = (NoteBook)a;// @@1. 만약, tv 객체라면 안되는데 타입 어떻게 할래?
		}
		else if (a instanceof Tv) { 
			Tv ab = (Tv)a;
		}
	}
	
	public static void main(String[] args) {

		

		
		// @ 인터페이스 타입 = 구현 객체 	// up- casting 자동인 경우임
		Controllable c = new  Tv();
		c = new NoteBook(); // 컨트롤러블, 리페어 등의 같은 부모를 갖고있으니까 
							// -> c. 해봐야 노트북소유는 안보이고, 컨트롤러블에 해당하는 애들만 보여짐
		c.turnOn(); 
	

		
		// @ 구현 객체 타입 = (구현 객체 타입) 인터페이스 타입 	// down-casting 수동
		NoteBook n = (NoteBook)c;
		n.turnOn();
		
		
		// @@ 다형성 : 다양한 형태로 존재, 부모 타입으로 자식 객체를 보관하는 기법
		// 사용 : 부모와 자식이 메소드를 가질 때)(override) 부모 타입으로 해당 메소드를 호출하면
		// 		실 객체의 메소드가 자동으로 호출된다. (따로 타입캐스팅으로 타입 변환과정이 필요 없음)
		
		// 만약에... 실 객체만 가지고 있는 메소드가 필요할 때는 해당 타입으로 캐스팅 해줘야 하는데...
		// 			어떤 객체가 들어 있는지 모른다. 

//		// @@@ 경우1) 상속 받아서 만든 클래스가 자주 사용할 애면 원래대로 하면 되고
//		class OnlyOnce extends Parent{
//			// 오버라이딩 메소드
//			//
//		}
//		Parent p = new OnlyOnce ;
//		
//		// 경우2) 그게 아니라 한 번 쓰고 말 것 같으면 굳이 상속해줘야 하니까 클래스를 만들지 않고
//				// 익명 클래스 만들면 됨
//		Parent p = new Parent ;
		
		
	}

}
