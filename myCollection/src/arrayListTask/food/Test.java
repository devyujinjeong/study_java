package arrayListTask.food;

import arrayListTask.DBConnecter;

public class Test {
	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
//		음식 추가하기
		Food food1 = new Food();
		Food food2 = new Food();
		Food food3 = new Food();
		
		food1.setFoodName("비빔밥");
		food1.setFoodPrice(8_000);
		food1.setFoodType("한식");

		food2.setFoodName("짜장면");
		food2.setFoodPrice(6_000);
		food2.setFoodType("중식");
		
		food3.setFoodName("국밥");
		food3.setFoodPrice(6_000);
		food3.setFoodType("한식");
		
		restaurant.insert(food1);
		restaurant.insert(food2);
		restaurant.insert(food3);
		
		System.out.println(DBConnecter.foods);
		
//		음식 이름으로 종류 조회하기	
		System.out.println(restaurant.select("비빔밥"));
		System.out.println(restaurant.select("짬뽕"));
		
//		사용자가 원하는 종류의 음식 전체 조회
		System.out.println(restaurant.selectAllByType("한식"));

		
//		음식 종류 수정 후 가격 10% 상승
		restaurant.update(food1,"중식");
		System.out.println(food1);
		
//		사용자가 원하는 종류의 음식 개수 조회
		System.out.println(restaurant.checkNumberByType("한식"));
		System.out.println(restaurant.checkNumberByType("중식"));

	}
	
}
