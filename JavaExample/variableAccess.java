class Student{
    String name ;
    int age ;
}
public class variableAccess {
   public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Ramya";
    s1.age = 21;
    System.out.println("the Student name is : "+ s1.name );
    System.out.println("The Student age :" + s1.age);
   }
}