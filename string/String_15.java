package string;

import java.util.Scanner;

public class String_15 {
    
    static String reverseEachWord(String str) {
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(" ");
        for (String word : arr) {
            char[] ch = word.toCharArray();
            int i = 0;
            int j = ch.length - 1;
            while (i < j) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
            sb.append(new String(ch));
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        System.out.println("Reversed words: " + reverseEachWord(str));
        
        sc.close();
    }
}
