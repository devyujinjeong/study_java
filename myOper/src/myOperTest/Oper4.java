package myOperTest;

public class Oper4 {
	public static void main(String[] args) {
		//대입 연산자 확인하기!!
		int data=10;
		System.out.println(data=data+1);
		System.out.println(data+=1);
		System.out.println(data++); //먼저 값이 출력되고 증가, 결과적으로 여기에서는 12가 출력되고 값이 1 증가
		System.out.println(data); //위에서 값이 증가되고 끝났기 때문에 13이 출력됨
		System.out.println(++data); //값이 즉시 반영됨. 값이 1증가하고 출력됨
	}

}
