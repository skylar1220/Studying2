package day2_3;
//실행해야 아는 예외
// RuntimeException 계열.. 검사를 하지 않고 실행시 exception이 발생
import java.util.StringTokenizer;

public class Demo5 {

	public static void main(String[] args) {

		// RuntimeException 계열.. 검사를 하지 않고 실행시 exception이 발생
		String s = "time is money";
		StringTokenizer st = new StringTokenizer(s);  // 문자에서 단락별로 읽었음
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
//		System.out.println(st.nextToken()); // 이러면 더 읽을 단락이 없어서 exception이 발생함
		
		int [] ary = {1,2,3};
//		System.out.println(ary[3]);// outofbound EXCEPTION // 실행해야 아는 예외
	}

}
