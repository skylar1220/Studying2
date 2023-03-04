package day5;
//@@ 와 어렵다 다 다시 쳐봐야겠다

interface Usethis{
	void use();
}


public class LamdaDemo5 {
	
	public void lamda() {
		String hi = "hi";
		
		Usethis u1 = new Usethis() {
			@Override
			public void use() {
				System.out.println(this);
			}
		} ;
		u1.use();
		
		Usethis u2 = () -> System.out.println(this);
		u2.use();
	}

	public static void main(String[] args) {
		LamdaDemo5 demo = new LamdaDemo5();
		demo.lamda();
		System.out.println(demo);
	}
}


// 위 u1의 this는 새로 만들어진 애라 자기자신이 아님
// lamda의 this는 아래와 같은 자기자신