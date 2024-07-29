package classTest;

class Member {
	String name;
	String id;
	String password;
	int age;
	
	public Member() {;}
	
	public Member(String name, String id, String password, int age) {
//		this는 객체 자신의 또 다른 생성자를 호출할 때 사용함
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}	
}

public class ClassTask5 {
	public static void main(String[] args) {
//		기본 생성자를 생성하지 않으면 이런식으로 사용하지 못함. 그래서 강사님이 기본 생성자를 생성하라고 하시는 듯
		Member member = new Member();
		member.name = "정유진";
		member.age = 23;
		System.out.println(member.name);
		System.out.println(member.age);
	}
}
