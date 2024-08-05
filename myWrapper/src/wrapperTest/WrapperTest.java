package wrapperTest;

public class WrapperTest {
	public static void main(String[] args) {
		int data_i=10; 
	
		// boxing : 기본 타입 -> 래퍼 클래스
		// unboxing : 래퍼 클래스 -> 기본 타입

		// auto boxing
		Integer data_I=data_i;
		
		// auto unboxing
		data_i=data_I;
		
		// boxing
//		Integer data_I=new Integer(data_i); //써도 오류나지 않지만, 사용하지 말라는 의미
//		Integer data_I=Integer.valueOf(data_i);
		
		// unboxing
//		data_i=data_I.intValue();		
	}

}
