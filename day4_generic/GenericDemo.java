
//2

package day4_generic;
import day4.Boricha;


public class GenericDemo {

	public static void main(String[] args) {
		Cup <Boricha> c = new Cup<Boricha> ();
		c.setBeverage(new Boricha());
		c.getBeverage();
		Boricha boricha = c.getBeverage();
		
		Cup<Beer> c2 = new Cup<Beer>();
		c2.setBeverage(new Beer());
		Beer beer = c2.getBeverage();
		
	}

}
