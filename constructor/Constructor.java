package constructor;

//class dog{
//	String name = "Puppy";
//	String color = "Brown";
//	void bark() {
//		System.out.println("Dog is baring.");
//	}
//}
//
//
//public class Constructor {
//	public static void main(String[] args) {
//		dog d = new dog();
//		System.out.println(d.name);
//		System.out.println(d.color);
//		d.bark();
//	}
//}

class Dog {
	Dog() {

	}

	String name = "Puppy";
	String color = "Brown";

	void bark() {
		System.out.println("Dog is baring.");
	}
}

public class Constructor{
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.name);
		System.out.println(d.color);
		d.bark();
	}
}