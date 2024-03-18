public class Main10 {
    public static void main(String[] args) {
    int num = 3;
    String dayOfWeek;
    switch(num){
        case 1: 
            dayOfWeek = "Monday";
            break;
        case 2: 
            dayOfWeek = "Tuesday";
            break;
        case 3: 
            dayOfWeek = "Wednesday";
            break; 
         case 4: 
            dayOfWeek = "Thursday";
            break;    
        case 5: 
            dayOfWeek = "Friday";
            break;  
        case 6: 
            dayOfWeek = "Saturday";
            break;  
        case 7: 
            dayOfWeek = "Sunday";
            break; 
         default : 
             dayOfWeek = "Invalid day number";
             break;    
    }
    System.out.print(dayOfWeek);
    }
}