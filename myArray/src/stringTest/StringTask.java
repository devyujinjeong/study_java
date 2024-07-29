package stringTest;

import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
//		정수를 한글로 변경
//		입력 예) 1024
//		출력 예) 일공이사
		
//		1. 정수로 입력받기
		Scanner sc = new Scanner(System.in); //스캐너를 이용해 정수 입력하기
		String message = "정수 입력: "; //message 초기화 하기
		String hangle = "공일이삼사오육칠팔구"; //hangle 초기화 하기
		int number = 0; // number 초기화 하기
//		String number = null;
		String result = ""; //result 초기화 하기
		
		System.out.print(message); //메세지 출력
		number = sc.nextInt(); //정수 입력하기 (콘솔창에)
		
		while(number != 0) { //number가 0이 아닐때까지 반복
			result = hangle.charAt(number % 10) + result; 
			//입력한 number를 10으로 나눈 나머지 값에 해당하는 방에 있는 문자열 값에 result 값을 더해서 result에 할당
			result = result + hangle.charAt(number % 10);
			number /= 10;
			//위의 작업을 수행한 뒤에 number를 10으로 나누기. 그러면 정수값이 나오게 되고 이것이 다시 위로 가서 반복
		}
		System.out.println(result);
		
//		2. 문자열로 입력받기
//		number = sc.next();
//		for (int i = 0; i < number.length(); i++) { //숫자의 길이만큼 반복하기
//		48의 아스키 코드는 '0'
//			result += hangle.charAt(number.charAt(i) - 48);
//		}
//		System.out.println(result);
	}
}

