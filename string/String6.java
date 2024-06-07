package string;
import java.util.Scanner;

public class String6 {
    static boolean isDigit(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch >= '0' && ch <= '9')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(isDigit(str) ? "String contains only digits" : "String does not contain only digits");

        sc.close();
    }
}
