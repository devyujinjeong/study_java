package lambdaTask2;

public class Split {
	public static void main(String[] args) {
		String expression="1+9-7";
//		위의 1+9-7이라는 String을 +또는 -로 나눠주고 numbers라는 String 배열에 다믹
		String[] numbers=expression.split("\\+|\\-");
		
//		배열에 담은 것들을 정수로 변환하기
		for(int i=0;i<numbers.length;i++) {
			System.out.println(Integer.parseInt(numbers[i]));
		}
	}
}
