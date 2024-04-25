import java.util.*;
class reverseEx{
    public static void main(String[] args) {
        String word = "veeran Ramya";
        char[] input = word.toCharArray();
       String result = " ";
       for(int i = input.length - 1; i >= 0 ; i--){
           result += input[i];
       }
        System.out.print(result);
    }
}