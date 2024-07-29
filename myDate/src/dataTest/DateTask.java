package dataTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTask {
	public static void main(String[] args) {
//		Date now = new Date();
//		date객체의 toString() 메소드는 영문으로 된 날짜를 리턴함.
//		String strNow1 = now.toString();
//		System.out.println(strNow1);
	
//		SimpleDateFormat클래스의 format() 메소드를 호출해 원하는 형식의 날짜 정보를 얻을 수 있음.
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
//		String strNow2 = sdf.format(now);
//		System.out.println(strNow2);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		Calendar calendar = Calendar.getInstance();
	    calendar.set(1900, 11, 4);
	    System.out.println(calendar);
	    System.out.println(simpleDateFormat.format(calendar.getTime()));
		
	}
}
