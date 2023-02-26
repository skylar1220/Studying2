//10

package day4_generic;

public class Customer  {
	
	public Customer(int grade, int total, String name){
		this.grade = grade;
		this.total = total;
		this.name = name;
	}
	
	
	private int grade = 0 ;
	private int total = 0 ;
	private String name ;
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	

}
