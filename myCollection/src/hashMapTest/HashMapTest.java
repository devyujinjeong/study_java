package hashMapTest;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[] args) {
//		String이 키, Integer가 value이고 우리가 궁금한 것은 가격임!!
		HashMap<String ,Integer> productMap = new HashMap<String, Integer>(); //key,value
		productMap.put("핸드폰",1_000_000); //핸드폰 정보 넣기
		productMap.put("람보르기니", 400_000_000); //int는 21억까지 들어감, 람보르기니 정보 넣기
		productMap.put("아이스크림", 3_000); //아이스크림 정보 넣기
		
		System.out.println(productMap);
//		put은 이전에(바뀌기 전) 있던 value값을 return 해준다. 
		System.out.println("이전 가격: "+productMap.put("람보르기니", 450_000_000)); 
//		이 경우에는 따로 출력되지 않음.
		System.out.println(productMap.put("페라리", 450_000_000)); 
//		위에서 바뀐게 밑에서는 잘 적용돼서 출력됨
		System.out.println(productMap);
		
		System.out.println(productMap.get("핸드폰")+"원"); //key값을 적기

	}

}
