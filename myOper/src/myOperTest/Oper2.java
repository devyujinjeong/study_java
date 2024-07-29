package myOperTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
		// 두 정수 대소비교 (두 정수는 사용자에게 입력받기)
		Scanner sc = new Scanner(System.in);
		// number1,number2라는 정수형 변수 초기화 시키기
		int number1 = 0, number2 = 0;
		// isBigger, isEqual이라는 논리형 변수 초기화 시키기, 참고로 boolean의 기본값은 false
		boolean isBigger = false, isEqual = false;
		// 각각의 문자열 변수들 초기화 시키기
		String message = "두 정수: ", number1Message = null, number2Message = null, result = null;
		String equalMessage = "두 수 같습니다.";

		System.out.print(message); // 메세지를 출력하기
		number1 = sc.nextInt(); // number1 입력받기
		number2 = sc.nextInt(); // number2 입력받기

		// 문자열+정수=문자열(여기에서 +는 연결!!)
		number1Message = "더 큰 값: " + number1;
		number2Message = "더 큰 값: " + number2;

		isBigger = number1 > number2;
		isEqual = number1 == number2;

		// 삼항 연산자 사용
		// isBigger이 true면 number1Message를 출력하고 false면 isEqual을 비교해보자.
		// 여기에서 isEqual이 true면 equalMessage를 출력하고 false면 number2Message를 출력하자!
		result = isBigger ? number1Message : isEqual ? equalMessage : number2Message;

		System.out.println(result);

	}
}
