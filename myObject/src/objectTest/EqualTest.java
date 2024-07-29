package objectTest;

public class EqualTest {
	public static void main(String[] args) {
		Student student = new Student(1,"정유진","수학과");
//		더 자세하게 분석하면, 위에서 만든 필드의 주소와 밑에서 만든 필드의 주소는 다름
//		왜냐? 생성자가 2번 호출되었으니깐, 당연히 필드의 주소는 다르겠지!!
//		그 결과 안에 들어가 있는 값이 같더라도, 주소가 다르기 때문에 false가 출력하게 됨
		System.out.println(student==new Student(1,"정유진","수학과"));
		
//		재정의된 equals 사용하기
		System.out.println(student.equals(new Student(1,"정유진","수학과")));
	}

}
