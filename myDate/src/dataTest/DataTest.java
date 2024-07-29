package dataTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DataTest {
	public static void main(String[] args) {
//		문자열을 Date로 변경해야 할 때: 전달받은 문자열에 날짜 연산을 해야 할 때 
//		Date를 문자열로 변경해야 할 때: 화면에 뿌려야 할 때 
		
//		Date : 날짜와 시간 정보를 저장하는 클래스
//		Calendar : 운영체제의 날짜와 시간을 얻을 때 사용
		
//      > LocalDate
//      ▶ String -> LocalDate
//		여기에서는 LocalDate 타입인거임.
//		참고로 localdate 형식은 2020-12-04 이런식임
		System.out.println(LocalDate.parse("2020년12월04일", DateTimeFormatter.ofPattern("yyyy년MM월dd일")));

//      ▶ LocalDate -> String
//      LocalDate localDate = LocalDate.of(2020, 12, 04);
//      System.out.println(localDate);
//      LocalDate안에 애초에 format이 있음. 
//		그래서 밑에서 처럼 calendar 따로, simpleDateFormat 따로 선언할 필요가 없음
//		원하는 형식으로 사용하기
//      System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));
      
//      > Calendar
//		원하는 날짜 형식의 문자열을 얻고 싶은경우에 simpledateformat 사용하기
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH시 mm분 ss초");
//      
//      ▶ String -> Date   
//      try {
//         System.out.println(simpleDateFormat.parse("1900/12/04 12시 30분 20초"));
//      } catch (ParseException e) {
//         System.out.println("형식 오류");
//      }
      
//      싱글톤 패턴
//		전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우. 단 하나만 생성되는 객체라고 해서 싱글톤
//		calendar은 new가 안보이는데, 이것은 생성자가 사용이 안되는 것임.
//		이 세상에 달력은 1개이기 때문에 이것만 사용하게 하는 것임.
//		getInstance()가 외부에서 객체를 얻는 유일한 방법
//		Calendar calendar = Calendar.getInstance();
//      calendar.set(1900, 11, 4);
//      System.out.println(calendar);
      
//      ▶ Date -> String   
//      System.out.println(simpleDateFormat.format(calendar.getTime()));
      
//		Date date = new Date(0, 11, 4);
//      date.setYear(0); //년도는 default값은 1900임
//      date.setMonth(11); //0부터 시작
//      System.out.println(date);
//      System.out.println(simpleDateFormat.format(date));
   }
}
