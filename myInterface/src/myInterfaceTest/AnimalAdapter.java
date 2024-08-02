package myInterfaceTest;

//	인터페이스의 강제성을 없애주는 클래스 (추상 클래스)
public abstract class AnimalAdapter implements Animals {
// 	원래 추상메소드는 강제성을 부여하는 메소드임
//	그런데 여기에서는 강제성을 없애주는 용도로 사용 (뒤에 adapter를 붙여줌으로써 이를 표시해줌)
//	그리고 재정의 해야 할 것들을 제외한 것들은 모두 중괄호로 만들어서 강제성을 없애준 것임
//	이 경우에는 Tiger에서 재정의가 필요한 것은 poop밖에 없기 때문에 나머지는 다 강제성을 없애주기 위해 중괄호로 만들었음
	@Override
	public void sitDown() {
		// TODO Auto-generated method stub
		System.out.println("앉아");
	}

	@Override
	public void waitNow() {
		// TODO Auto-generated method stub
		System.out.println("기다려");
	}

	@Override
	public void bang() {
		// TODO Auto-generated method stub
		System.out.println("빵야");
	}

	@Override
	public void showHand() {
		// TODO Auto-generated method stub
		System.out.println("손");
	}

}
