package day2_3;

//
//


public class Demo6 {
	
	public static void tic() throws InterruptedException {
		for (int i = 0; i < 10; i++) {

//			// 방법1: trycatch 내가 처리하거나
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);  // 이 코드를 실행하면 예외가 발생할 가능성이 있으므로 처리하라고 알려줌
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			// 방법 2: 떠넘기거나
			System.out.println(i);
				Thread.sleep(1000);  // 이 코드를 실행하면 예외가 발생할 가능성이 있으므로 처리하라고 알려줌
			
		}
	}

	public static void main(String[] args) {
		try {	// 3. 넘겨진 애가 예외 처리하기
		tic();  
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		}

}


// +1. 다수의 예외를 한꺼번에 잡으려면 | 연산자 (||두개 아님) 로 연결하면 됨. 중복 방지할 수 있음.