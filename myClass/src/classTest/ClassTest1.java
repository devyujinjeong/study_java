package classTest;

class A{ //A라는 클래스 선언
//	필드는 변수랑 메소드 다 필드라고 이야기함 
	int data; //data라는 필드 하나 선언하기
	
	void printData() { //printData라는 필드(메소드)
		System.out.println(data); 
		//이게 이렇게 적혀 있으면, 도대체 어떤 필드의 data를 의미하는 것임?!이런 의문 때문에 this 사용
		System.out.println(this); //주소값 출력
		System.out.println(this.data); //값 출력
	}
}

public class ClassTest1 {
	public static void main(String[] args) {
//		객체화 하기 
		A a = new A(); //new A()를 필드의 주소값으로 보기
		//a가 지금 A에 있는 필드에 접근하기 위해서 A타입을 썼음
		//A()가 지금 A필드를 heap 메모리에 새롭게 할당했음.
		A b = new A();
		
		a.data = 10; // 점을 찍었으니, 주소에 있는 필드가 나옴 -->그니깐 data가 있는 주소를 불러와주라는 의미
		b.data = 20;
		
		a.printData(); //이 코드를 적으면서 위의 메소드가 실행되고, a의 주소값이 출력 된 후에 값이 출력되는 것임
		b.printData(); //이 코드를 적으면서 위의 메소드가 실행되고, b의 주소값이 출력 된 후에 값이 출력되는 것임
		
		System.out.println(a); //주소값 출력
		System.out.println(b); //주소값 출력
	}
}
