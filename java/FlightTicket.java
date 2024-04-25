import java.util.*;
public class FlightTicket{
 public FlightTicket(){
}
   private void MainMenu() {
      System.out.println("1. Book ");
      System.out.println("2. Cancel ");
      System.out.println("3. Print ");
 Scanner scanner = new Scanner(System.in);
 int choice = scanner.nextInt();
  scanner.nextLine();
    switch(choice){
       case 1:
         Book();
         break;
       case 2:
         Cancel();
         break;
       case 3:
         print();
         break;
       default:
         System.out.println("Invalid choice");
}
}
private void  Book(){
System.out.print("book method called");
}
private void Cancel(){
System.out.print("cancel method called");
}
private void  print(){
System.out.print("Print method called");
}

public static void main(String[] args){
   FlightTicket flightTicket = new FlightTicket();
    flightTicket.MainMenu();
}
}