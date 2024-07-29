package apiTest;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
//		시간을 기준점으로!!
		Random random = new Random();
//		nextInt라는 거 안에 있는 수의 나머지가 나오게 됨
//		즉, 이 경우에는 0~2까지 숫자 중에서 랜덤으로 숫자가 나옴
		System.out.println(random.nextInt(3)); 
	}

}
