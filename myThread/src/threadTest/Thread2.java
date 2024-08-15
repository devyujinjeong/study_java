package threadTest;

public class Thread2 implements Runnable {
	// Runnable을 보면 run()이라는 메소드가 하나 정의되어 있음
	// 이것을 재정의 해서 사용하기
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()); // run에 들어온 쓰레드 그 자체

			try {Thread.sleep(500);} // 0.5초간 일시 정지
			catch (InterruptedException e) {;}
		}

	}

}
