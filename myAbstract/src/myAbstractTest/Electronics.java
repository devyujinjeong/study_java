package myAbstractTest;

public abstract class Electronics {
//	추상메소드는 반드시 재정의하라는 강제성을 부여하기 위해서 사용함.
//	구체적인 구현부가 없음
	public abstract void on();
	public abstract void off();
	
	public void welcome() {
		System.out.println("저희 제품을 사용해 주셔서 감사합니다");
	}
	
//	final 메소드는 다른 곳에서 재정의될 수 없다.
	public final void shutDown() { 
		System.out.println("전원 차단 후 119 신고");
	}
	
}
