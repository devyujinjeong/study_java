package methodTest;

public class MethodTask {
//  1~10까지 println()으로 출력하는 메소드
//	printFrom1To10이라는 메소드 이름이고 return값이 없을 때는 void를 쓰기	
//	void 는 리턴 타입이 없음을 의미
//	void printFrom1To10(){ 
//		for (int i=0;i<10;i++) {
//			System.out.println(i+1);
//		}
//	}
	
//  "홍길동"을 n번 println()으로 출력하는 메소드
//	void printHong(int end){ //n번 출력을 하는데, n번은 사용자가 결정할 것이기 때문에 매개변수를 받기
//		for (int i=0;i<end;i++) {
//			System.out.println("홍길동");
//		}
//	}
	
//  이름을 n번 println()으로 출력하는 메소드
//	void printName(String name,int end){
	//사용자가 원하는 이름을 n번 받기 때문에 이름과 반복할 숫자를 사용자에게 받기
//		for (int i=0;i<end;i++) {
//			System.out.println(name);
//		}
//	}
	
//  세 정수를 뺄셈해주는 메소드 
//	원하는 세 개의 정수를 입력받기 (매개변수)
//	결과값을 사용자에게 보여줘야 하니깐 return 하기
//	int sub(int number1,int number2,int number3){
//		return number1-number2-number3;
//	}
	
//  두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//	int[] div(int number1, int number2) { //리턴 타입은 배열로도 받을 수 있음
//		int[] results = null; 
//		//results라는 배열 선언하기!!
//		//return은 2개를 리턴할 수 없기 때문에, 배열 원하는 값을 담고 배열을 리턴 하는 것임!!
//		
//		if(number2 != 0) { //0으로는 나누어질 수 없기 때문에!!
//			results = new int[] {number1 / number2, number1 % number2};
//			//results라는 배열에 몫과 나머지 담기
//		}
//		return results; //리턴은 화면에 나오는지 안나오는지를 생각하면서 판단하면 좋음
//	}
	
//  1~n까지의 합을 구해주는 메소드
//	int getTotal(int n){ //원하는 숫자 입력받기
//		int result=0;
//		for(int i=0;i<n;i++) {
//			result+=i;
//		}
//		return result;
//	}
	
//  홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
//	int oddEvenChange(int number) {
//		return ++number;
//	}
	
//  문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//	소문자97~, 대문자 65~
//	String changeLetter(String string){
//		String result="";
//		
//		for(int i=0;i<string.length();i++) {
//			char c=string.charAt(i);
//			if(c>=97&&c<=122) {
//				result+=(char)(c-32);
//			}
//			else if(c>=65&&c<=90) {
//				result+=(char)(c+32);
//			}
//			else {
//				result+=c;
//			}
//		}
//		return result;
//	}
	
//  문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
//	int getCount(String string, char character) {
//		int count=0;
//		for(int i=0;i<string.length();i++) {
//			char c=string.charAt(i); 
//			if(c==character) { //각 방에 들어있는 char을 입력한 character와 비교해서 같으면 1증가 시키기
//				count++;
//			}
//		}
//		return count;
//	}
	
//  5개의 정수를 입력받은 후 원하는 인덱스 값을 구해주는 메소드
//	int getValue (int[] arNumber,int index){
//		return arNumber[index];		
//	}
	
	
//  한글을 정수로 바꿔주는 메소드("일공이사" -> 1024) 
	int changeHangle(String hangle) {
		String hangles="공일이삼사오육칠팔구";
		String result="";
		
		for(int i=0;i<hangle.length();i++) {
			char c= hangle.charAt(i); //c에 내가 입력한 hangle의 index에 들어있는 char를 담기(길이만큼 반복)
			result+=hangle.indexOf(c); //반복한 것들 결과에 담아서 연결하기
		}
		return Integer.parseInt(result); //result값을 정수로 변환하기
	}
	
//  5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//	int[] maxAndMin(int[] arNumber){
//		int[] results= {arNumber[0],arNumber[0]};
//
//		for(int i=1;i<arNumber.length;i++) {
//			if(arNumber[0]<arNumber[i]) {results[0]=arNumber[i];}
//			if(arNumber[0]>arNumber[i]) {results[0]=arNumber[i];}
//		}
//		return results; 
//		return은 2개를 바로 쓰지 못함. 그래서 배열에 담아서 return을 함. 여러 개 return할 때는 배열로
//	}
	
//  String 클래스에 있는 indexOf() 만들기, 문자열과 검색 문자를 전달받아서 처리한다.
//	int indexOf(String string,char character){
//		for(int i=0;i<string.length();i++) {
//			char c=string.charAt(i);
//			if(c==character) {
//				return i;
//			}
//		}
//		return -1;
//	}
	
	public static void main(String[] args) {
		MethodTask methodTask=new MethodTask();
//		System.out.println(methodTask.changeHangle("공일이삼"));
		
//		String 초기값이 null일 때에는 아래에서 새로운 값을 대입한다는 뜻이고.
//		""(빈 문자열)일 때는 아래에서 누적 연결을 한다는 뜻이다.

//		String resultMessage=null; //null도 값임!! 
//		resultMessage=result? "홀수가 짝수로 변경되었습니다.":"짝수가 홀수로 변경되었습니다.";
//		System.out.println(resultMessage);
		
//		int[] results = methodTask.div(10, 3);
//		
//		if(results != null) {
//			System.out.println("몫: " + results[0]);
//			System.out.println("나머지: " + results[1]);
//		}else {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}

	}

}
