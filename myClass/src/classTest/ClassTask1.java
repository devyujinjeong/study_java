package classTest;

class SuperCar { 
//	변수 선언하기
//	밑에 있는 변수들은 차마다 다른 것들이므로 그냥 변수 선언하는 것처럼 하면 됨
	String brand;
	String color;
	int price;
	boolean engine;
	
//	Alt+shift+s --> O --> s --> enter
//	생성자 선언하기
	public SuperCar(String brand, String color, int price) {//SuperCar선언!!
		this.brand = brand; // 파란색에 갈색을 넣기
		this.color = color; // this를 꼭 쓰기
		this.price = price; 
	}
	
//	오버로딩 하기 --> 같은 이름의 생성자 사용하기
	public SuperCar(String brand) {
		this.brand=brand;
	}
	
//	시동 켜기
	void engineStart() {
		engine=true;
	}

//	시동 끄기
	void engineStop() {
		engine=false;
	}
}

public class ClassTask1 {
	public static void main(String[] args) {
		SuperCar ferrari=new SuperCar("페라리","red",50_000);  
//		페라리가 객체고 거기에 주소값이 들어가 있는것임! 중괄호가 없으니 사용.
//		근데 선언한적이 없는데 어케 사용?!
		SuperCar lamborghini=new SuperCar("람보르기니", "yellow",60_000); 
		
		System.out.println(ferrari.brand);
		System.out.println(ferrari.color);
		System.out.println(ferrari.price);

//		ferrari.engine 꺼져 있으면, 엔진 켜기
		if(!ferrari.engine) { //ferrari.engine이 false라면 -->!사용해서 true로 바꿔줌
			ferrari.engineStart(); //엔진 켜기
			System.out.println(ferrari.brand+" 시동 켜짐");
		}
		else{
			System.out.println("이미 시동이 켜져 있습니다.");
		}
		
//		ferrari.engine 켜져 있으면, 엔지 끄기
		if(ferrari.engine) {  //ferrari.engine이 true라면
			ferrari.engineStop(); //엔진 끄기
			System.out.println(ferrari.brand+" 시동 꺼짐");
		}
		else{
			System.out.println("이미 시동이 꺼져 있습니다.");
		}
		
	}
	
}
