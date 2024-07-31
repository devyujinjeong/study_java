package classTest;

class School{
	String name, major; // 인스턴스 변수 
	
	// 생성자는 클래스와 이름이 같음
	public School() {} // 기본 생성자
	
	public School(String name, String major) { // 매개변수를 가진 생성자, 매개변수로 지역 변수 name과 major가 선언됨.
		this.name = name; // this.name은 인스턴스 변수, 오른쪽 name은 지역 변수 (매개변수)
		this.major = major; // this.major은 인스턴스 변수, 오른쪽 major은 지역 변수 (매개변수)
	}
	
	void showSchool(String name, String major) { // 학교와 학과 정보를 보여주는 메소드
		System.out.println("학교:" + name);
		System.out.println("전공:" + major);
	}
}

public class ClassTest4 {
	public static void main(String[] args) {
//		객체화 하기
		School school1 = new School();
		School school2 = new School("경희대학교","수학과");
		
		school1.showSchool("경희대학교","수학과");
		
		System.out.println(school2.name);
		System.out.println(school2.major);
	}
}

