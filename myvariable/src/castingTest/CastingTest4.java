package castingTest;

public class CastingTest4 {
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("1")+3+9); //이거 전체가 1이 됨 Integer.parseInt("1")
		System.out.println(Double.parseDouble("3.9")+9); //전체가 3.9가 됨 Double.parseDouble("3.9")
		System.out.println(Float.parseFloat("1.89f")+10);
	}
}
