package myInterfaceTest;

public class AnimalTest {
	public static void main(String[] args) {
		Puppy puppy = new Puppy();
		Cat cat = new Cat();
		
		puppy.bang();
		puppy.waitNow();
		puppy.showHand();
		puppy.poop();
		puppy.sitDown();
		
		cat.poop();
		cat.bang();
	}
}
