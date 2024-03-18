// import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in) ;
        String name = "ramar";
        boolean isPalindrome = true;
        for(int i = 0; i < name.length() ; i++){
            if(name.charAt(i) != name.charAt(name.length()- i - 1)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println(name + " is a palindrome");
        }
        else{
            System.out.println(name + " is not a palindrome");
        }

    } 
}
