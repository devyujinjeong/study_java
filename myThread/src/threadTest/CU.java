package threadTest;

public class CU {
	public static void main(String[] args) {
		ATM atm=new ATM();
		
		Thread mom=new Thread(atm,"����");
		Thread son=new Thread(atm,"�Ƶ�");
		
		// ���� ���� ���� ������ ������ ���� ������
		// ����ȭ �޼ҵ带 ����ϸ� ��� �Ŀ� �ܾ��� ���;� �� ������ ��������
		mom.start();
		son.start();
	}

}
