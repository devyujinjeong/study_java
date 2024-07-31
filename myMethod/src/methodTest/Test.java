package methodTest;

public class Test {
	void change(int[] data) {
		data[0]=20;
	}
	
	public static void main(String[] args) {
		Test test=new Test();
		int[] data= {10}; //여기의 int data와 위의 int data는 다름
		test.change(data); //data를 20으로 바꿔주는 메소드 실행
		System.out.println(data[0]); //20이 출력 --> 주소값을 받아옴, 주소값은 절대 중복이 없음
	}
}
