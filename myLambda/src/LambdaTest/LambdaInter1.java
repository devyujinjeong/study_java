package LambdaTest;

// 함수형 인터페이스는 추상메소드가 하나임. 이러한 강제성을 주기 위해서 밑에 친 코드처럼 @FunctionalInterface을 작성함
@FunctionalInterface 
public interface LambdaInter1 {
//	추상 메소드만 사용할 수 있기 때문에, abstract은 생략 가능함.
	public boolean checkMultipleOf10(int number);
}
