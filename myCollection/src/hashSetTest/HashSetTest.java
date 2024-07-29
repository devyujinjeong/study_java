package hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		Student student = new Student(1, "정유진");
//		이제는 재정의를 통해서 주소 비교 안하고 값비교 중에 번호 비교를 하고 있음! 
		System.out.println(student.equals(new Student(1, "정유진")));
		
//		반드시 hashcode도 재정의 해줘야 함. 재정의 해주지 않으면 필드가 2개 생성되면서 size가 2개로 출력됨.
		HashSet<Student> studentSet = new HashSet<Student>();
//		동일한 학생임에도 불구하고 hashcode가 다름 --> hashcode를 재정의한 뒤에는 필드의 값이 같아서 중복이 제거됨
		studentSet.add(student);
		studentSet.add(new Student(1, "정유진"));
		
		System.out.println(studentSet.size());
		
//		한마디로 초기화 한것!!
//		코딩 데스트에서 중복값을 제거하라고 적혀 있으면, 밑에처럼 hashset을 사용하면 됨!!
//		밑에 Arrays는 배열을 객체로 만들어 놓은것. 배열도 결국은 클래스로 작업을 하는 것임
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(2, 4, 7, 5, 5, 5, 5));
//		hashSet생성자에 datas 넣기 --> 중복이 없어짐
		HashSet<Integer> dataSet = new HashSet<Integer>(datas); 
		datas = new ArrayList<Integer>(dataSet); // 다시 arraylist로 들어감 --> 순서가 생김
		System.out.println(datas);
		
		
//		HashSet<String> fruitSet = new HashSet<String>();
//		fruitSet.add("사과");
//		fruitSet.add("배");
//		fruitSet.add("자두");
		
//		아무리 복숭아를 추가해도 fruitSet을 출력하면 복숭아가 하나만 포함되어 있음.
//		toString이 생략되어 있음
//		fruitSet.add("복숭아"); 
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//		fruitSet.add("복숭아");
//
//		System.out.println(fruitSet);
//		
//		System.out.println(fruitSet.contains("복숭아"));
	}

}
