package variableTest;

public class FormatTest {
	public static void main(String[] args) {
//		서식문자
//		반드시 따옴표 안에서 작성한다.
//      %d :정수(10진수 정수, decimal)
//		%o :정수(8진수 정수, octal)
//		%x :정수(16진수 정수, hexadecimal)
//      %f :실수(float)
//      %c :문자(character)
//      %s :문자열(String)
        
		String name="정유진";
		int age=10;
		
//		System.out.printf("이름: %s",name);
		System.out.printf("이름: %s, 나이: %d\n",name, age);
	
	}
}
