package day2_3;

public class NoteBook extends Repair implements Controllable {

	@Override
	public void turnOn() {
		System.out.println("노트북 전원 종료");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북 전원 켜기");
		
		
	}

	@Override
	public void repair() {
		System.out.println("노트북 수리하기");
		
	}
	public void imnb() {
		System.out.println("nb");
	}

}
