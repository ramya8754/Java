import java.util.*;
public class palindromeEx{
public static void main(String[] args){
 String input = "He did a good Deed";
 List<String> words = Array.asList(input.split(" "));
List<String> polindrome = new ArrayList<>();
for(String words : word){
  if(!isPalindrome(words)){
    nonPalindrome.add(word);
}
}
String result = String.join(" " +nonPalindrome);
System.out.print(result);
private static boolean isPalindrome(String words ){
int i = 0;
int j = words.length - 1;
while( i < j){
 if(words.chatAt(i) != words.charAt(j)){
 return false;
}
}
i++;
j--;
}
return true;
}
}