package classTest;

//영역: 중괄호
//전역: 클래스 중괄호
//지역: 클래스 중괄호 이외의 모든 중괄호 

class Data{
//	전역변수는 객체마다 서로 다른 값
	int data_i=10;
//	정적변수는 모든 객체가 공유하는 값 (계속 반복해서 값을 사용할 때도 사용)
	static int data_s=10;
	
	void increase_i() {
		System.out.println(++data_i);
	}


	void increase_s() {
		System.out.println(++data_s);}
	}

public class ClassTest2 {
	public static void main(String[] args) {
		Data object=new Data(); // 기본 생성자를 위에서 따로 정의해주지 않았기 때문에, 자동적으로 컴파일러가 기본 생성자를 생성함
		
//		전역변수는 생성자를 통해 메모리에 할당되기 때문에
//		다른 필드의 주소가 들어오게 되면 초기화된다.
		
		object.increase_i(); // 전위형으로 작성했기 때문에 11부터 출력됨
		object.increase_i();
		object.increase_i();
		object.increase_i();
		object.increase_i();
		
		object=new Data(); // 여기에서는 새롭게 생성자가 생겨나게 됨
		
		object.increase_i(); // 다시 11부터 출력 시작
		object.increase_i();
		object.increase_i();
		object.increase_i();
		object.increase_i();
	
//		정적변수는 컴파일러가 메모리에 할당해주기 때문에 
//		생성자의 영향을 받지 않는다.
//		11부터 20까지 출력됨
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		
//		object=new Data(); // 생성자에 영향을 받지 않음
//		
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();		
	}
	
	

}
