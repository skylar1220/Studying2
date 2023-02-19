// 1-1 어렵다 다시 쳐보자..
package day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo1 {
	private static int showMenu() {
		System.out.println("다음 메뉴를 선택하세요"); // 함수 중 이런경우만 private!: 그 클래스 안의 메인함수와 함께 써야만하는 서브함수의 경우
		System.out.println("1. 입장객 등록");
		System.out.println("2. 수입");
		System.out.println("3. 종료");
//		Scanner sc = new Scanner(System.in);
//		return sc.nextInt();
		return (new Scanner(System.in)).nextInt(); // 이렇게 줄임
	}

	private static void showPerson() {
		System.out.println("1. 어른");
		System.out.println("2. 청소년");
		System.out.println("3. 어린이");
		System.out.println("4. 이전 메뉴");

	}

	private static void processChoicePerson(ArrayList<Person> lists) { // 어른인지 선택함수 = 1. showPerson()입력받는거
		int choice = 0;
		while (choice != 4) { // @ while을 선택했네  // 이전메뉴가 아니면 계속 어른인지 애인지 입력받기
			showPerson();
			choice = (new Scanner(System.in)).nextInt();
			if(choice == 1) lists.add(new Adult());
			else if(choice == 2) lists.add(new TeanAger());
			else if(choice == 3) lists.add(new Child());
		}
	}

	
	private static String makeComma(long number) {
		String num = String.valueOf(number);
		int count = 1;
		String str = "";
		for (int i = num.length()-1 ; i > -1 ; i--) {
			str += num.charAt(i);
			if ( count % 3 == 0 && i != 0) {
					str += ",";
			}
			count++;
		}
		// 문자열 다시 뒤집기
		String str2 = "";
		for (int i = str.length()-1; i > -1; i--) {
			str2 += str.charAt(i);
		}
		return str2;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Person> lists = new ArrayList<Person>();
		
		
		
		int choice = showMenu(); // 최초 메뉴 선택
		if (choice == 3)
			return; // 종료면 종료

		while (choice == 1) { // 입장객 선택 메뉴면
			processChoicePerson(lists); // 입장객 선택하는데, 만약 이전 메뉴를 선택하면 종료
			choice = showMenu(); // 메인메뉴 호출 다시 입장객 선택이면 순환
			if (choice == 3)
				return; // 종료면 종료

		}

		// 2번 수입을 선택했을 경우
		System.out.println("2번을 선택했습니다. 총 수입을 산출합니다.");
		long totalPrice = 0;
		
		for (Person person : lists) {
			totalPrice += person.getPrice() ;
		}
		

		System.out.println("입장인원\t어른\t청소년\t어린이\t총 수입");
		System.out.printf("%d\t%d\t%d\t%d\t%s\n", Person.getCount() , Adult.getCount() , TeanAger.getCount(), Child.getCount(), makeComma(totalPrice));

		
	}
}
