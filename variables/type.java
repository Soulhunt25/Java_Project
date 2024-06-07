package variables;

class Student{
	static String college = "OIST"; // Static variable
	String name = "Pranjal"; // Instance variable
	void disp() {
		System.out.println("My name is " + name);
		System.out.println("The collage name is " + college);
	}
}


public class type {
	public static void main(String[] args) {
		Student ss = new Student();
		int marks = 90; // Local variable
		System.out.println(marks);
		ss.disp();
	}
}
