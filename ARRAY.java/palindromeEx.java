import java.util.*;
public class palindromeEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String g = sc.nextLine();
         g = g +" " ; String wd =" " , rev = " ";
        for(int i = 0;i < g.length();i++){
            char ch = g.charAt(i);
            if(ch != ' '){
                wd = wd + ch;
                rev = ch + rev;
            }
            else{
                if(wd.equals(rev) == true)
                    System.out.println("the given string is palindrome "+ wd);
                
                else
                    System.out.println("the given string is Not palindrome "+ wd);
                     wd = " " ; rev = " ";
                
            }
        }
    }
}