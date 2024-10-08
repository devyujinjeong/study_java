package hashSetTest;

public class Student {
	private int number;
	private String name;
	
	public Student() {;}

	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + "]";
	}
	
	// student는 num이 고유하기 때문에 이것으로 구분이 가능
	// 그래서 num으로 equals랑 hashcode 재정의
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {return true;}
		
		if(obj instanceof Student) {
			Student anotherStudent = (Student) obj;
			if(anotherStudent.number == number) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}
