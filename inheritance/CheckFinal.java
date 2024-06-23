package inheritance;

public class CheckFinal {
	public static void main(String[] args) {	
		int x = 25;
		final int y = 20;
		int z1 = x+y;
		x = 40;
//		y = 30; // cannot change
		int z2 = x-y; 
		System.out.println(z1);
		System.out.println(z2);
	}
}
// final to make a value fix