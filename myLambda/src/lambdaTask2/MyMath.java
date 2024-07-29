package lambdaTask2;

public class MyMath {
	public static Calc operator(String oper) {
		//삼항 연산자 사용하기!! 
//		만약에 oper의 기호가 "+"와 같다면 두개를 더한 값을 return, 아니라면 두 값을 뺀 값을 return
		return oper.equals("+")? (num1,num2)->num1+num2:(num1,num2)->num1-num2;
	}
	
	public static void main(String[] args) {
//		함수형 인터페이스의 메소드 만들기
		OperCheck operCheck = e -> {
//			이거 null을 넣는것과 ""을 넣는것의 쓰임새가 다르게 있다고 하셨는데, 그게 정확히 뭐지??
			String result="";
			for(int i=0;i<e.length();i++) { //입력한 e의 길이만큼 반복하기.
				char c=e.charAt(i); 
				// e의 각각의 글자들을 char 변수 c에 담기
				// 참고로 charAt(i)는 i번째 방에 있는 문자값을 의미함.
				if(c=='-'||c=='+') { //만약에 c가 - 또는 +라면
					result+=c; // result에 +,- 담기
				}
			}
			return result.split("");
		};
		
		String expression="1+9-7";
		String[] opers = operCheck.getOpers(expression);
//		1+9-7이라는 String을 +,- 단위로 나눠 주기
//		분리한 뒤에 numbers라는 String 배열에 담아 주기
		String[] numbers=expression.split("\\+|\\-");

		int number1=0, number2=0;
		number1=Integer.parseInt(numbers[0]);
		
//		숫자가 n개면 연산은 n-1번만큼 진행함.
		for(int i=0;i<opers.length;i++) {
			number2= Integer.parseInt(numbers[i]+1);
			number1=MyMath.operator(opers[i]).calculate(number1,number2);
		}
		
		System.out.println(number1);
		
	}
}