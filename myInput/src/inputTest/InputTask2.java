package inputTest;

import java.util.Scanner;

public class InputTask2 {
	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후 덧셈 출력 
//		(엔터를 한번만 쳐도 3개의 정수가 한번에 저장되어야 한다.)
//		nextInt()
		Scanner sc=new Scanner(System.in);
		
//		3개의 정수
		int number1 = 0, number2 = 0,number3=0, sum=0, subtraction=0, multiply=0,divide=0;
		String formatSum="%d+%d+%d=%d";
		String formatSubtraction="%d-%d-%d=%d ";
		String formatMultiply="%d*%d*%d=%d ";
		String formatDivide="%d/%d/%d=%d ";
		
		System.out.println("숫자 3개를 입력하세요:");

		number1=sc.nextInt();
		number2=sc.nextInt();
		number3=sc.nextInt();

		sum=number1+number2+number3;
		subtraction=number1-number2-number3;
		multiply=number1*number2*number3;
		divide=number1/number2/number3;
		
		System.out.printf(formatSum,number1,number2,number3,sum);
		System.out.printf(formatSubtraction,number1,number2,number3,subtraction);
		System.out.printf(formatMultiply,number1,number2,number3,multiply);
		System.out.printf(formatSubtraction,number1,number2,number3,divide);
		
		
		
		
	}
}

