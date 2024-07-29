package arrayListTask.fruit;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Test {
	public static void main(String[] args) {
//		마켓 객체화하기
		Market market = new Market();
//		과일 추가		
//		Fruit에 있는 필드를 사용하기 위해서 객체화하기
		Fruit fruit1 = new Fruit();
		Fruit fruit2 = new Fruit();
		
		fruit1.setFruitName("사과");
		fruit1.setFruitPrice(1000);
		fruit2.setFruitName("수박");
		fruit2.setFruitPrice(2000);
		
		market.insert(fruit1);
		market.insert(fruit2);
		
		System.out.println(DBConnecter.fruits);

//		과일 삭제
//		market.delete("사과");
//		System.out.println(DBConnecter.fruits);

//		과일 평균 가격 검사
		System.out.println(market.checkPrice("사과")); //평균 가격보다 낮음
		System.out.println(market.checkPrice());
		
//		과일 전체 조회
		System.out.println(market.selectAll());
		
//		과일 이름으로 가격 조회
		System.out.println(market.selectPrice("사과"));
		
	}

}
