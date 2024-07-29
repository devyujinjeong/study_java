package myOperTest;

public class Oper1 {
	public static void main(String[] args) {
		boolean isTrue=10>6; //10>6은 true나 false라는 값으로 나옴
		
		System.out.println(10==11); //이걸 값으로 볼 줄 알아야 함!! true와 false라는 값!!
		System.out.println(10>3); //10>3이면 true라는 값!!
		System.out.println(isTrue);
		System.out.println(isTrue&&10!=10); //true&&false:!=는 not이라는 의미 (and)
		System.out.println(isTrue||10!=10); //true||false (or)
		
//결과가 true가 나오도록 변경한다.
		System.out.println(!(isTrue&&10 !=10)); 
		//원래는 값이 false로 나오게 되는데, 여기에 !를 씌워서 false의 반대인 true가 나오게 함.
	}

}
