package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import day5.Car;

public class FunctionalDemo2 {
	// @평균 함수
	// 함수에 카리스트를 던져주면 평균 연식이나 주행거리를 알려주는 것
	private static double average(List<Car> carlist, ToIntFunction<Car> f ) { // 콤마 뒤에 들어갈 함수형 인터페이스
		double total = 0 ;
		for (Car car : carlist) {
			// 함수형인처페이스메소드.메소드 --> 적당한 이걸 찾아내면 될 것 같은데...
			total += f.applyAsInt(car);
		}
		return total / carlist.size();
	}
	
	
	
	public static void main(String[] args) {
		List<Car> carlist = new ArrayList<Car>();
		carlist.add(new Car("grandure", true, 12, 240000));
		carlist.add(new Car("sonata", true, 2, 40000));
		carlist.add(new Car("avanteur", true, 8, 160000));
		carlist.add(new Car("kona", false, 15, 300000));
		carlist.add(new Car("korando", false, 20, 400000));
		System.out.println(  );
		
		// 함수형 인터페이스를 새로 만들거나 또는 기존 거 사용하거나 해서
		// 평균 연식
		// 평균 주행거리
		
//		ToIntFunction<Car> f1 = c -> c.getAge() ; //@@

		System.out.println("평균연식: "+ average( carlist, c -> c.getAge())); 
		System.out.println("평균주행거리: "+ average( carlist, c -> c.getMileage())); 
		
		
	}

}

// 저 평균함수 부분이 마일리지와 에이지가 중복되니까 
// 저 중복되는 부분을 인터페이스로 뺄 수 있지 않을까?
