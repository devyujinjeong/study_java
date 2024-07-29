package arrayTest;

public class ArTest1 {
	public static void main(String[] args) {
		int[] arData= {3,5,2,8,9}; //어떤 값을 넣을지 알고 있을 때
		
		System.out.println(arData); //주소값이 출력
		System.out.println(arData.length); //배열의 길이 
		
		for (int i=0;i<arData.length;i++) {
			System.out.println(arData[i]); //0~4번방에 담긴 값들 출력
		}
//		
//		5,4,3,2,1을 arData에 순서대로 넣고 출력
		for (int j=0;j<arData.length;j++) {
			arData[j]=5-j; //5~1까지를 arData애 넣기
			System.out.println(arData[j]);
		}
		
	}
}
