public class Main37 {
    public static void main(String[] args) {
        char ch = 'a';
        if(isVowel(ch)){
            System.out.println(ch + " is a Vowels .");
        }
        else{
            System.out.println(ch + " is not a Vowels .");
        }
    }
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'; 
    }
}
