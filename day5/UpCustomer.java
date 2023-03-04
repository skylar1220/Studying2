//10

// 0. 일 회 구매 금액 별 등급 승급
// @0. 그동안 총 누적 금액별 등급 승급
package day5;
public class UpCustomer {
	private Grade grad; 
	// 상속관계 아닌애를 상속관계로 만들 수는 없기 때문에 이렇게하지만 이건 커플링 방식이라 지양이긴 함
	// 커스토머 안에 그레이드가 콕 박혀있는 형태이기 때문
	// 근데 인터페이스로 빼기에는 복잡해서...
	private int totalPrice;
	private String name;
	private double rewardPrice;
	

	// 3. 총 구매금액에 대한 자동 등급부여 함수
	// 굳이 외부에 공개할 필요 없으니 프라이빗
	public void getGrad() {
		Grade grade = null;
		if (totalPrice >= 10000000) {
			grade = new TopClass();
		}
		else if (totalPrice >= 2000000 ) {
			grade = new Vip();
		}
		else {
			grade = new General();
		}
		this.grad = grade;
	}

	
	
	public UpCustomer(int totalPrice, String name) { 
		// @1. 이름만 들어가게 빼버리기
		//1. grade를 외부에서 주지말아야 함, 생성자에서 빼버리기
		
		this.totalPrice = totalPrice;
		this.name = name;
		getGrad(); // 4. 여기서 해줘야 뒤에 그레이드가 null이 안되겠지
		rewardPrice = grad.reward(totalPrice);
		// 2. 여기에 등급 계산하는 함수가 필요하겠지? 근데 코드 길어지니까 밖에서 만들어 오자
	}


	public double getRewardPrice() {
		return rewardPrice;
	}

	@Override
	public String toString() {
		return "Customer [grad=" + grad + ", totalPrice=" + totalPrice + ", name=" + name + ", rewardPrice="
				+ rewardPrice + "]";
	}
}