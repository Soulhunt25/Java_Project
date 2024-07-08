package static_keyword;

public class Demo {
	
//	static {
//		System.out.println("Static Block Executed");
//	}
	
	double div(double x, double y) {
		add(5,8);
		return x/y;
	}
	
	static int x = 2;
	
	static int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
//		System.out.println(Demo.x);
//		System.out.println(add(2,3));
		
		Demo d = new Demo();
		d.div(2, 6);
	}
}
