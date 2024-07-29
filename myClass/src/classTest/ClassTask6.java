package classTest;

class Board{
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
//	1. this를 이용해서 중복을 제거하는 느낌!!
//	2. this.title은 자신이 가지고 있는 title필드라는 뜻
//	생성자와 메소드의 매개 변수 이름이 필드와 동일한 경우, 인스턴트 멤버인 피드임을 명시하고자 할 때 사용
	Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
	
	Board(String title, String content) {
		this(title,content,"로그인한 회원아이디","현재 컴퓨터 날짜",0);
	}
	
	
	Board(String title, String content, String writer) {
		this(title,content,writer,"현재 컴퓨터 날짜",0);
	}
	
	Board(String title, String content, String writer, String date) {
		this(title,content,writer,date,0);
	}	
}

public class ClassTask6 {
	public static void main(String[] args) {
		Board board = new Board("대학교", "학과");
		System.out.println(board.content);
		System.out.println(board.date);
		
	
	}
}
