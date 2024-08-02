package access1; // 같은 패키지

public class Access2 { //다른 클래스에서 접근하기
	public static void main(String[] args) {
		Access1 access1=new Access1(); //같은 패키지, 다른 클래스
	
		// data4를 제외하고선 접근 가능
		System.out.println(access1.data1);
		System.out.println(access1.data2);
		System.out.println(access1.data3);
		System.out.println(access1.getData()); // getter를 사용하면 접근이 가능함
	}
}
