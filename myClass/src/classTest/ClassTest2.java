package classTest;

//영역: 중괄호
//전역: 클래스 중괄호
//지역: 클래스 중괄호 이외의 모든 중괄호 

class Data{
//	전역변수는 객체마다 서로 달라야 하는 값이다.
	int data=10;
//	정적변수는 모든 객체가 공유하는 값이다. 
	static int data_s=10;
	
	void increase() {
		System.out.println(++data);
	}


	void increase_s() {
		System.out.println(++data_s);}
	}

public class ClassTest2 {
	public static void main(String[] args) {
		Data object=new Data();
		
//		전역변수는 생성자를 통해 메모리에 할당되기 때문에
//		다른 필드의 주소가 들어오게 되면 초기화된다.
		
//		object.increase(); //전위형으로 작성했기 때문에 11부터 출력됨
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();
//		object=new Data(); //여기에서는 새롭게 생성자가 생겨나게 됨
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();
//		object.increase();
	
//		정적변수는 컴파일러가 메모리에 할당해주기 때문에 
//		생성자의 영향을 받지 않는다.
		
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		
//		object=new Data();
//		
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
//		object.increase_s();
		
		
	}
	
	

}
