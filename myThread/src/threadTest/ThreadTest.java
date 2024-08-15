package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		// 1. Runnable 인터페이스
//		Runnable t1 = new Thread2(); // Runnable 구현 객체 생성
//		Thread thread1 = new Thread(t1,"★"); // 위의 값을 매개값으로 해서 Thread 생성자 호출
//
//		start()메소드를 사용해줘야 실행됨
//		thread1.start();
//		
//		for(int i=0; i<10; i++) {
//			System.out.println("하하");
//			try {Thread.sleep(500);}
//			catch(Exception e) {}
//		}
		
		// 2. Thread 하위 클래스로 작업 스레드를 정의
//		Thread1 t1 = new Thread1("2024");
//		Thread1 t2 = new Thread1("2025");
//		
//		t1.run();
//		t2.run();
//		
//		스케줄링(멀티쓰레드로 바꿔주는 것)을 해주는 메소드가 start()
//		t1.start();
//		t2.start();
//		
		
//		try {
//			thread1.join();
//			thread2.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		System.out.println("메인 쓰레드 종료");
	}
}
