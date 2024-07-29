package methodTest;

//이건 그냥 나의 이해를 돕기 위해서 만든 method class
class Foo{
	public static String classVar="I class var";	
	public String instanceVar="I instance var";
	public static void classMethod(){
		System.out.println(classVar);
//		System.out.println(instanceVar);
	} 
	public void instanceMethod() {
		System.out.println(classVar);
		System.out.println(instanceVar);
	}
}

public class MethodTest2 {
	public static void main(String[] args) {
		System.out.println(Foo.classVar); //classVar에는 접근 가능
//		System.out.println(Foo.instanceVar);   //
		Foo.classMethod();
//		Foo.instanceMethod(); --> instance 소속
		
		Foo f1=new Foo(); //객체화
		Foo f2=new Foo();
		
		System.out.println(f1.classVar); //I class var 출력됨
		System.out.println(f1.instanceVar); //I instance var 출력됨
		
//		f1.classVar="changed by f1";
//		그니깐 static을 사용하게 되는 경우에 f1, f2를 객체화 한 뒤에 출력하면
//		static을 컴파일러가 메모리에 가장 먼저 할당해주기 때문에
//		애초에 값이 통째로 바뀌게 되는 것이고, 그렇기 때문에 어떤 객체를 사용해서(?) 출력하더라도 같은게 출력됨!! 즉 고정되는 것임!
//		아 그래서 이게 그 강사님이 자동차 얘기할 때 했던 얘기 같음.
//		static을 사용하면 공통되는 값이 고정되게 되는 것이고, 만약에 값을 바꾸면 한번에 바뀌게 되는 거지!! 아하!! 와 대박
		
		
//		System.out.println(f1.classVar); //changed by f1 출력됨 
//		System.out.println(f2.classVar); //changed by f1 출력됨 
		
		f1.instanceVar="changed by f1";
		System.out.println(f1.instanceVar); //changed by f1 출력됨 
		System.out.println(f2.instanceVar); //I instance var 출력됨 
		
		
	}
	

}
