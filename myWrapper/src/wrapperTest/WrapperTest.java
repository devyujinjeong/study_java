package wrapperTest;

public class WrapperTest { //기본자료형으로 뭔가를 더 사용할 수 없는 순간이 오게 되는 경우
	public static void main(String[] args) {
		int data_i=10; 
	
//		auto boxing
		Integer data_I=data_i;
		
//		auto unboxing
		data_i=data_I;
		
//		boxing
//		Integer data_I=new Integer(data_i); //써도 오류나지 않지만, 사용하지 말라는 의미
//		Integer data_I=Integer.valueOf(data_i);
		
//		unboxing
//		data_i=data_I.intValue();		

		
	}

}
