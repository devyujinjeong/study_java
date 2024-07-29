package castingTest;

public class CastingTest2 {
	public static void main(String[] args) {
		char data=48; //48을 의미하는 문자로 들어감 
		System.out.println('A'+3); //'A'는 65임. 그리고 여기에 3을 더해서 68이 출력됨
		
		System.out.println(data);  //0이 출력됨. 48의 아스키코드는 '0'임	
		System.out.println(data+5); 
		//48이라는 정수가 문자로 변환하면 '0'으로 변환됨 그래서 data+5는 '0'+5=53이 나오게 됨
		//0과 5를 더했는데 왜 5가 아니지? 둘 중 하나의 자료형이 다르다는 것을 명심하기!!
		System.out.println((int)data);
	}

}
