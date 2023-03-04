package day5;

import java.util.ArrayList;
import java.util.List;

public class UpCustomerDemo2 {

	public static void main(String[] args) {
		List<UpCustomer2> lists = new ArrayList<UpCustomer2>();
		UpCustomer2 c = new UpCustomer2("홍");
		c.buy(1000);
		c.buy(10000);
		c.buy(100);
		c.buy(1000000);
		System.out.println(c);
		
		
		
//		lists.add(new Customer(5000000, "홍길동"));
//		lists.add(new Customer(100000000, "김재벌"));
//		lists.add(new Customer(25000000, "박부자"));
//		System.out.println(lists);
	}
	
	

}