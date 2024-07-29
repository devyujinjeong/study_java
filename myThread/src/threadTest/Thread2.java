package threadTest;

public class Thread2 implements Runnable {
	@Override
	public void run() { //자원
		for(int i=0; i<10; i++) {
//			run이라는 것의 this 같은 역할이라고 생각하면 됨
			System.out.println(Thread.currentThread().getName()); //run에 들어온 쓰레드 그 자체
			try {Thread.sleep(1000);}
			catch (InterruptedException e) {;}
		}

		
	}
	

}
