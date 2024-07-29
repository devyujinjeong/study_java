package controlStatementTest;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		두 정수 대소비교(삼항 연산자로 썼던 것을 if를 통해 써보자!!
	      Scanner sc = new Scanner(System.in);
	      int number1 = 0, number2 = 0;
	      boolean isBigger = false, isEqual = false;
	      String message = "두 정수: ", number1Message = null, number2Message = null, result = null;
	      String equalMessage = "두 수 같습니다.";
	      
	      System.out.print(message);
	      number1 = sc.nextInt();
	      number2 = sc.nextInt();
	      
	      number1Message = "더 큰 값: " + number1;
	      number2Message = "더 큰 값: " + number2;
	      
	      isBigger = number1 > number2; //값으로 볼 줄 알기!! true나 false가 나오는 것임!!
	      isEqual = number1 == number2;
	   
	      // 일괄처리하기!!
	      // 즉, if안의 실행할 문장에 일일히 System.out.println();	를 넣지 말고 마지막에 한번에 실행하기
	      if(isBigger) { //만약에 isBigger이 맞다면 result에 number1Message를 할당해라.
	          result = number1Message;
	       } 
	      else if(isEqual) { //isBigger이 false여서 이 else if로 넘어오게 됨!! 
	          result = equalMessage;
	      }
	      else { //위의 경우가 다 아니면 result에 number2Message를 할당해라
	          result = number2Message;
	      }
	       
	      System.out.println(result);	
	}

}
