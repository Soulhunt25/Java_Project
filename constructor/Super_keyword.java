package constructor;
/*
class parent {
	String name = "Pranjal";

	void disp() {
		System.out.println(name);
	}
}

class child extends parent{
	void disp() {
		super.disp();
	}
}

public class Super_keyword {
	public static void main(String[] args) {
		child c = new child();
		c.disp();
	}
}
*/

//////////////////////////////////////////////

class Parent {
	String name;
	long balance;

	Parent(String name, long balance) {
		this.name = name;
		this.balance = balance;
	}
}

class Child extends Parent {
	int pin;

	Child(String name, long balance, int pin) {
		super(name, balance);
		this.pin = pin;
	}
	
	void disp() {
		System.out.println(super.name + " " + super.balance + " " + pin);
	}
}

public class Super_keyword {
	public static void main(String[] args) {
		Child c = new Child("Pranjal", 10210, 1234);
		c.disp();
	}
}