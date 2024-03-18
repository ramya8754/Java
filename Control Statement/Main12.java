public class Main12 {
    public static void main(String[] args) {
        int month = 7;
        int year = 2024;
        int dayInMonth;
        switch (month) {
            case 1: // january
            case 3: // March
            case 5: // March
            case 7: // March
            case 8: // March
            case 10: // March
            case 12: // March
            dayInMonth = 31;
                break;
            case 4: //April
            case 6: //April
            case 9: //April
            case 11: //April
            dayInMonth = 31;
            break;
            case 2 : //February
            if((year % 400 == 0) || ((year % 4 != 0) && (year % 100 !=0))){
            dayInMonth = 29;
            }
            else{
                dayInMonth = 28;
            }
            default:
               dayInMonth = -1;
               break; 
        }
        if(dayInMonth == -1){
            System.out.println("Invalid month number");
        }
        else{
            System.out.println("Number of days in month " + month + " is " + dayInMonth);
        }
    }
}
