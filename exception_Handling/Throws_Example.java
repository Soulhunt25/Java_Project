package exception_Handling;

public class Throws_Example {
	public static void main(String[] args) {
		try {
			div(10,0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int div(int a, int b) throws Exception {
		if(b == 0) {
			throw new ArithmeticException("Tried dividing by zero");
		}
		else {
			int res = a / b;
			return res;
		}
	}
}

// Multiple Exceptions 
// Throws handles multiple exception