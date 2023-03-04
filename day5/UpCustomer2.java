//10

// 0. 일 회 구매 금액 별 등급 승급
// @0. 그동안 총 누적 금액별 등급 승급
package day5;
public class UpCustomer2 {
	private Grade grad; 
	private int totalPrice;
	private String name;
	private double rewardPrice;
	

	// 3. 총 구매금액에 대한 자동 등급부여 함수
	// 굳이 외부에 공개할 필요 없으니 프라이빗
	public void calGrad() {
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

	
	
	public UpCustomer2(String name) { 
		// @1. 이름만 들어가게 빼버리기
		this.totalPrice = totalPrice;
		this.name = name;
		calGrad(); //  @ 5. 여기에 넣어줘야
	}


	public double getRewardPrice() {
		return grad.reward(totalPrice); // @4. 여기 바꿔줬음 
	}

	@Override
	public String toString() {
		return "Customer [grad=" + grad + ", totalPrice=" + totalPrice + ", name=" + name + ", rewardPrice="
				+ getRewardPrice() + "]";
	}
	

	public void buy(int i) { //@ 2. 토탈에 추가하고 겟그레이드 하면 끝!
		totalPrice += i	;
		calGrad();
	}
}