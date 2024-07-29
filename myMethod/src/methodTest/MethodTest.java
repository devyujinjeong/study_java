package methodTest;

public class MethodTest {
	
//	f(x) = 2x + 1
	/*static*/ int f(int x){
		int result=2*x+1;
		return result;
	}
	
//	static
//	컴파일러가 가장 먼저 메모리에 할당해준다.
//	일반 메소드를 static 메소드에서 사용하기 위해서는 아래의 두 가지 방법이 존재한다.
//	1. 일반 메소드에 static을 작성하여 같은 새간대에 메모리로 올려준다. -->무조건 heap이라는 메모리 영역에서만 찾음
//	2. 일반 메소드의 소속을 알려준다.  
	
	public static void main(String[] args) { //main도 메소드
		MethodTest methodTest=new MethodTest();
		methodTest.f(3);
	}
	
	

}
