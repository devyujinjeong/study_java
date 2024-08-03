package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5개 정수만 입력받기 
//		1. 정수로 입력받지 않는 경우에는 오류가 발생하게 됨
//		2. 5개 이상의 정수를 입력하게 될 경우 오류 발생
//		- 무한 입력 상태로 구현
//		- q 입력 시 나가기
//		- 각 정수는 배열에 담기
//		- if문은 딱 한 번만 사용하기
		
		Scanner sc = new Scanner(System.in);
		int[] arrayData = new int[5];
		int i= 0;
		String number=null;
		
		
		while(true) {
			System.out.print(++i+"번째 정수를 입력하세요: ");
			number=sc.next(); //숫자 입력 받기
					
			// 만약 입력한 값이 q라면 while문을 나가기
			// if문에서 break를 쓰는 경우에는 if문을 감싸고 있는 중괄호를 나가게 됨
			if(number.equals("q")) {break;}	
			
			try {
			// number에 정수가 아닌 다른 자료형을 입력하게 될 경우 형변환을 할 수 없기 때문에 오류가 발생할 수 있는 문장
				arrayData[i-1]=Integer.parseInt(number);
			} catch (NumberFormatException e) { // 숫자가 아닌 다른 것을 입력했을 경우
				System.out.println("정수만 입력해주세요!!");
				i--;
			} catch(ArrayIndexOutOfBoundsException e) { //배열의 index 개수를 초과
				System.out.println("5개의 정수만 입력해주세요!!");
				for(int j=0;j<arrayData.length;j++) {
					System.out.println(arrayData[j]+"");
				}
				break;
			} catch(Exception e) {
				System.out.println("다시 시도해주세요");
				i--;
			}		
		}
	}
}

