package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		Runnable t1 = new Thread2(); //Thread2의 부모는 Runnable
		Thread2 t2 = new Thread2();
		
		Thread thread1 = new Thread(t1,"★");
		Thread thread2 = new Thread(t2,"♥");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 쓰레드 종료");
		
		
//		Thread1 t1 = new Thread1("!");
//		Thread1 t2 = new Thread1("?");
		
//		t1.run();
//		t2.run();
		
//		스케줄링(멀티쓰레드로 바꿔주는 것)을 해주는 메소드가 start()
//		t1.start();
//		t2.start();
		
	}

}
