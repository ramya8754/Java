import java.util.*;
import java.util.Scanner;
class co{
    String name;
    int age;
// user input scanner class
void read(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your Name : ");
    name = scanner.nextLine();
    System.out.print("Enter your Age : ");
    age = Integer.parseInt(scanner.nextLine());
}
// output Statement
void print(){
    System.out.println("the name is : " + name);
    System.out.println("the age is : " + age);
}
}
public class ObjectCreate {
  public static void main(String[] args) {
    // Create a Scanner class object
    co obj = new co();
    obj.read();
    obj.print();
  }
}