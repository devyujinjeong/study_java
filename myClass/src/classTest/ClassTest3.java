package classTest;
//this 이해하기 위해 만들 클래스

class Fruit{
	String name,color;
	int price;
	
	public Fruit(String name, String color, int price) {
		this.name = name;
//		이렇게 해야 Fruit 객체의 name 속성 = name 매개변수가 됨
		color = color; // 이렇게 하면 매개변수 이름과 대입하는 이름이 똑같게 되기 때문에 구분이 불가능함.
		price = price;
	}
}

public class ClassTest3 {
	public static void main(String[] args) {
//		생성자 코드가 하나라도 있을 경우에는, 기본 생성자가 자동적으로 생성되지 않음
//		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit("바나나", "노란색", 1000);
		System.out.println(fruit2.name); //이렇게 하면 name은 정상적으로 잘 출력됨
		System.out.println(fruit2.color); //color는 null값이 들어가 있음
		System.out.println(fruit2.price); //price는 0이 들어가 있음
	}
}
