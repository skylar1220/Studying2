package day2_3;

public class HeadPhone implements Wearble {

	@Override
	public void puton() {
		System.out.println("HeadPhone put on");
		
	}

	@Override
	public void putoff() {
		System.out.println("HeadPhone put off");
		
	}

	
	private int volume ;


	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
// 볼륨 변수와 세팅할 수 있는 값 넣기
