package myAbstractTest;

public class Airconditioner extends Electronics {

	@Override
	public void on() {
		// TODO Auto-generated method stub
		System.out.println("에어컨이 켜졌습니다.");
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		System.out.println("에어컨을 껐습니다.");
	}
}
