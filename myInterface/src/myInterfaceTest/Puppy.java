package myInterfaceTest;

public class Puppy implements Animals {
//	원래는 인터페이스를 클래스에서 지정하면, 밑에 나오는 것처럼 인터페이스의 모든 메소드를 다 구현해야 함.
//	puppy는 Animals에 있는 모든 메소드를 구현하면 됨.
	@Override
	public void sitDown() {
		// TODO Auto-generated method stub
		System.out.println("난 강아지. 앉을게~! ");
	}

	@Override
	public void waitNow() {
		// TODO Auto-generated method stub

	}

	@Override
	public void poop() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bang() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showHand() {
		// TODO Auto-generated method stub

	}

}
