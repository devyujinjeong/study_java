package dataTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DataTest {
	public static void main(String[] args) {
//		���ڿ��� Date�� �����ؾ� �� ��: ���޹��� ���ڿ��� ��¥ ������ �ؾ� �� �� 
//		Date�� ���ڿ��� �����ؾ� �� ��: ȭ�鿡 �ѷ��� �� ��

//		Date : ��¥�� �ð� ������ �����ϴ� Ŭ���� (Ư�� ����)
//		Calendar : �޷��� ǥ���� Ŭ������, �ü���� ��¥�� �ð��� ���� �� ���

//		1. Date : �������� �� ��¥�� ����
		Date date = new Date();
		String strNow = date.toString();
		System.out.println(strNow);

//      �� Date -> String   
//		���� �ڵ带 �����ϸ� Date, setYear, setMonth�� ���� �׾��� �ִ�.
//		�̷��� ������ "Deprecated"��� �ϴµ�, �ش� �޼ҵ尡 �� �̻� ������ �ʱ� ������ ��Ÿ���� �����̴�.
//		�� �ڼ��� ���ϸ� ����� ����������, ������� �ʴ� �޼ҵ��� ���̴�.
//		Date date = new Date(0, 11, 4);
//		date.setYear(0); // �⵵�� default���� 1900��
//		date.setMonth(11); // 0���� ����
//		System.out.println(date);

//		2. SimpleDateFormat : ���ϴ� ��¥ ������ ���ڿ��� ��� ���� ��� (��� �ƴ� �ѱ���� ǥ���ϰ� ���� ���)
//		�� Date -> String 
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh�� mm�� ss��");
		String dateNow = simpleDateFormat.format(date);
		System.out.println(dateNow);

//      �� String -> Date   
		try {
			System.out.println(simpleDateFormat.parse("1900/12/04 12�� 30�� 20��"));

		} catch (ParseException e) {
			System.out.println("���� ����");
		}

//		3. LocalDate
//		�� LocalDate -> String
		LocalDate localDate = LocalDate.of(1945, 8, 15);
		System.out.println(localDate);

//      �� String -> LocalDate
//		���⿡���� LocalDate Ÿ���ΰ���.
//		����� localdate ������ 2020-12-04 �̷�����
		System.out.println(LocalDate.parse("2020��12��04��", DateTimeFormatter.ofPattern("yyyy��MM��dd��")));

//      LocalDate�ȿ� ���ʿ� format�� ����. 
//		�׷��� �ؿ��� ó�� calendar ����, simpleDateFormat ���� ������ �ʿ䰡 ����
//		���ϴ� �������� ����ϱ�
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd��")));

//      4. Calendar
// 		�߻�Ŭ�����̹Ƿ� new �����ڸ� ����ؼ� �ν��Ͻ� ���� �Ұ�. �̷��� ������ �̱��� �����̶�� ��
//		��ü ���α׷����� �� �ϳ��� ��ü�� ���鵵�� �����ؾ� �ϴ� ��쿡 �����
//		�� ���� �޷��� 1���̱� ������ �̰͸� ����ϰ� �ϴ� ����.
//		getInstance()�� �ܺο��� ��ü�� ��� ������ ���

		Calendar calendar = Calendar.getInstance();
		calendar.set(1945, 8, 15);
		System.out.println(calendar);
		System.out.println(simpleDateFormat.format(calendar.getTime()));

	}
}
