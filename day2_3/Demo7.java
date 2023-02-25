package day2_3;

import java.util.Scanner;

public class Demo7 {

	public static void Test() {
		Scanner sc  = null;
		try {
			 sc = new Scanner(System.in);
			System.out.println("숫자를 입력하세요");
			String number = sc.next();
			int num = Integer.valueOf(number); // 문자열을 숫자로 바꿔줬음 @@!! 이거!! 정리 valueof
			System.out.println(10 / num);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			sc.close(); // 메모리 절약?
		}

		System.out.println("프로그램 종료") ;

	
	}

	public static void main(String[] args) {

		Test();

	}
}
	
	

// 1. e.printStackTrace(): 죽지않고 에러메시지 출력하고 뒤에는 계속 실행됨
// 2. getmessage
// 3. 


// @1. exception은 runtimeException과 그냥이 있는데
// runtime은 실행 한 후에 알 수 있으니 
// 그냥이 더 안전하겠지?