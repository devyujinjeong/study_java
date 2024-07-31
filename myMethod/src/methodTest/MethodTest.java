package methodTest;

public class MethodTest {
	
//	f(x) = 2x + 1
	static int f(int x){ // 이름만 보고 어떤 일을 하는 메소드인지 알아보게 적어야 하지만, 이 코드에서는 편의를 위해 f라고 이름을 짓겠다.
		int result=2*x+1;
		return result;
	}
	
//	static
//	컴파일러가 가장 먼저 메모리에 할당해준다.
//	일반 메소드를 static 메소드에서 사용하기 위해서는 아래의 두 가지 방법이 존재한다.
//	1. 일반 메소드에 static을 작성하여 같은 시간대에 메모리로 올려준다.
//	2. 일반 메소드의 소속을 알려준다.  
	
	public static void main(String[] args) { //main도 메소드
//		MethodTest methodTest=new MethodTest();
//		methodTest.f(3); // 출력하게 된다면 7이 출력됨
		
		MethodTest.f(4); // 객체 생성 없이 클래스를 통해 메소드 직접 호출 가능
	}
}
