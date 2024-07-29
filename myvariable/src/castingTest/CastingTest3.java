package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
		System.out.println(1+"3"); //어떤 자료형이든 문자열과 연결되면 연결되어서 문자열로 나옴
		System.out.println("1"+3+8); 
		//코드는 왼쪽에서 오른쪽으로 진행되기 때문에
//		"1"+3이 "13"으로 바뀌고, "13"+8은 "138"이 됨 
		System.out.println("1"+(3+8));
//		()가 최우선 연산자이기 때문에 3+8이 먼저 계산되는 것임.
	}
}
