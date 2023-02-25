package day2_3;

import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		try {
			square(in.nextLine());
		} catch (NumberFormatException e) {

			System.out.println("정수가 아닙니다");
		}
		
	}

	private static void square (String s) throws NumberFormatException {

		int n = Integer.parseInt(s); // 이거 활용 보자: 뭐 입력받았을 때 스트링이니가 int로 바꾸는 기능
		System.out.println(n*n);
	}
}
