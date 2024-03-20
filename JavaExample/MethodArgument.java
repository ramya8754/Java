class Student{
    String name;
    int age ;
// variable name 
void Student1(String n , int a){
    name = n;
    age = a;
}
//Print Statement
void StudentDisplay(){
    System.out.println("The Student name is : " + name);
    System.out.println("The Student age is : " + age);
}
}
public class MethodArgument {
    public static void main(String[] args) {
        //object create
        Student S1 = new Student();
        Student S2 = new Student();
        //variable values access
        S1.Student1("Ramya" , 23);
        S2.Student1("Veeran" , 25);
        //object create display method
        S1.StudentDisplay();
        S2.StudentDisplay();
    }
}