package day2_3;

import java.util.ArrayList;
import java.util.List;

public class WearableDemo {

	public static void main(String[] args) {

		// wearable을 담는 리스트 만들어서
		// puton을 실행
		List<Wearble> lists = new ArrayList<Wearble>();
		lists.add(new WearbleComputer());
		lists.add(new WearbleComputer());
		lists.add(new HeadPhone());
		for (Wearble w : lists) {
			w.puton();
		}
	}

}
