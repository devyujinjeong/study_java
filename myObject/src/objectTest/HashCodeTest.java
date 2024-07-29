package objectTest;

import java.util.Random;

public class HashCodeTest {
	public static void main(String[] args) {
		Random random = new Random();
//		이건 jdk 버전이 같으면 다 같은 값으로 나오게 됨.
		System.out.println(random);
	}

}
