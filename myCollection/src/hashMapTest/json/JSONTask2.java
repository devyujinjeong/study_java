package hashMapTest.json;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONTask2 {
//  주문번호, 고객이름, 주문할 음식 : restaurant 클래스로 선언
	public static void main(String[] args) {
		
//	    1. 음식 3개를 JSONArray로 보내기
//		arraylist에 담기
//	      ArrayList<JSONObject> restaurantJSONs 
//	         = new ArrayList<JSONObject>(
//	               Arrays.asList(
//	                     new JSONObject(new Restaurant(1,"짜장면","홍길동")),
//	                     new JSONObject(new Restaurant(2,"짬뽕","철수")),
//	                     new JSONObject(new Restaurant(3,"볶음밥","짱구"))
//	                  )); 
//	      
//	      JSONArray arRestaurantJSON = new JSONArray(restaurantJSONs);
//	      String restaurants = arRestaurantJSON.toString();
//	      
//	      System.out.println(restaurants);
//	}
	
//      2. 받은 JSONArray의 각 정보를 모두 출력하기
		String restaurant = 
				"[{\"foodName\":\"짜장면\",\"orderNumber\":1,\"customerName\":\"홍길동\"},{\"foodName\":\"짬뽕\",\"orderNumber\":2,\"customerName\":\"철수\"},{\"foodName\":\"볶음밥\",\"orderNumber\":3,\"customerName\":\"짱구\"}]";        
	     try {
	         JSONArray arRestaurantJSON = new JSONArray(restaurant);
	         
	         for(int i=0; i<arRestaurantJSON.length(); i++) {
	            JSONObject productJSON = arRestaurantJSON.getJSONObject(i);
	            System.out.println(productJSON.get("orderNumber"));
	            System.out.println(productJSON.get("foodName"));
	            System.out.println(productJSON.get("customerName"));
	            System.out.println("=============================");
	         }
	         
	      } catch (JSONException e) {
	         e.printStackTrace();
	      }
	}
}
