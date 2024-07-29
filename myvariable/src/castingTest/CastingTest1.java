package castingTest;

public class CastingTest1 {
	public static void main(String[] args) {
//		자동형변환
		System.out.println(5/2); //정수/정수=정수: 무조건 정수가 나옴(나머지는 그냥 버림)
		System.out.println(5/2.0); // 정수/실수 = 실수
		
//		강제형변환 
		System.out.println(5/(double)2); //2를 double로 강제 형변환 시킨것임

	}

}
