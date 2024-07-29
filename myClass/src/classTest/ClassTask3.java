package classTest;

//	이 문제에서는 결국, 할인율을 적용한 가격으로 상품을 판매
//	통장 잔고에서 판매 가격을 제외해주고
//	상품 수량을 하나씩 제외 시켜주면 됨

//	손님 클래스 선언하기
class Customer{
//	필드 구성하기(이름, 핸드폰 번호, 통장 잔고, 할인율)
	String name; 
	String phone;
	int money;
	int discount;
	
//	생성자 선언하기
	public Customer(String name, String phone, int money, int discount) {
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.discount = discount;
	}
}

class Market{ //상점 클래스 선언하기
//	필드 구성하기(상품 이름, 상품 가격, 상품 재고)
	String productName;
	int productPrice;
	int productStock;
	
//	생성자 선언하기	
	public Market(String productName, int productPrice, int productStock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	
//	판매 메소드 선언, 매개변수는 Customter형 (클래스)
	void sell(Customer customer){ 
		customer.money-=productPrice*(100-customer.discount)/100; //남은 잔액 구하기
		productStock--;	//상품 재고 1개 빼주기
		
	}
}

public class ClassTask3 {
	public static void main(String[] args) {
		Market emart=new Market("새우깡",1000,10); 
		
//		고객은 여러 명이니깐 배열로 만들기!!
		Customer[] customers= { 
				new Customer("정유진","01012345678",3000,20),
				new Customer("A","01098765432",5000,30)
		};
	
		for (int i=0;i<customers.length;i++) {//sell이라는 메소드를 customer 수만큼 돌릴 것임
			emart.sell(customers[i]);  
			System.out.println(customers[i].name+"님의 잔액은 "+customers[i].money+"입니다.");
		}
	}
}

