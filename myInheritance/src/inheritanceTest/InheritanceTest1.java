package inheritanceTest;

class A{
	String name;
	int data;
	
//	기본 생성자에 초기화 하기!! 기본 생성자는 매개변수가 없는 생성자 (무조건 이렇게 습관 들이기)
	public A() { 
		//부모 생성자와 자식 생성자 둘 중 뭐가 먼저 호출되는지 알아보기 위한 코드
		System.out.println("부모 생성자가 호출됨"); 
		this.name = "A";
		this.data = 10;
	}
	
//	이름을 출력하는 메소드
	void printName() {
		System.out.println(name);
	}
}

//  상속, A가 부모 클래스고 B가 자식 클래스
class B extends A{
	public B() {
//		this()와 super()는 동시에 직접 작성할 수 없다.-->둘 다 실행되긴 하지만, 하나만 작성하기
		super(); //부모 생성자 호출 -->없어도 컴파일러가 알아서 작성해서 실행을 해줌
		//부모 생성자와 자식 생성자 둘 중 뭐가 먼저 호출되는지 알아보기 위한 코드
		System.out.println("자식 생성자 호출됨");
	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
		B b=new B(); //자식 생성자를 호출하면 자동적으로 부모 생성자가 호출됨
		System.out.println(b.data); //부모 클래스를 상속
//		name의 주소값을 직접 가져와서 B를 넣었음.
		b.name="B";
		b.printName();
	}

}
