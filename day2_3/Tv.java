package day2_3;

public class Tv extends Repair implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("tv 전원 종료");
	}

	@Override
	public void turnOff() {
		System.out.println("tv 전원 켜기");
		
		
	}

	@Override
	public void repair() {
		System.out.println("tv 수리하기");
		
	}

	public void imtv() {
		System.out.println("tv");
	}
	
	


}
