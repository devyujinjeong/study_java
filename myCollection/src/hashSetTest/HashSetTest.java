package hashSetTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		Student student = new Student(1, "������");
//		������ �����Ǹ� ���ؼ� �ּ� �� ���ϰ� ���� �߿� ��ȣ �񱳸� �ϰ� ����! 
		System.out.println(student.equals(new Student(1, "������")));
		
//		�ݵ�� hashcode�� ������ ����� ��. ������ ������ ������ �ʵ尡 2�� �����Ǹ鼭 size�� 2���� ��µ�.
		HashSet<Student> studentSet = new HashSet<Student>();
		
//		������ �л��ӿ��� �ұ��ϰ� hashcode�� �ٸ�
//		hashcode�� �������� �ڿ��� �ʵ��� ���� ���Ƽ� �ߺ��� ���ŵ� 
//		student�� new Student(1, "������")�� hashcode�� ���ϸ� �� �� 1�� ���� (������ �߱� ������)
		studentSet.add(student);
		studentSet.add(new Student(1, "������"));

		
		System.out.println(studentSet.size());
		
//		�Ѹ���� �ʱ�ȭ �Ѱ�!!
//		�ڵ� ����Ʈ���� �ߺ����� �����϶�� ���� ������, �ؿ�ó�� hashset�� ����ϸ� ��!!
//		�ؿ� Arrays�� �迭�� ��ü�� ����� ������. �迭�� �ᱹ�� Ŭ������ �۾��� �ϴ� ����
		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(2, 4, 7, 5, 5, 5, 5));
		
//		hashSet�����ڿ� datas �ֱ� --> �ߺ��� ������
		HashSet<Integer> dataSet = new HashSet<Integer>(datas); 
		datas = new ArrayList<Integer>(dataSet); // �ٽ� arraylist�� �� --> ������ ����
		System.out.println(datas);
		
		HashSet<String> fruitSet = new HashSet<String>();
		fruitSet.add("���");
		fruitSet.add("��");
		fruitSet.add("�ڵ�");
		
//		�ƹ��� �����Ƹ� �߰��ص� fruitSet�� ����ϸ� �����ư� �ϳ��� ���ԵǾ� ����.
//		toString�� �����Ǿ� ����
		fruitSet.add("������"); 
		fruitSet.add("������");

//
		System.out.println(fruitSet);
//		
		System.out.println(fruitSet.contains("������"));
	}

}
