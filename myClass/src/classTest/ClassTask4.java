package classTest;

// 동물 클래스 선언
// 강아지와 고양이가 있다.
// 모든 동물은 이름과 나이가 있다.
// 하지만 고양이는 아직 나이만 알고 있기 때문에, 이름은 다시 가서 물어봐야 한다.
// 위 상황에 맞게 클래스를 선언하고 필드를 구성하라.
class Animals{
	String name;
	int age;
	
//	오버로딩 하기(강아지와 고양이의 생성자를 따로 만들거임)
//	강아지는 이름과 나이 모두 알고 있기 때문에 name과 age를 둘 다 받을 거임!!
 	public Animals(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
// 	고양이는 나이만 알고 있기 때문에, age만 받을 거임!!
	public Animals(int age) {
		this.age = age;
	}
}

public class ClassTask4 {
	public static void main(String[] args) {
//		동물들을 배열에 저장하기!!
		Animals[] animal= {
				new Animals("해피",24),
				new Animals(2)
		};
		
		System.out.println(animal[0].name);
		System.out.println(animal[0].age);
		
		System.out.println(animal[1].age);
		System.out.println("고양이야 그래서 넌 이름이 뭐야??");
		
		
	}
}


