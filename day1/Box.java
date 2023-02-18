//3-1
package day1;

public class Box {
	public Box() {} // 생성자 건들일거면 기본생성자는 자동으로 만들어놓아라 -> 안그러면 자식 클래스 비워놓고 생성할 때 오류생김 -> 왜냐 자식클래스를 만들면 기본생성자가 자동으로 숨겨져서 만들어지는데, 자식이 기본생성자 호출할 때 자동으로 부모의 기본생성자도 호출되는데 그게 없어서 오류나는 것 
	int size;
	public Box(int size) {
		this.size = size ; 
	}

}
