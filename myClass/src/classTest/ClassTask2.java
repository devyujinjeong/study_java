package classTest;

class Student{
//	변수 선언하기 
	static int sequence; //번호는 고정되어 있으므로 static으로 선언하기
	int studentId;
	int korScore, engScore, mathScore, total;
	double average;
	
//	초기화 블록: 어떤 생성자를 호출하더라도 이것부터 실행되고 생성자가 호출됨 
	{sequence++;}
	
//	생성자 선언하기
	public Student(int korScore, int engScore, int mathScore) {
		this.studentId = sequence;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.total=korScore+engScore+mathScore;
		this.average=total/3.0;
	}
}
	
public class ClassTask2 {
	public static void main(String[] args) {
//		객체화 하기!!
		Student student=new Student(20, 30, 40);
		Student student2=new Student(50, 60, 70);
		
		System.out.println(student.studentId);
		System.out.println(student2.studentId);
		System.out.println("총점"+student.total+"점");
		System.out.println("평균"+student.average+"점");

	}
}
