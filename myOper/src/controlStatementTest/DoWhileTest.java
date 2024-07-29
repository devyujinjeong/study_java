package controlStatementTest;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		String message = "1. 통신 요금 조회\n2. 분실신고\n3. 통신사 이동\n0. 상담원 연결";
		Scanner sc =new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println(message); //일단 이 메세지는 출력하자!!
			choice = sc.nextInt(); //그리고 값을 입력 받는 것도 진행하자!!
		} 
		
		while(choice != 0); //0이 아닐때까지 반복하기
	}
}