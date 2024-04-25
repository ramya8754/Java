import java.util.*;
class wordReverseEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input : ");
        String word = sc.nextLine();
        String[] wordsArr = word.split(" ");
        List<String> reverse = new ArrayList<>();
        for(int i = wordsArr.length - 1 ; i >= 0 ; i--){
            reverse.add(wordsArr[i]);
        }
        String result = String.join(" ",reverse);
        System.out.print(result);
    }
}