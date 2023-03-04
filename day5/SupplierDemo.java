package day5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("MM월 dd일(E요일)  a hh:mm:ss");
		Supplier<String> s2 = () -> format.format(new Date());
		System.out.println(s2.get());
		
		Supplier<String> s = () -> "Fruit" ;
		System.out.println(s.get());
		
		int [] x = {0};
		IntSupplier is = () -> x[0]++;
		for (int i = 0; i < 3; i++) {
			System.out.println(is.getAsInt());
		}
		
		DoubleSupplier ds = () -> Math.random() * 10 ;
		System.out.println(ds.getAsDouble());
	}

}
