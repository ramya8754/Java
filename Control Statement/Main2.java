public class Main2 {
    public static void main(String[] args) {
        int year = 2025;

        if(year % 4 ==0){
            if(year % 100 !=0){
                if(year % 400 == 0){
                   System.out.println("year is a leap year true");
                }
                System.out.println("year is a leap year ");
            }

        }
        else{
            System.out.println("year is a Not leap year ");
        }
    }
}
