package inputTest;

import java.util.Scanner;

public class InputTask1 {
	public static void main(String[] args) {
		
//		두 정수를 입력한 뒤 곱셈 결과 출력
//		단, next()만 사용한다. --> 즉 정수로 입력이 불가능함. 그래서 바꿔줘야 함.
		Scanner sc=new Scanner(System.in);
		
		String number1=null, number2=null;
		int result=0;
		
		System.out.print("첫번째 숫자를 입력하세요: ");
		number1=sc.next();
		
		System.out.print("두번째 숫자를 입력하세요: ");
		number2=sc.next();
		
		result=Integer.parseInt(number1)*Integer.parseInt(number2);
		
		System.out.println(result);
		
		
	}
}

