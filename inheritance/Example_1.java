package inheritance;

// Inheriting only Properties

class Animal{
	int legs = 4;
	int eyes = 2;
	
	void sleep() {
		System.out.println("Animal is sleeping.");
	}
	
	void eat() {
		System.out.println("Animal is eating.");
	}
	
	void walk() {
		System.out.println("Animal is walking.");
	}
}

class Cow extends Animal{
	void sleep() {
		System.out.println("Cow is sleeping.");
	}
	
	void eat() {
		System.out.println("Cow is eating.");
	}
	
	void walk() {
		System.out.println("Cow is walking.");
	}
	
	void run() {
		System.out.println("Cow is running.");
	}
}

class Tiger extends Animal{
	void sleep() {
		System.out.println("Tiger is sleeping.");
	}
	
	void eat() {
		System.out.println("Tiger is eating.");
	}
	
	void walk() {
		System.out.println("Tiger is walking.");
	}
	
	void run() {
		System.out.println("Tiger is running.");
	}
}

public class Example_1 {
	public static void main(String[] args) {
		Animal a = new Animal();
		
		System.out.println(a.eyes);
		System.out.println(a.legs);
		a.eat();
		a.sleep();
		a.walk();
		
		Tiger t = new Tiger();
		
		System.out.println(t.eyes);
		System.out.println(t.legs);
		t.eat();
		t.walk();
		t.sleep();
		t.run();
		
		Cow c = new Cow();
		
		System.out.println(c.eyes);
		System.out.println(c.legs);
		c.eat();
		c.sleep();
		c.walk();
		c.run();
	}
}
