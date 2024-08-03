package lambdaTask1;

@FunctionalInterface
public interface PrintName {
	// 성과 이름 사용자에게 받기
	public String getFullName(String lastName, String firstName);
}

