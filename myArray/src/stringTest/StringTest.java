package stringTest;

public class StringTest {
	public static void main(String[] args) {
		String data="ABCD"; 
		//클래스 안에 있는 배열로 접근하기 위해 메소드 사용
		System.out.println(data.length());
		System.out.println(data.charAt(1)); //1번방에 있는 B가 출력됨
		System.out.println(data.indexOf("D")); //D가 있는 index의 번호인 3이 출력됨
	}
}
