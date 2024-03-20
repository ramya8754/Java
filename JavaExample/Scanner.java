import java.util.Scanner;

public class scanner {
   public static void main(String[] args) {
     Scanner obj = new Scanner(System.in);
     String name = obj.nextLine();
     int age = Integer.parseInt(obj.nextLine());
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     
   }
}
