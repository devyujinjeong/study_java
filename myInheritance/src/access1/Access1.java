package access1;

public class Access1 {
	int data1; //아무것도 안쓰면 default
	public int data2; //모든 곳에서 접근가능
	protected int data3; //다른 패키지에서 접근 불가, 자식은 허용 
	private int data4; 
//	캡슐화, 은닉화
//	나만 접근 가능 --> Access2라는 클래스에서는 접근 불가능
	
	public Access1() {
		this.data1=10;
		this.data2=20;
		this.data3=30;
		this.data4=40;
	}
	
	// getter, setter 메소드
	public void setData(int data4) {
		this.data4=data4;
	}
	
	public int getData() {
		return data4;
	}

}
