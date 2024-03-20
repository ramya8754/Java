import java.util.Scanner;

public class lergestNumber {
     public static void main(String[] args) {
        // double n1 = 10.5 ,n2 = 24.67 ,n3 =  56.76;
        Scanner scanner = new Scanner(System.in);
        System.out.print( "Number 1 : " );
         int n1 = scanner.nextInt();
         
        System.out.print( "Number 2 : " );   
         int n2 = scanner.nextInt();
         
        System.out.print( "Number 3 : " );
          int n3 = scanner.nextInt();
          
        //   System.out.println("Number 1: " + n1);
        // System.out.println("Number 2: " + n2);
        // System.out.println("Number 3: " + n3);

         
        if(n1 >= n2 && n1 >= n3 ){
            System.out.println( n1 + " is a largest number");
        }
        else if(n2 >= n1 && n2 >= n3 ){
            System.out.println( n2 + " is a largest number");
        }
        System.out.println( n3 + " is a largest number");
     }
}