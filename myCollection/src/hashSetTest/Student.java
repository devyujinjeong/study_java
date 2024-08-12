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
	
	// student�� num�� �����ϱ� ������ �̰����� ������ ����
	// �׷��� num���� equals�� hashcode ������
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
