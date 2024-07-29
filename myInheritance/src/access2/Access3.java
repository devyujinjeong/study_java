package access2;

import access1.Access1; //다른 패키지에 있다는 것을 알려줌

//public class Access3 {
//	public static void main(String[] args) {
//		Access1 access1=new Access1();
////		data2만 접근 가능함
//	}

public class Access3 extends Access1{
	public static void main(String[] args) {
		Access3 access3=new Access3();
//	자식이면 허용해줌!!
	}
}
