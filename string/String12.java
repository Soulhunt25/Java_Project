package string;

// Reverse a given String

public class String12 {
	public static void main(String[] args) {
		String str = "Pranjal";
		StringBuilder sb = new StringBuilder();
		for(int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb);
	}
}
