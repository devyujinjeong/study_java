package objectTest;

public class Student {
	int number;
	String name;
	String major;
	
	public Student() {;}
	
	public Student(int number, String name, String major) {
		super();
		this.number = number;
		this.name = name;
		this.major = major;
	}

//	toString() 재정의 하기
//	Object클래스가 모든 클래스의 부모이기 때문에 재정의해서 사용하면 됨
	@Override
	public String toString() {
		return number + "," + name + "," + major;
		
	}

	@Override
//	밑은 약간 fm대로 코드를 짠 것
	public boolean equals(Object obj) {
		if(obj==this) {return true;} //obj 너 나(this)랑 주소가 같니? 맨 처음에는 주소 비교하기
		if(obj instanceof Student) { //obj 너 혹시 학생이긴 하니?
//			downcasting 사용하기
//			지금 여기에서 보면 obj의 자료형은 Object임. 결과적으로 지금 upcasting되어 있는 상태인 것.
//			왜냐면 upcasting 하면 student에 있던 부분이 잘려서 upcasting되기 때문에 number를 사용할 수 없게 된다.
//			이때 downcasting을 함으로써 number를 사용할 수 있게 설정해주는 것이다. 
			Student anotherStudent = (Student) obj; 
			if(number==anotherStudent.number) {
				return true;
			}
		}
		return false; 
	}
}
