package myAbstractTest;

public abstract class Electronics {
//	추상메소드는 반드시 재정의하라는 강제성을 부여하기 위해서 사용함.
	public abstract void on();
	public abstract void off();
	
//	final 메소드는 다른 곳에서 재정의될 수 없다. 자식아 재정의 하지 말아라~!!
	public final void shutDown() { 
		System.out.println("전원 차단 후 119 신고");
	}
}
