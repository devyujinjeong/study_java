package threadTest;

public class CU {
	public static void main(String[] args) {
		ATM atm=new ATM();
		
		Thread mom=new Thread(atm,"엄마");
		Thread son=new Thread(atm,"아들");
		
		// 누가 먼저 돈을 뺄지는 정해져 있지 않지만
		// 동기화 메소드를 사용하면 출금 후에 잔액이 나와야 그 다음이 가능해짐
		mom.start();
		son.start();
	}

}
