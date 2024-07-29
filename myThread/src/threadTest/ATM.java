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
	
	public synchronized void withdraw() {
//		synchronized (this) {
			this.money -= 1000;
//		}
		System.out.println(Thread.currentThread().getName()+"이(가) 1000원 출금");
		System.out.println("현재 잔액: "+ this.money +"원 ");
	}
	
	
}
