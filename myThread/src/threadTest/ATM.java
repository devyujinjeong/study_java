package threadTest;

public class ATM implements Runnable{
	private int money;
	
	public ATM() {
		this.money=10_000;
	}

	@Override
	public void run() {	//run에서 쓰는 메소드, 변수 모두 자원
		for(int i=0; i<5; i++) {
			withdraw();
			try {Thread.sleep(500);} 
			catch (InterruptedException e) {e.printStackTrace();}
		}	
	}
	
	// 이 상황에서 예를 들자면, 엄마와 아들이 잔액이 1000원인 통장에서 돈을 뽑는다고 생각하자.
	// 만약 둘이 동시에 돈을 뽑으면 엄마, 아들이 각각 1000원씩 뽑게 되는데 이 경우는 불가능한 상황이다.
	// 이러한 상황을 예방하기 위해서 synchronized라는 키워드를 붙여서 동기화 메소드를 만든다.
	// 이 키워드를 붙이면, 객체 내부의 동기화 메소드를 실행하면 즉시 객체에 잠금을 걸어서 
	// 다른 스레드가 동기화 메소드를 실행하지 못하도록 한다.
	public synchronized void withdraw() {
		// 단 하나의 쓰레드만 실행
		this.money -= 1000;
		System.out.println(Thread.currentThread().getName()+"이(가) 1000원 출금");
		System.out.println("현재 잔액: "+ this.money +"원 ");
	}
	
	
}
