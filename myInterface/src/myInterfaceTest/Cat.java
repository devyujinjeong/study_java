package myInterfaceTest;

public class Cat extends AnimalAdapter {
//	근데 이 경우에는 필요없는 것들은 굳이 구현하고 싶지 않아서 adapter를 활용함
	@Override
	public void poop() {
		System.out.println("난 고양이 ㅎ");
	}
}

