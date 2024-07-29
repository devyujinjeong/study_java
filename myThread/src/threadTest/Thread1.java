package threadTest;

public class Thread1 extends Thread{
	public String data;

	public Thread1() {;}
	
	public Thread1(String data) {
		super();
		this.data=data;
	}

	@Override
	public void run() { //자원 --> run에 작성한 코드가 thread
		for(int i=0;i<10;i++) {
			System.out.println(data);
			try {sleep(1000);} //Thread를 상속받았기 때문에 바로 이렇게 쓸 수 있음.
			catch (InterruptedException e) {;} 
			}
		}
	}

