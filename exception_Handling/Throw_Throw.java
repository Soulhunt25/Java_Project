package exception_Handling;

public class Throw_Throw {
	public static void main(String[] args) {
		try {
			checkAge(15);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void checkAge(int n) {
		if(n < 18) {
			throw new IllegalArgumentException("Your age is below 18");
		}
		else {
			System.out.println("Age is valid");
		}
	}
}
