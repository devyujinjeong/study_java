package threadTest;

public class Thread1 extends Thread{
	public String year;

	public Thread1() {;}
	
	public Thread1(String year) {
		super();
		this.year=year;
	}

	@Override
	public void run() { //�ڿ� --> run�� �ۼ��� �ڵ尡 thread
		for(int i=0;i<10;i++) {
			System.out.println(year);
			try {sleep(500);} //Thread�� ��ӹ޾ұ� ������ �ٷ� �̷��� �� �� ����.
			catch (InterruptedException e) {;} 
			}
		}
	}

