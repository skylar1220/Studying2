package day7;

public class Util {

	public static <T> void print(T t) {
		System.out.print(t + " ");
	}
	
	public static <T> void printWithParenthesis(T t) {
		System.out.print("("+ t + ")");
		
	}
	
	
}

// 만약 t가 파라미터가 아니라 클래스에서 생성된 변수라면 static 안되겠지만
// 파라미터를 외부에서 받도록 하는 함수라서 static으로 했음

