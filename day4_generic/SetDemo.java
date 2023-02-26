//6
package day4_generic;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {

		Set<String> sets = new HashSet<String>(); // hash~ = 중복 허용 않는 
		sets.add("a");
		sets.add("a");
		sets.add("a");
		sets.add("a");
		sets.add("a");
		sets.add("a");
		sets.remove("a");

		System.out.println(sets);
		System.out.println(sets.size());
	}

}
