class Student{
    String name;
    int age;
}
public class ObjectCreate2{
    public static void main(String[] args) {
        // Scanner obj = new Scanner(System.in);
       Student s1 = new Student();
       Student s2 = new Student();
       // first obj value 
       s1.name = "Veeran";
       s1.age = 25;
       // second obj value 
       s2.name = "Ramya";
       s2.age = 22;
       //Console output
       System.out.println(s1.name + " " + s1.age);
       System.out.println(s2.name + " " + s2.age);
    }
}