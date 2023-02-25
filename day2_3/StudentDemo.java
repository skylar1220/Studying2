package day2_3;
// @@ 이해필요 여기 다!
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//class aaa implements Comparator<Student>{ // 2. 그래서 만들어주고 오버라이딩 해줬음.
//
//	@Override
//	public int compare(Student o1, Student o2) {
////		return o1.jumsu - o2.jumsu ;  // 3. 양수일때 오름차순, 음수일 때 내림차순으로 정렬해주는 기능!
////		return 2; // 3. return음수일 때 바뀌네?
////		return o1.name.compareTo(o1.name); //4. 이렇게하면 알파벳순으로도@
//		return -(o1.jumsu - o2.jumsu); //6. @@1경우
//	}
//}

public class StudentDemo {

	public static void main(String[] args) {
		// 5명의 학생 객체를 만들어서 리스트에 담아 보세요 동적배열
		List<Student> st = new ArrayList<Student>();
		st.add(new Student("b", 80)); // @@ 여기 이해@
		st.add(new Student("c", 70));
		st.add(new Student("d", 60));
		st.add(new Student("e", 50));
		st.add(new Student("f", 90));
		System.out.println(st);
		
		// 5. 리스트에 들어있는 학생데이터를 점수가 높은 순으로 정렬하고 출력해라 //@@1경우
		
		
//		st.sort(new aaa()); // 1. sort는 매개변수로 compartor 있어야 한다고 원해함
		st.sort(null);
		System.out.println(st);

		
		// -------- 이후 조금 있다가
		// 리스트에 들어있는 학생데이터를 이름 순으로 정렬하고 출력해라//@@2경우
		
		// 7. 이런 경우는 일회성이 낫잖아! 그래서 이걸 쓰는 거: 익명 클래스
		st.sort(
				new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.name.compareTo(o1.name);
						}
				}
				);
		System.out.println(st);
	}

}

// 8. comparable 그 클래스는 정렬을 당할 수 있는 기능이 생기는 것
// 정렬 방법을 바꾸려면 comparator를 재정의해서 쓰면 됨