public class Main20 {
    public static void main(String[] args) {
       
        int tamil = 75;
        int English = 85;
        int Computer = 78;
        int Subject = tamil + English + Computer;
         int marks = Subject / 3;
        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else if (marks >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}
