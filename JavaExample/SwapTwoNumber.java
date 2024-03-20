import java.util.Scanner;
public class SwapTwoNumber {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num1 = scanner.nextInt();
    System.out.print("Enter a number : ");
    int num2 = scanner.nextInt();
    System.out.println("Before Swaping");
    System.out.println("num1 = "+ num1);
    System.out.println("num1 = "+ num2);
    int temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("After Swaping");
    System.out.println("num1 = "+ num1);
    System.out.println("num1 = "+ num2);
   }
}