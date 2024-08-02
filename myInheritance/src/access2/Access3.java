package access2;

import access1.Access1; //다른 패키지에 있다는 것을 알려줌

//public class Access3 {
//	public static void main(String[] args) {
//		Access1 access1=new Access1();
////		data2만 접근 가능함
//		
//		System.out.println(access1.data2);
//	}
//}

public class Access3 extends Access1{
	public static void main(String[] args) {
		Access3 access3=new Access3();
		
		System.out.println(access3.data2);
		System.out.println(access3.data3); // Access3이 자식 클래스 이기 때문에 허용해줌
		System.out.println(access3.getData()); // getter를 사용하면 접근이 가능함
	}
}
