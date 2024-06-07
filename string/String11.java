// String Builder


package string;

public class String11 {
	public static void main(String[] args) {
		String str = "Java";
		StringBuilder sb = new StringBuilder("Java");
		sb.append("Java is a programming language");
		System.out.println(str.length() + " " + sb.capacity());
		sb.insert(10, 'b');
		System.out.println(sb);
		System.out.println(sb.substring(5,10));
		
	}
}
