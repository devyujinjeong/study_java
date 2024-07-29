package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest/*<T>*/ {
	
//	T data;
	
	public static void main(String[] args) {
//		<?> 제네릭(이름이 없는)
//		객체화 시 타입을 지정하는 기법.
//		설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//		따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수도 있기 때문에
//		Object가 아닌 제네릭으로 선언한다.
//		ArrayListTest<Integer> arrayListTest = new ArrayListTest<Integer>();
//		이제 위의 코드에서 <>안에 있는 부분의 자료형이 어떤 것 인지에 따라 data의 자료형이 달라지게 됨.		
		
//		capacity(용량): 미리 확보해 놓을 공간, 나의 메모리의 한계를 확인할 수 있다.
//		용량에 제한을 주는 것이 아니라 공간을 확보하는 것이다!! 
		ArrayList<Integer> datas = new ArrayList<>();
		
		datas.add(10);
		datas.add(40);
		datas.add(50);
		datas.add(90);
		datas.add(80);
		datas.add(30);
		datas.add(70);
		datas.add(20);
		datas.add(60);
		
		System.out.println(datas.size());
		
//		data에 datas에 있는것들을 차례로 담고 출력하기
		for(int data : datas) {
			System.out.println(data);
		}
		
		System.out.println(datas);
		
//		오름 차순
		Collections.sort(datas);
		System.out.println(datas);
		
//		가운데를 기준으로 좌우 반대로 바꾸기
//		따라서 내림차순으로 데이터를 보고 싶다면 우선 오름 차순으로 정렬 시킨 다음에 reverse 메소드를 사용해야 한다.
		Collections.reverse(datas);
		System.out.println(datas);
		
//		섞기
		Collections.shuffle(datas);
		System.out.println(datas);
		
//		삽입, 60은 항상 30뒤에 삽입된다.
		if(datas.contains(60)) {
//			indexOf() 메소드는 값의 인덱스 번호를 출력함 
//			60뒤에 30을 삽입하는 거니깐, 60이 있는 index번호 다음으로 index를 설정해서 삽입하면 됨
			datas.add(datas.indexOf(60) + 1, 30);
			System.out.println(datas);
		}
		
//		수정, 10을 1로 수정한다.
		if(datas.contains(10)) {
//			set(인덱스 번호, 대체할 숫자)
//			리스트에 있는 특정한 위치에 내가 원하는 값으로 수정할 수 있게 해주는 것.
			System.out.println(datas.set(datas.indexOf(10), 1) + "이 1로 수정되었습니다.");
			System.out.println(datas);
		}
		
//		삭제, 20을 삭제한다
//		1. 인덱스로 삭제
//		if(datas.contains(20)) {
//			System.out.println(datas.remove(datas.indexOf(20)) + " 삭제되었습니다.");
//			System.out.println(datas.contains(20));
//		}
		
//		2. 값으로 삭제
		if(datas.remove(Integer.valueOf(20))) {
			System.out.println("삭제 성공");
			System.out.println(datas.contains(20));
		}
	}
}