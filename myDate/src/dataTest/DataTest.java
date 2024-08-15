package dataTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DataTest {
	public static void main(String[] args) {
//		문자열을 Date로 변경해야 할 때: 전달받은 문자열에 날짜 연산을 해야 할 때 
//		Date를 문자열로 변경해야 할 때: 화면에 뿌려야 할 때

//		Date : 날짜와 시간 정보를 저장하는 클래스 (특정 시점)
//		Calendar : 달력을 표현한 클래스로, 운영체제의 날짜와 시간을 얻을 때 사용

//		1. Date : 영문으로 된 날짜를 리턴
		Date date = new Date();
		String strNow = date.toString();
		System.out.println(strNow);

//      ▶ Date -> String   
//		밑의 코드를 실행하면 Date, setYear, setMonth에 줄이 그어져 있다.
//		이러한 현상을 "Deprecated"라고 하는데, 해당 메소드가 더 이상 사용되지 않기 때문에 나타나는 현상이다.
//		더 자세히 말하면 사용은 가능하지만, 권장되지 않는 메소드인 것이다.
//		Date date = new Date(0, 11, 4);
//		date.setYear(0); // 년도는 default값은 1900임
//		date.setMonth(11); // 0부터 시작
//		System.out.println(date);

//		2. SimpleDateFormat : 원하는 날짜 형식의 문자열을 얻고 싶은 경우 (영어가 아닌 한국어로 표현하고 싶은 경우)
//		▶ Date -> String 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh시 mm분 ss초");
		String dateNow = simpleDateFormat.format(date);
		System.out.println(dateNow);

//      ▶ String -> Date   
		try {
			System.out.println(simpleDateFormat.parse("1900/12/04 12시 30분 20초"));

		} catch (ParseException e) {
			System.out.println("형식 오류");
		}

//		3. LocalDate
//		▶ LocalDate -> String
		LocalDate localDate = LocalDate.of(1945, 8, 15);
		System.out.println(localDate);

//      ▶ String -> LocalDate
//		여기에서는 LocalDate 타입인거임.
//		참고로 localdate 형식은 2020-12-04 이런식임
		System.out.println(LocalDate.parse("2020년12월04일", DateTimeFormatter.ofPattern("yyyy년MM월dd일")));

//      LocalDate안에 애초에 format이 있음. 
//		그래서 밑에서 처럼 calendar 따로, simpleDateFormat 따로 선언할 필요가 없음
//		원하는 형식으로 사용하기
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일")));

//      4. Calendar
// 		추상클래스이므로 new 연산자를 사용해서 인스턴스 생성 불가. 이러한 패턴을 싱글톤 패턴이라고 함
//		전체 프로그램에서 단 하나의 객체만 만들도록 보장해야 하는 경우에 사용함
//		이 세상에 달력은 1개이기 때문에 이것만 사용하게 하는 것임.
//		getInstance()가 외부에서 객체를 얻는 유일한 방법

		Calendar calendar = Calendar.getInstance();
		calendar.set(1945, 8, 15);
		System.out.println(calendar);
		System.out.println(simpleDateFormat.format(calendar.getTime()));

	}
}
