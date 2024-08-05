package wrapperTest;

public class WrapperTask {
	public static void main(String[] args) {
//		1, 10.9, 'A', true, "ABC"
//		위 5개의 값을 5칸 배열에 담은 뒤 출력
//		기본 자료형은 하나의 타입으로 묶을 수 없다.
//		하지만 클래스 타입은 모두 Object 타입이다. (Object는 최상위 클래스라고 생각하면 됨)
//		그래서 위의 서로 다른 5개의 값을 담을 때는, Wrapper Class의 boxing을 사용해서 모두 Object타입으로 맞춰준 뒤
//		Object 배열에 넣어준다.

//		밑에 datas에서 'A', true, "ABC"는 auto_boxing
// 		1, 10.9도 당연히 auto_boxing 가능
		Object[] datas= {Integer.valueOf(1),Double.valueOf(10.9),'A',true,"ABC"};
	
//		빠른 for문, forEach문, 향상된 for문
		for(Object data:datas) { //	datas에 있는 값들을 data에 순서대로 담기
			System.out.println(data); // data 출력하기
		}
	}
}
