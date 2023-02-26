
//2
package day4_generic;

public class Cup <T> {

	private T beverage ;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(Object beverage) {
		this.beverage = (T) beverage;
	} 
	
	
}
