public class Main7 {
    public static void main(String[] args) {
        int num1 = 35 ;
        int num2 = 45;
        int num3 = 78;
        if(num1 >= num2 && num1 >=num3){
            System.out.println(num1 + " the largest Number ");
        }
        else if( num2 >= num1 && num2 >=num3){
            System.out.println(num2 + " the largest Number ");
        }
        else{
            System.out.println(num3 + " the largest Number ");
        }
    }
}
