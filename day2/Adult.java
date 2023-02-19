// 1-2
package day2;

import day2.Person;

public class Adult extends Person {
	private static int count = 0 ;
	Adult () {count++;}
	
	public static int getCount() {
		return count;
	}

	@Override
	public int getPrice() {
		return super.getPrice();
	}


}
