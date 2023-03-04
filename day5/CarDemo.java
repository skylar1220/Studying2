package day5;
//@@ 와 너어무 어렵다 다 다시 쳐봐야겠다

//6


import java.util.ArrayList;
import java.util.List;

public class CarDemo {
	
	private static List<Car> findCars(List<Car> all, CarPredicate cp){
		List<Car>  result = new ArrayList<Car>();
		for (Car car : all) {
			if (cp.test(car)) {
				result.add(car);
			}
		}
		return result;
	}
	private static void printCars(List<Car> all, CarCunsumer cc){
		List<Car>  result = new ArrayList<Car>();
		for (Car car : all) {
			cc.apply(car);
			}
		}

	public static void main(String[] args) {

		List<Car> carlist = new ArrayList<Car>();
		carlist.add(new Car("grandure", true, 12, 240000));
		carlist.add(new Car("sonata", true, 2, 40000));
		carlist.add(new Car("avanteur", true, 8, 160000));
		carlist.add(new Car("kona", false, 15, 300000));
		carlist.add(new Car("korando", false, 20, 400000));
		
		// 디젤 자동차만 찾기
		List<Car> cars =  findCars(carlist, (c) ->  !c.isGasoline());
		printCars(cars, (c) -> { System.out.println(c); });
		
		System.out.println("--------------------------------");
		
		// 년식이 10년 이상 된 차량만 출력
		cars =  findCars(carlist, (c) -> c.getAge() >= 10 );
		printCars(cars, (c) -> { System.out.println(c); });
		
		System.out.println("--------------------------------");

		// 디젤 중에서 10년 이상된 차량만 출력
		List<Car> cars1 =  findCars(carlist, (c) ->  !c.isGasoline() && c.getAge() >= 10  );
		printCars(cars1, (c) -> { System.out.println(c); });
		
		
		
	}
	

}
