import java.util.Scanner;
public class EvenNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // int n = 10;
        System.out.println(n);
        for(int i = 0 ; i <= n ; i++){
            if(i % 2 == 0){
                System.out.println( i + " Is a Even Number");
            }
            // System.out.println(i + );
        }
    }
}