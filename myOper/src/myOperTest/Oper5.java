package myOperTest;

public class Oper5 {
	public static void main(String[] args) {
//		1~10까지 중 4까지만 출력
		for(int i=0;i<10;i++) {
			System.out.println(i+1); 
			// 여기까지 실행하면 1~10까지 출력됨. 
			// 참고로 i는 0부터 시작이기 때문에 1~10까지 출력하기 위해서는 i에 1을 더해서 출력. 안그럼 0~9까지 출력됨
			if(i==3) {break;}
			//만약에 i가 3인 경우 if문을 감싸는 중괄호를 탈출한다!! 
		}
		
//		1~10까지 중 4제외하고 출력
		for(int i=0;i<10;i++) {
			if(i==3) {continue;} 
			//만약 i가 3이라면 다음 반복으로 넘어가라. 즉, i가 3인 경우 코드를 실행하지 않고 다음으로 넘어가라!!
			System.out.println(i+1);
		}
	}

}
