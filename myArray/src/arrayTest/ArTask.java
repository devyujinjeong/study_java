package arrayTest;

import java.util.Scanner;

public class ArTask {
	public static void main(String[] args) {
//		1. 1~10까지 배열에 담고 출력
//		int[] arData=new int[10];
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=i+1;
//			System.out.println(arData[i]);
//		}		
		
//		2. 10~1까지 중 짝수만 배열에 담고 출력
//		int[] arData=new int[5];
//		
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=(i+1)*2;
//			System.out.println(arData[i]);
//		}
		
//		3. 1~100까지 배열에 담은 후 홀수만 출력
//		int[] arData=new int[100]; //배열에 담은 후에 출력이니깐 우선 100까지 배열에 담기
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=i+1;
//			if(arData[i]%2==1) { //1~100까지 중 2로 나눈 나머지가 1인 값을 출력하기
//				System.out.println(arData[i]);			
//			}
//	
//		}
		
//		4. 1~100까지 배열에 담은 후 짝수의 합 출력
//		int[] arData=new int[100];
//		int sum=0;
//		
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=i+1;
//			if(arData[i]%2==0) {
//				sum+=i+1;			
//			}	
//		}
//		System.out.println(sum);
		
//		5. A~F까지 배열에 담고 출력 (65,66,67,68,69,70)
//		char[] arData=new char[6];
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=(char)(i+65);	
//			System.out.println(arData[i]);
//			}	
		
//		6. A~F까지 중 C를 제외하고 배열에 담은 후 출력
//		char[] arData=new char[6];
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=i<2?(char)(i+65):(char)(i+66);	
//			System.out.println(arData[i]);
//			}	

//		7. 5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//		Scanner sc=new Scanner(System.in);
//		int[] arData=new int[5];
//		System.out.print("5개의 정수를 입력해주세요:");
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=sc.nextInt();
//		}
//		
//		int max=arData[0],min=arData[0];
//		for(int i=0;i<arData.length;i++) {
//			if(max<arData[i]) {max=arData[i];}
//			if(min>arData[i]) {max=arData[i];}
//		}
//		
//		System.out.println("최대값은?"+max);
//		System.out.println("최소값은?"+min);
		
//		8. 사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
//		Scanner sc=new Scanner(System.in);
//		int sum=0;
//		double average=0.0;
//		
//		System.out.print("배열의 개수를 입력하세요: ");
//		int[] arData=new int[sc.nextInt()];
//		
//		System.out.print("정수를 입력하세요: ");
//		for(int i=0;i<arData.length;i++) {
//			arData[i]=sc.nextInt();
//			sum+=arData[i];
//		}
//		average=sum/(double)arData.length;
//		
//		System.out.println("평균 값은?"+average);
		
		int[] arData = null;
		String messageOfIntegerCount = "입력하실 정수의 개수: ";
		String message = null;
		int total = 0;
		double average = 0.0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(messageOfIntegerCount);
		arData = new int[sc.nextInt()];
		
		for (int i = 0; i < arData.length; i++) {
			message = i + 1 + "번째 정수: ";
			System.out.print(message);
			arData[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
		
		average = total / (double)arData.length;
		System.out.println(average);
	}
}
