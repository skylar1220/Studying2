// 1-1 어렵다 다시 쳐보자..
package day2;

public class Demo2 {
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
		System.out.println(makeComma(123456));
		
		
		
		
		
		
//		long num = 1235123;
//
//		// 숫자를 문자열로 변환
//		String a= num +"";
//		String b = String.valueOf(num);
//		
////		System.out.println(b.charAt(0));	// 2
//		int lastIndex = b.length() - 1 ;
////		System.out.println(b.charAt(lastIndex));	
//		
//		
//		// hint 뒤에서 3자리씩 콤마를 찍어서 무자열 합으로 문자열들을 합친다.
//		// 원본이 아니라 새로운 문자열을 만들어서 콤마 붙여주기
//		// 역순이었으니까 다시 거꾸로 만들어주기
//		// 3의 배수가 되면 콤마
//		// 321,532,1 -> 뒤집는다
//		// 3자리 콤마만들기 (단, 역순)
//		
//		
//		// 문자열 다시 뒤집기
//		String str2 = "";
//		for (int i = str.length()-1; i > -1; i--) {
//			str2 += str.charAt(i);
//
//		}
//		System.out.println(str2);
//		System.out.println(b);

		
		
		

		
	}

}
