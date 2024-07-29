package myAnonymous;

public class Computer {
	public static void main(String[] args) {
//		Game이라는 인터페이스
//		Game()은 뒤에 있는 것들을 메모리에 올리는 것 --> 익명 클래스를 메모리에 올려주는 익명 클래스 생성자
//		메소드는 클래스 안에서 선언되는 것이므로, Game()뒤에 괄호{}는 클래스 중괄호
//		근데 여기서 보면 클래스 중괄호 앞에 이름이 없음.
//		지금 여기에서 구현하고 끝인거임
		
		Game game = new Game() {
			
			@Override
			public void play() {
				System.out.println("실행");
			}
			@Override
			public void exit() {
				// TODO Auto-generated method stub
			}
		};
		
		game.play();
	}
}
