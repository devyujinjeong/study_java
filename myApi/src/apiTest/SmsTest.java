package apiTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SmsTest {
	public static void main(String[] args) {
		String api_key = "NCSF9OW2I1LDLV3Y";
		String api_secret = "MRF0MFCTQNMO3EWFGFTF5RDWWZNLKJ7S";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", "01054911228");
		params.put("from", "01054911228");
		params.put("type", "SMS");
		params.put("text", "집 앞에 택배 놓고 갑니다.");
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}

	}
}