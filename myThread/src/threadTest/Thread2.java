package threadTest;

public class Thread2 implements Runnable {
	// Runnable�� ���� run()�̶�� �޼ҵ尡 �ϳ� ���ǵǾ� ����
	// �̰��� ������ �ؼ� ����ϱ�
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()); // run�� ���� ������ �� ��ü

			try {Thread.sleep(500);} // 0.5�ʰ� �Ͻ� ����
			catch (InterruptedException e) {;}
		}

	}

}
