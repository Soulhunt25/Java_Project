package constructor;

class Add{
	Add(){
//		this(5,6);
		System.out.println("Constructor called");
	}

	Add(int a, int b) {
		this(5,6,7);
//		this();
		System.out.println(a+b);
	}
	Add(int a, int b, int c){
//		this(5,6);
		System.out.println(a+b+c);
	}
}

public class Constructor_chaining {
	public static void main(String[] args) {
		Add a = new Add();
//		Add a1 = new Add(5,6,7);
	}
}
