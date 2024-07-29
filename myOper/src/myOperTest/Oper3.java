package myOperTest;

import java.util.Scanner;

public class Oper3 {
//	심리 테스트

//	Q. 당신이 좋아하는 색을 선택하세요. (숫자로 입력받기)
//	1. 빨간색
//	2. 노란색
//	3. 검은색
//	4. 흰색
	
//	빨간색 : 불같고 열정적이고 적극적이다.
//	노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//	검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//	흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
	
	public static void main(String[] args) {
		// 숫자를 입력받기
		Scanner sc=new Scanner(System.in);
		
		//각각의 값들을 변수 선언하기
		int yourColor=0; //yourColor라는 정수형 변수 초기화 하기
		boolean color1=false,color2=false,color3=false,color4=false;
		//color1,2,3,4라는 논리형 변수 초기화 하기
		String result=null;
		String title="Q. 당신이 좋아하는 색을 선택하세요 \n1.빨간색 \n2.노란색 \n3.검은색 \n4.흰색";
		
		String redMessage="빨간색: 불같고 열정적이고 적극적이다.";
		String yellowMessage="노란색: 발랄하고 밝고 귀엽고 개성있고 착하다.";
		String blackMessage="검은색: 묵묵하고 든든하고 냉철하고 멋지다.";
		String whiteMessage="흰색: 천사같고 깔끔하고 정리를 좋아하고 배려심이 있다.";
		String errorMessage="색을 다시 입력하세요.";

		System.out.println(title);
		yourColor=sc.nextInt(); //숫자 입력 받기
		color1=yourColor==1; //color가 1과 같은 경우 (즉, 논리형 변수를 할당한 것임)
		color2=yourColor==2; //color가 2와 같은 경우
		color3=yourColor==3; //color가 3과 같은 경우
		color4=yourColor==4; //color가 4와 같은 경우
		//yourColor==n은 논리형 값임!! 이것들을 값으로 볼 줄 알아야 함
		
		//보기가 별로네? 그러니깐 삼항 연산자는 1개만 나올 때 사용해야겠다~!!
		result=color1?redMessage:color2?yellowMessage:color3?blackMessage:color4?whiteMessage: errorMessage;
		System.out.println(result);
		
	}

}
