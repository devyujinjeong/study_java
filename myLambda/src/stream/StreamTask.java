package stream;
// day10마지막~ day11 첫부분

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
//	    1~10까지 ArrayList에 담고 역순으로 출력
		//이건 rangeClosed(1~10까지)를 사용해서 데이터를 담는 것 
//	    ArrayList<Integer> datas = new ArrayList<Integer>();
//	    IntStream.rangeClosed(1, 10).forEach(datas::add);
//	    datas.forEach(data -> System.out.println(11 - data));
		
		//이거는 직접 arraylist에 내가 원하는 수를 추가 한것
//	    ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//	    datas.forEach(data -> System.out.println(11 - data));

//	    1~10까지 ArrayList에 담고 2의 배수만 출력
//	    ※ 1~10까지 중 2의 배수만 ArrayList에 담기, map() 사용
//	    ArrayList<Integer> datas = new ArrayList<Integer>();
//	    IntStream.rangeClosed(1, 5).map(data -> data * 2).forEach(datas::add);
//	    datas.forEach(System.out::println);

//	    ArrayList<Integer> datas = new ArrayList<Integer>();
//	    IntStream.rangeClosed(1, 10).forEach(datas::add);
//	    datas.forEach(data -> {
//	       if(data % 2 == 0) {
//	          System.out.println(data);
//	       }
//	    });
		
//	    ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//	    datas.forEach(data -> {
//	       if(data % 2 == 0) {
//	          System.out.println(data);   
//	       }
//	    });

//	    ABCDEF를 BCDEFG로 변경
//		"ABCDEF".chars().map(c->c+1).forEach(c->System.out.println((char)c));

//	    ABCD 중에서 B를 제외하고 출력
//		B의 아스키 코드는 66이므로, 66만 제외하고 나머지를 출력하며 됨
//	    "ABCD".chars().filter(c -> c != 66).forEach(c -> System.out.println((char)c));

//	    성과 이름을 ArrayList에 담은 뒤 이름 전체 출력
//	    ArrayList<String> datas = new ArrayList<String>(Arrays.asList("정", "유진"));
//		여기에서 datas는 arraylist이기 때문에 stream으로 바꿔줘야 함.
//	    String name = datas.stream().collect(Collectors.joining());
//	    System.out.println(name);

// 		과제
//	    10~1까지 ArrayList에 담고 출력 '
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
		
//		정렬하는거 연습해보기 (정렬해서 프린트 하면 숫자가 어떤식으로 나오게 되나?)
//		ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(1,5,4,3,10));
//		datas.stream().sorted()	

//	    1~10까지 ArrayList에 담고 출력 
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach(datas::add);
//		datas.forEach(System.out::println);

//	    ABCDEF를 각 문자별로 출력 
//		"ABCDEF".chars().forEach(c->System.out.println((char)c));

//	    1~100까지 중 홀수만 ArrayList에 담고 출력 
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter(data->data%2==1).forEach(datas::add);
//		datas.forEach(System.out::println);

//	    A~F까지 중 D제외하고 ArrayList에 담고 출력
//		ArrayList<Character> datas = new ArrayList<Character>();
//		IntStream.rangeClosed(65, 70).filter(data -> data != 68).forEach(data -> datas.add((char)data));
//		System.out.println(datas);

//		IntStream.rangeClosed(65, 69).map(number -> number > 67 ? number + 1 : number).forEach(data -> datas.add((char)data));
//		IntStream.rangeClosed(65, 69).map(streamTask::exclude_D).forEach(data -> datas.add((char)data));

//	    5개의 문자열을 모두 소문자로 변경("Black", "WHITE", "reD", "yeLLow", "PINk"), toLowerCase() 사용
//		각각의 문자열을 모두 arraylist에 넣고 꺼내면서 출력시킴!! 
		ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
//      1~100까지 중 짝수만 ArrayList에 담고 출력
//		ArrayList<Integer> datas = new ArrayList<Integer>();
//		changeToEven 메소드의 소속이 어디인지를 알려주고 사용하기
//		IntStream.rangeClosed(1, 50).map(streamTask::changeToEven).forEach(datas::add);
//		System.out.println(datas);
		
//      한글을 정수로 변경, 일공이사 -> 1024
		String hangle = "공일이삼사오육칠팔구";
		String input = "일공이사";
		input.chars().map(c -> hangle.indexOf(c)).forEach(System.out::print);
		
//      정수를 한글로 변경, 1024 -> 일공이사
//		String hangle = "공일이삼사오육칠팔구";
//		String input = "1024";
//		
//		input.chars().map(i -> i - 48).forEach(i -> System.out.print(hangle.charAt(i)));
		
	}
	
	public int exclude_D(int number) {
		return number > 67 ? number + 1 : number;
	}
	
	public boolean checkOdd(int number) {
		return number % 2 == 1;
	}
	
	
	public int change(int number) {
		return 10 - number;
	}
	
	public int changeToOdd(int number) {
		return number * 2 - 1;
	}
	
	public int changeToEven(int number) {
		return number * 2;
	}
	
}
