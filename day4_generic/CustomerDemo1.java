package day4_generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDemo1 {

	public static void main(String[] args) {

		Customer c = new Customer(1, 120, "rich");
		c.getGrade();
		c.getTotal();
		c.getName();
		
		List<Map<String, String>> lists = new ArrayList<Map<String, String>>();
		
		CusGrade = c.getGrade() + "" ;
		
		
//		c.setTotal(50);
//		
//		if ( c.getTotal() > 100 ) {
//			c.setGrade(1);
//			System.out.println("20퍼센트 적립입니다. ");
//		}
//		else if (c.getTotal() > 50 ) {
//			c.setGrade(2);
//			System.out.println("10퍼센트 적립입니다. ");
//
//
//		}
//		else if (c.getTotal() < 50) {
//			c.setGrade(3);
//			System.out.println("5퍼센트 적립입니다. ");
//
//
//		}
//		
	}

}
