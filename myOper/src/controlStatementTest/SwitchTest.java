package controlStatementTest;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String title="Q. 당신이 좋아하는 색을 선택하세요";
		String color="\n1.빨간색 \n2.노란색 \n3.검은색 \n4.흰색";
		String redMessage="빨간색: 불같고 열정적이고 적극적이다.";
		String yellowMessage="노란색: 발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage="검은색: 묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage="흰색: 천사같고 깔끔하고 정리를 좋아하고 배려심이 있다.";
		String errorMessage="색을 다시 입력하세요.";
		String result=null;
		 	
		int yourColor=0; //정수형 color에 0을 할당하기

		System.out.println(title+color);
		
		yourColor=sc.nextInt();
		
		switch(yourColor){
		case 1:
			result=redMessage; //이것도 일괄처리로 진행함!!
			break; //switch문은 break;를 꼭 작성해줘야 함!!
			
		case 2:
			result=yellowMessage;
			break;
			
		case 3:
			result=blackMessage;
			break;
			
		case 4:
			result=whiteMessage;
			break;

		default:
			result=errorMessage;
			break;
		}
		System.out.println(result);
	}
}
