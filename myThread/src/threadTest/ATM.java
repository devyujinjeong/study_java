package threadTest;

public class ATM implements Runnable{
	private int money;
	
	public ATM() {
		this.money=10_000;
	}

	@Override
	public void run() {	//run���� ���� �޼ҵ�, ���� ��� �ڿ�
		for(int i=0; i<5; i++) {
			withdraw();
			try {Thread.sleep(500);} 
			catch (InterruptedException e) {e.printStackTrace();}
		}	
	}
	
	// �� ��Ȳ���� ���� ���ڸ�, ������ �Ƶ��� �ܾ��� 1000���� ���忡�� ���� �̴´ٰ� ��������.
	// ���� ���� ���ÿ� ���� ������ ����, �Ƶ��� ���� 1000���� �̰� �Ǵµ� �� ���� �Ұ����� ��Ȳ�̴�.
	// �̷��� ��Ȳ�� �����ϱ� ���ؼ� synchronized��� Ű���带 �ٿ��� ����ȭ �޼ҵ带 �����.
	// �� Ű���带 ���̸�, ��ü ������ ����ȭ �޼ҵ带 �����ϸ� ��� ��ü�� ����� �ɾ 
	// �ٸ� �����尡 ����ȭ �޼ҵ带 �������� ���ϵ��� �Ѵ�.
	public synchronized void withdraw() {
		// �� �ϳ��� �����常 ����
		this.money -= 1000;
		System.out.println(Thread.currentThread().getName()+"��(��) 1000�� ���");
		System.out.println("���� �ܾ�: "+ this.money +"�� ");
	}
	
	
}
