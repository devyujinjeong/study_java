package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void engineStart() {
		System.out.println("열쇠로 시동 켜짐");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
}

// SuperCar는 브랜드, 색상, 가격, 모드가 있다.
// 시동을 켰을 때 열쇠와 음성으로 켤수 있다.
// 시동을 껐을 때 음성으로만 끌 수 있다.
class SuperCar extends Car{
	String mode; //모드 추가됨
	
//	기본 생성자 선언하기
	public SuperCar(){;}

//	생성자 선언하기
	public SuperCar(String brand, String color, int price, String mode) {
		super(brand,color,price); //부모 클래스에서 받기
		this.mode = mode; //mode 추가
	}

	@Override
//	여기에서 오버라이딩 할때는 Car에서 썼던 메소드도 실행하고, 그 밑에 원하는거 추가
	void engineStart() {
		super.engineStart();
		System.out.println("음성으로 시동 켜짐");
	}
	
//	여기에서 오버라이딩 할때는 Car에서 썼던 메소드는 사용하지 않고, 내가 원하는 메소드로 대체하기
	@Override
	void engineStop() {
		System.out.println("음성으로 시동 끔");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar superCar=new SuperCar("페라리","red",50_000,"sport");
		System.out.println(superCar.brand);
		System.out.println(superCar.color);
		System.out.println(superCar.price);
		System.out.println(superCar.mode);
		
		superCar.engineStart();
		superCar.engineStop();

	}
}
 

