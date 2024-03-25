import java.util.*;

public class AlpaWordsEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String");
        int vowel = 0, cons = 0, ws = 0;
        String x = scanner.nextLine();
        x = x.toLowerCase();
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    cons++;
                }
            } else if (Character.isWhitespace(ch)) {
                ws++;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + cons);
        System.out.println("Whitespace: " + ws);
    }
}
