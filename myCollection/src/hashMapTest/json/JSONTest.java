package hashMapTest.json;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONTest {
	public static void main(String[] args) {
//     보낼 때
//     User user = new User("hds1234", "1234", "정유진", 20);
//     JSONObject userJSON = new JSONObject(user);
//     String json = userJSON.toString();
//     
//     System.out.println(json);

//      보낼 때
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<JSONObject> userJSONs = new ArrayList<JSONObject>();
		JSONArray jsonArray = null;

		users.add(new User("jyj1234", "1234", "정유진", 23));
		users.add(new User("hgd1234", "9999", "홍길동", 33));
		users.add(new User("lss1234", "7777", "이순신", 37));

//		지금 이 코드가 user를 차례로 userJSON이라는 객체로 만들고, userjson에 넣는다는 코드
		for (User user : users) {
			JSONObject userJSON = new JSONObject(user);
			userJSONs.add(userJSON);
		}

		jsonArray = new JSONArray(userJSONs);

		System.out.println(jsonArray.toString());

		try {
			System.out.println(jsonArray.get(0));
			System.out.println(jsonArray.getJSONObject(0).get("name"));
		} catch (JSONException e) {
			e.printStackTrace();
		}

//      받을 때(json 객체를 원래 객체로 받은 뒤에 map 구조를 활용해서 사용하면 됨)
		String json = "{\"password\":\"1234\",\"name\":\"정유진\",\"id\":\"jyj1234\",\"age\":20}";
		try {
			JSONObject userJSON = new JSONObject(json);
			System.out.println(userJSON.get("id"));
		} catch (JSONException e) {
			e.printStackTrace();
		}

	}
}
