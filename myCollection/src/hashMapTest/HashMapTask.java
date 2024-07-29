package hashMapTest;

import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class HashMapTask {
	public static void main(String[] args) {
//		아이디, 비밀번호, 이름은 String 타입이고, 나이는 int 타입임!!
//		그래서 upcasting을 해서 object타입으로 각각 값을 입력받을 수 있도록 했음.
		HashMap<String , Object> userMap = new HashMap<String, Object>(); //key,value
		JSONObject userJSON=null, resultJSON=null;
		String json = null;
		
		userMap.put("id", "jyj1234"); //아이디 정보 넣기
		userMap.put("password", "12341234"); //비밀번호 정보 넣기
		userMap.put("name", "정유진"); //이름 정보 넣기
		userMap.put("age", 23); //나이 정보 넣기
			
		System.out.println(userMap);
		System.out.println(userMap.get("name")+"님 환영합니다~!!");
		
//		JSONObject 생성자에 HashMap 생성자를 넘기기
		userJSON=new JSONObject(userMap);
		json=userJSON.toString();
		System.out.println(json);
		
		try {
			resultJSON = new JSONObject(json); //json 형식이 아닐 경우 문제가 발생할 수 있음
			System.out.println(resultJSON.get("name"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}
}