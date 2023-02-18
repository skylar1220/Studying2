// 1
package day1;


class Eagle extends Animal {
	String wing;
	void fly() {
	}
}

class Tiger extends Animal {
	String leg;
	void run() {
	}
}

class Goldfish extends Animal {
	String fin;
	void swim() {
	}

}


public class Animal {
	String eye;
	String mouth;
	void eat() {
		System.out.println("yum");
	}
	void sleep() {
	}

	
	public static void main(String[] args) {
		Eagle e = new Eagle();
		e.eat();
	}

}


// main = animal 클래스
// 나머지 자식 클래스로 