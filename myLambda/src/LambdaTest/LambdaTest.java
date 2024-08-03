package LambdaTest;

public class LambdaTest {
public static void main(String[] args) {
	// 매개변수 -> 리턴값
	LambdaInter1 lambdaInter1=number->number%10==0;
	
	// 매개변수 -> 2개 이상의 문장 작성하기
	LambdaInter2 lambdaInter2=()->{
		int total=0;
		for(int i=0;i<10;i++) {
			total+=i+1;
		}
		return total;
	};
	
	LambdaInter3 lambdaInter3=number->number%2==1;
	
	LambdaInter4 lambdaInter4=end->{
		String name= "홍길동";
		for(int i=0;i<end;i++)
			System.out.println(name);
		return name;
	};
	
	System.out.println(lambdaInter1.checkMultipleOf10(30));
	System.out.println(lambdaInter2.getTotalFrom1To10());
	System.out.println(lambdaInter3.checkOdd(10));
	System.out.println(lambdaInter4.printName(10));
	}
}
