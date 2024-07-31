package methodTest;

class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";

	public static void classMethod() {
		System.out.println(classVar);
//		System.out.println(instanceVar); 이렇게 작성 불가능
	}

	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}

public class MethodTest2 {
	public static void main(String[] args) {
		System.out.println(Foo.classVar); // classVar에는 접근 가능
//		System.out.println(Foo.instanceVar); //불가능
		Foo.classMethod();
//		Foo.instanceMethod(); --> instance 소속이므로, 객체를 먼저 생성한 후에 메소드를 사용할 수 있다. 

		// 객체화
		Foo f1 = new Foo();
		Foo f2 = new Foo();

		System.out.println(f1.classVar); // I class var 출력됨 --> 보통은 바로 클래스에 접근해서 사용함
		System.out.println(f1.instanceVar); // I instance var 출력됨

		f1.classVar="changed by f1";
//		static을 사용하게 되는 경우에 f1, f2를 객체화 한 뒤에 출력하면
//		static을 컴파일러가 메모리에 가장 먼저 할당해주기 때문에
//		애초에 값이 통째로 바뀌게 되는 것이고, 그렇기 때문에 어떤 객체를 사용해서 출력하더라도 같은게 출력됨!! 즉 고정되는 것임!

		System.out.println(f1.classVar); //changed by f1 출력됨 
		System.out.println(f2.classVar); //changed by f1 출력됨 

//		f1.instanceVar = "changed by f1";

//		static이 아니기 때문에 다른 객체에게 영향을 끼치지 않음
//		System.out.println(f1.instanceVar); // changed by f1 출력됨
//		System.out.println(f2.instanceVar); // I instance var 출력됨

	}

}
