package string;

public class String14 {
	public static void main(String[] args) {
		String str = "Java is a programming laguage.";
		
		String[] str1 = str.split(" ");
		
		for(String s : str1) {
			System.out.println(s);
		}
	}
}