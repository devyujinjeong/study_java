package hashMapTest.json;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONTest {
	public static void main(String[] args) {
//     ���� ��
//     User user = new User("hds1234", "1234", "������", 20);
//     JSONObject userJSON = new JSONObject(user);
//     String json = userJSON.toString();
//     
//     System.out.println(json);

//      ���� ��
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<JSONObject> userJSONs = new ArrayList<JSONObject>();
		JSONArray jsonArray = null;

		users.add(new User("jyj1234", "1234", "������", 23));
		users.add(new User("hgd1234", "9999", "ȫ�浿", 33));
		users.add(new User("lss1234", "7777", "�̼���", 37));

//		���� �� �ڵ尡 user�� ���ʷ� userJSON�̶�� ��ü�� �����, userjson�� �ִ´ٴ� �ڵ�
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

//      ���� ��(json ��ü�� ���� ��ü�� ���� �ڿ� map ������ Ȱ���ؼ� ����ϸ� ��)
		String json = "{\"password\":\"1234\",\"name\":\"������\",\"id\":\"jyj1234\",\"age\":20}";
		try {
			JSONObject userJSON = new JSONObject(json);
			System.out.println(userJSON.get("id"));
		} catch (JSONException e) {
			e.printStackTrace();
		}

	}
}
