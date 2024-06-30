package exception_Handling;

public class Examlpe1 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c = a/b;
		}
		
		catch(Exception e){
			System.out.println("Try to divide by Zero");
		}
		
		int x = 10;
		int y = 0;
		System.out.println(x*y);
	}
}
