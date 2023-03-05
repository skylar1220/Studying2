package day6;

//6

public class Student {

	private String name;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			return this.name.equals(((Student) obj ).name);
			}
		 return false;
	}
	
	

	@Override
	public int hashCode() {
		return name.hashCode() ;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
	
}

// 안전하게 하기 위해서는 (obj instanceof Student) 이걸 해야한다는 뜻