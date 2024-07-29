package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
//		스캐너 하나씩 뜯어서 생각해보기
//		스캐너라는 클래스가 있고, 여기의 객체를 sc라고 이름 붙인 거임.
//		그리고 생성자를 불러와서 사용하는것!! 
		Scanner sc=new Scanner(System.in);
		
//      초기값: 어떤 값을 넣을지 정해지지 않았을 때 넣는 값
//		정수:0
//		실수:0.0
//		문자:''
//		문자열:null
//		String firstName=null, lastName=null, name=null;
//		
//		System.out.print("이름: ");
//		firstName=sc.next();
//		lastName=sc.next();  //입력한 값이 name에 담기는 것!!
//		name=firstName+lastName;
//		System.out.println(name + "님 환영합니다.");
		
		String name = null;
	      
	    System.out.print("이름: ");
	    name = sc.nextLine();
	    System.out.println(name + "님 환영합니다.");

	}
}
