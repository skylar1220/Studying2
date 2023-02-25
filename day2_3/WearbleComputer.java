package day2_3;

public class WearbleComputer implements Wearble {

	@Override
	public void puton() {

		System.out.println("computer put on");
	}

	@Override
	public void putoff() {
		System.out.println("computer put off");
		
	}
	
	public void reset() {
		System.out.println("리셋하기");
	}

}

//wearable 상속 받은 애느 ㄴ리셋기능 넣기