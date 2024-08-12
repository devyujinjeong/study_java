package hashMapTest.json;

import java.util.ArrayList;
import java.util.Arrays;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONTask {
	public static void main(String[] args) {
//    ��ǰ��ȣ, ��ǰ��, ��ǰ����, ��ǰ��� : Product Ŭ������ ����

//    1. ��ǰ 3���� JSONArray�� ������ (��ǰ�� ��� �߰��Ǳ� ������, arraylist ���)
//		ArrayList<JSONObject> productJSONs = new ArrayList<JSONObject>(Arrays.asList(
//				new JSONObject(new Product(1, "���찳", 300, 200)),
//				new JSONObject(new Product(2, "����", 1000, 500)),
//				new JSONObject(new Product(3, "����", 3000, 150))));
//
//		JSONArray arProductJSON = new JSONArray(productJSONs);
//		String products = arProductJSON.toString();
//
//		System.out.println(products);

//      2. ���� JSONArray�� �� ������ ��� ����ϱ�
		String products = "[{\"number\":1,\"price\":300,\"name\":\"���찳\",\"stock\":200},{\"number\":2,\"price\":1000,\"name\":\"����\",\"stock\":500},{\"number\":3,\"price\":3000,\"name\":\"����\",\"stock\":150}]";
		try {
			JSONArray arProudctJSON = new JSONArray(products);

			for (int i = 0; i < arProudctJSON.length(); i++) {
				JSONObject productJSON = arProudctJSON.getJSONObject(i);
				System.out.println(productJSON.get("number"));
				System.out.println(productJSON.get("name"));
				System.out.println(productJSON.get("price"));
				System.out.println(productJSON.get("stock"));
				System.out.println("=============================");
			}

		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
