package inheritance;

interface Animal_1{
	void eat(); // by default abstract class
	int n = 10; // by default final(constant) & static(Accessible anywhere in the program)
}

interface Bird{
	default void fly() {
		System.out.println("Pigs can fly");
	}
}

public class Multiple_inheritance implements Animal_1,Bird {
	public static void main(String[] args) {
		Multiple_inheritance t = new Multiple_inheritance();
		t.eat();
		t.fly();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}
