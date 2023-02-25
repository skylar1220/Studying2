package day2_3;

class Reso implements AutoCloseable { // finally 안써도 AutoCloseable 하면 저렇게 자동으로 클로즈가 호출됨 : 리소스 수거 출룍 해줌
	// 만약 저 오토를 상속 안받으면 오류? 왜? : try resourse때문인듯 try(여기엔 리소스) ~~ catch : try를 함수처럼 쓰는 방법
	public void show()  {
		System.out.println("리소스 할당");
	}

	public void close() throws Exception {
		System.out.println("리소스 수거");
	}
}

public class Demo8 {

	public static void main(String[] args) {

		
		try (Reso a= new Reso()) { // 여기 왜 괄호가 들어가야하지?
			a.show();
			System.out.println("로직 수행");
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		finally {
//			a.close();
//		}

	
		System.out.println("로직 종료");

	
		
	}

}

// 예외는 언제 던지고 언제 처리해야할까?
// 간단한 계산하는 메소드라면 거기서 처리하지 말고 던지고
// 그걸 활용하는 메소드에서 처리하기