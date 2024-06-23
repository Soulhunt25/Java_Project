package inheritance;


interface Parent_1{
	default void eat() {
		System.out.println("Eating");
	}
}

interface Parent_2{
	void sleep();
}

class Child_1 implements Parent_2{

	@Override
	public  void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Child 1 is Sleeping");
		
	}
	
}

public class Abstraction_example {
	public static void main(String[] args) {
		Child_1 c = new Child_1();
		c.sleep();
	}
}

