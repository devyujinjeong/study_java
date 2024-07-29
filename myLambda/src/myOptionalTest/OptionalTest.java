package myOptionalTest;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
//		NPE(NullPointerException)
//		서버에서 NPE가 발생하면,
//		하나씩 오류를 찾기도 힘들고 null 검사를 통해 코드가 복잡해진다.
		
//		Optional
//		실제 사용할 값을 Optional필드에 저장해놓고,
//		Optional이 제공하는 다양한 메소드로 편하게 NPE를 방어할 수 있다.
		
		String data=null;
		
//		of(T value) : 절대로 null이 아닌 값을 넣을 때 사용
//		ofNullable(T value) : null이 일 수 있는 값을 넣을 때 사용
		Optional<String> optionalData = Optional.ofNullable(data);
		
//		isPresent() 는 Optional에 담긴 값이 null 이면 fasle,
//		null이 아니면 true이다.
		System.out.println(optionalData.isPresent());
		
		if(optionalData.isPresent()) { //null이 아니면 true
			System.out.println(optionalData.get()); //실제 값을 가져온다.
		}	
	
//		ifPresent(): null이 아닐 때 전달한 람다식이 실행된다.
//		ifPresentOrElse(): null이 아닐 때 첫 번째로 전달한 람다식이 실행되고, null일 때 두 번째로 전달한 람다식이 실행된다.
		optionalData.ifPresent(System.out::println);
//		null이 아닐때는 실행하고, null일때는 "과일이 없습니다." 출력하기
		optionalData.ifPresentOrElse(System.out::println, ()-> System.out.println("과일이 없습니다."));
	}
}

















