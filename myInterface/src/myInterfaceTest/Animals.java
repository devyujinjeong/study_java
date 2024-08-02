package myInterfaceTest;

public interface Animals {
	// 인터페이스는 상수와 추상메소드만 선언이 가능!!
	int eyes = 2; // final static가 생략되어 있음. 인터페이스에서는 상수밖에 선언이 안되기 때문에!!
	final static int nose = 1;

	// 추상 메소드밖에 선언이 안되기 때문에 abstract가 생략 가능!!
	public void sitDown();

	public void waitNow();

	public void poop();

	public void bang();

	public void showHand();
}
