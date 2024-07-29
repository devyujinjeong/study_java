package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

//사용자 예외
//Exception을 상속받으면 해당 예외 사용 시, try~catch를 컴파일 시점에서 검사하게 된다.
//	RunTimeException을 상속받으면, 빌드 시점에 검사하게 된다.
class BadWordException extends Exception{

public BadWordException() {;}

public BadWordException(String message) {
	super(message);
	}
}

public class ExceptionTest {

public void checkBadWord(String message) throws BadWordException{
	if(message.equals("바보")) {
		throw new BadWordException(); //throw는 뒤의 예외를 우리가 직접 발생시키는 것
	}
}
public static void main(String[] args) {
	
//	try {
//		String data = "정유진";
//		Integer.parseInt(data);
//	} catch (NumberFormatException e) {
//		System.out.println("정수만 입력가능합니다.");
//	}
	
//	try {
//		System.out.print("입력: ");
//		new Scanner(System.in).nextInt();
//	} catch (InputMismatchException e) {
//		System.out.println("정수만 입력하라고 했잖아요 ㅎㅎ");
//	}
	
//	try {
//		System.out.println(10 / 0);
//	} catch (ArithmeticException e) {
//		e.printStackTrace(); // 현재 시점에서 연계된 모든 코드부분의 라인 번호가 출력된다.
//		System.out.println(e.getMessage());
//		System.err.println("0으로 나눌 수 없습니다.");
//	}
}
}