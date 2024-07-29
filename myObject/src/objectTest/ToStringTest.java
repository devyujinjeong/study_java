package objectTest;

import java.util.Random;

public class ToStringTest {
	public static void main(String[] args) {
		Student student=new Student();
//		여기 밑을 보면 number,name,major는 다 사용자가 입력해야 하는 값들임
//		즉, 사용자가 입력한 값으로 초기화 되는 것임
//		그리고 밑에서 print를 하는데, student 객체 뒤에 toString() 메소드가 생락되어 있는것임.
//		우리가 toString()을 재정의 했기 때문에, 이제 사용자가 입력한 값들을 확인할 수 있게 됨.
		student.number=1;
		student.name="정유진";
		student.major="수학과";
		
		System.out.println(student);
		
//		Random r= new Random();
//		그동안 객체를 출력할 때 toString()이 생략되어 있었음.
//		r이라는 객체를 통해 toString() 메소드를 사용
//		System.out.println(r.toString());
	}
}

