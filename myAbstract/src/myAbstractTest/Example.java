package myAbstractTest;

public class Example {
	public static void main(String[] args) {
		Refrigerator rf = new Refrigerator();
		Airconditioner ac = new Airconditioner();
		
		// 같은 on()이라는 기능인데 
		// 각각의 클래스에서 어떻게 선언했는지에 따라서
		// 다른 결과를 도출해냄
		rf.welcome();
		rf.shutDown();
		rf.on(); 
		rf.off();
		
		ac.welcome();
		ac.shutDown();
		ac.on();
		ac.off();
	}
}
