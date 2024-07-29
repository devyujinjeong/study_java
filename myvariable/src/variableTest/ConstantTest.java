package variableTest;

public class ConstantTest {
	public static void main(String[] args) {
		final int ON=7479; //상수는 대문자로 작성하자, _는 상수일 때만 쓰기
		final int OFF=884112; //상수는 고정되어 있는 수!! 변화하지 않음!!

//		on=1; //이렇게 작성하면 컴파일 오류 발생 : 대문자와 소문자를 확실하게 구분해야 함.
//		ON=1; //ON은 이미 7479로 고정되어 있기 때문에 바꿀 수 없음.

		System.out.println(ON);
		System.out.println(OFF);
	}
}
