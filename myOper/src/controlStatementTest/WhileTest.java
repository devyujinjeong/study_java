package controlStatementTest;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
//		이름 10번 출력하기 (이런 경우에는 for문이 더 쉬움^^)
//		int count=0;
//		while(count!=10) {
//			System.out.println(count+1+". 정유진");
//			count++;
//		}
		
		Scanner sc = new Scanner(System.in);
		
		String title = "Q. 당신이 좋아하는 색을 선택하세요.";
		String menu = "1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색\n5. 나가기";
		String redMessage = "불같고 열정적이고 적극적이다.";
		String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String errorMessage = "다시 시도해주세요.";
		String result = null;
		
		int choice = 0;
		
		while(true) { //무한반복!! 
			System.out.println(title);
			System.out.println(menu);
			
			choice = sc.nextInt();
			if(choice == 5) { 
				//choice가 5가 되면 밑에 switch문을 실행하지 않고 while문 자체를 나가게 됨.
				//왜냐? 원래 다른 경우에 break를 사용하게 되면 그냥 중괄호를 나가기만 하는데, 
				//if문에서 break를 사용하게 될 경우에는 if를 포함하고 있는 중괄호를 나가게 됨.
				//그래서 여기에서는 break를 사용하면 while문을 나가게 되는 것!!
				break;
			}
			
			switch(choice) {
			case 1:
				result = redMessage;
				break;
			case 2:
				result = yellowMessage;
				break;
			case 3:
				result = blackMessage;
				break;
			case 4:
				result = whiteMessage;
				break;
			default:
				result = errorMessage;
				break;
			}
			System.out.println(result);
		}
	}
}
