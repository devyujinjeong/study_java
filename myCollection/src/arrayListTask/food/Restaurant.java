package arrayListTask.food;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

//CRUD관련 기능을 담아놓을 클래스 선언(restaurant)
public class Restaurant {
//	음식 추가
	public void insert(Food food) {
		DBConnecter.foods.add(food);
	}
	
//	음식 이름으로 음식 종류 조회
	public Food select(String name) {
		Food result = null;
		for(Food food : DBConnecter.foods) {
			if(food.getFoodName().equals(name)) {
				result = food;
				break;
			}
		}
		return result;
	}
		
//	사용자가 원하는 종류의 음식 전체 조회
	public ArrayList<Food> selectAllByType(String type) {
		ArrayList<Food> results = new ArrayList<Food>();
		for(Food food : DBConnecter.foods) {
			if(food.getFoodType().equals(type)) {
				results.add(food);
			}
		}
		return results;
	}
	
//	음식 종류 수정 후 가격 10% 상승
	public void update(Food food, String type) { 
		//어떤 음식을 수정할지 받고, 어떤 종류로 수정할지 받아보기
		for(Food data : DBConnecter.foods) {
			if(data.getFoodName().equals(food.getFoodName())) {
				data.setFoodType(type); //foodType을 가져와서 변화 시키기
				data.setFoodPrice((int)(data.getFoodPrice() * 1.1)); //음식 가격을 가져온 후에 변화 시키기
			}
		}
	}
	
//	사용자가 원하는 종류의 음식 개수 조회
	public int checkNumberByType(String type) {
		int count=0;
		for(Food food : DBConnecter.foods) {
			if(food.getFoodType().equals(type)) {
				count++;
				
			}
		}
		return count;
	}
	
	


}
