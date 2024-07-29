package controlStatementTest;

import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//		브론즈
//		1~100까지 출력
//		for(int i=0;i<100;i++) { //초기값, 조건식, 증감식
//			System.out.println(i+1);
//		}
		
//		100~1까지 출력 
//		for(int i=0;i<100;i++) {
//			System.out.println(100-i);
//		}
		
//		1~100까지 중 짝수만 출력
//		for(int i=0;i<50;i++) { 
//			System.out.println((i+1)*2);
//		}
		
//		실버 
//		1~10까지의 합 출력
//		int sum=0; //값을 누적하기 위해서는 sum이라는 변수에 값을 저장해서 써야함
//		for(int i=0;i<10;i++) {
//			sum+=i+1; //대입연산자 +=을 이용함.
//		}
//		System.out.println(sum);
		
//		1~n까지의 합을 출력 (입력을 받아야함)
//		Scanner sc=new Scanner(System.in);
//		int number=0,sum=0;
//		
//		String message = "1~n까지의 합\nn: ";
//		System.out.print("원하는 정수를 하나 입력해주세요:");
//		number=sc.nextInt();
//		
//		for(int i=0;i<number;i++) {
//			sum+=i+1;
//		}
//		System.out.println(message+sum);

//		골드
//		A~F까지 출력(65,66,67,68,69,70)
//		for(int i=0;i<6;i++) {
//			System.out.println((char)(i+65)); //강제 형변환
//		}
		
//		A~F까지 중 C제외하고 출력 (65,66,68,69,70)
//		int result=0;
//		for(int i=0;i<5;i++) {
//			result=i<2?i+65:i+66; //삼항 연산자 사용하기: 조건식을 한 개만 작성하면 되니깐!!
//			System.out.println((char)result); 
//		}

//		다이아
//		0 1 2 3 0 1 2 3 0 1 2 3출력
//		for(int i=0;i<12;i++) {
//			System.out.print(i%4); //4로 나눈 나머지는 0,1,2,3만 나오니깐!!
//		}
//	
//		aBcDeF......Z까지 출력하기
//		97(i+1이 홀수인 경우)66(i+1이 짝수인 경우) 98 67 99 68 .....	
//		char result='0';
//		
//		for(int i=0;i<26;i++) { //이거 삼항대입으로 해보기
//				result=(char)((i+1)%2==0?i+65:i+97);
//				System.out.print(result);
//		}
	}
}
			
		
		
