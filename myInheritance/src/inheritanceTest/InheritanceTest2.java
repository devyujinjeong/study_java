package inheritanceTest;

class Human {
	String name;
	
	public Human() {;} //기본 생성자 선언하기

//	생성자 선언하기
	public Human(String name) {
		this.name = name;
	}
	
//	먹기 메소드 생성하기
	void eat() {
		System.out.println("먹기");
	}
	
//	걷기 메소드 생성하기
	void walk() {
		System.out.println("두 발로 걷기");
	}
}
//	부모의 것을 상속 받았는데, 맘에 안드는 경우에는 어떻게 할까?
class Monkey extends Human{
	@Override //오버라이딩 하고 싶은 메소드 이름을 작성하고, ctrl+spacebar+enter
//	walk() 메소드 오버라이딩 하기
	void walk() {
		super.walk(); //오버라이딩 할 때, 이건 그대로 두고 밑에 다른 것들을 추가하고 싶을 때
		System.out.println("네 발로 걷기");
	}
}

public class InheritanceTest2 {
	public static void main(String[] args) {
		Monkey kingkong = new Monkey();
		kingkong.walk();
	}
}










