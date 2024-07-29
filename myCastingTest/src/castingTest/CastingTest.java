package castingTest;

class Car{
	void engineStart() { //엔진 시작 메소드
		System.out.println("열쇠로 시동을 켬");
	}
}

//	Car를 상속받기 (SuperCar가 자식, Car이 부모)
class SuperCar extends Car{ 
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 켬");
	}
	
	void openRoof() {
		System.out.println("지붕열기");
	}
}
public class CastingTest {
	public static void main(String[] args) {	
//		객체화 하기
		Car matiz = new Car(); //마티즈 객체
		SuperCar ferrari = new SuperCar(); //페라리 객체
		
//		up casting
//		부모클래스 객체명 = new 자식클래스();
		Car noOptionFerrari=new SuperCar(); //SuperCar도 Car 타입!!
		
//		down casting (자식 클래스로 돌리기)
//		up casting했던 것을 down casting 한 것임!!
//		자식 클래스 변수명=(자식 클래스)업캐스팅했던 객체;
		SuperCar fullOptionFerrari=(SuperCar)noOptionFerrari; 
		
//		오류
//		SuperCar brokenFerrari=(SuperCar) new Car();
		
		noOptionFerrari.engineStart(); //뚜껑은 열 수 없음
		
		fullOptionFerrari.openRoof();
				
		System.out.println(matiz instanceof Car); //true
		System.out.println(matiz instanceof SuperCar); //false
		System.out.println(ferrari instanceof Car); //true
		System.out.println(ferrari instanceof SuperCar); //true
		System.out.println(noOptionFerrari instanceof Car); //true
		System.out.println(noOptionFerrari instanceof SuperCar); //true
		System.out.println(fullOptionFerrari instanceof Car); //true
		System.out.println(fullOptionFerrari instanceof SuperCar); //true
	
	}
}
