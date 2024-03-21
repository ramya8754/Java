import java.util.Scanner;

class pattern2 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(" Enter the Number :  ");  
    int num = Integer.parseInt(scanner.nextLine());
      
    // Number pattern 1
     for(int i = 1; i <= num ; i++){
        for(int j = 1 ; j <= i ; j++){
            System.out.print(j + " ");
        }
        System.out.println(" ");
     }
     System.out.println();

     // Number pattern 2
     for(int i = num; i >= 1 ; i--){
        for(int j = 1 ; j <= i ; j++){
            System.out.print(j + " ");
        }
        System.out.println(" ");
     }
     System.out.println();

     //Star pattern 1
     for(int i = 1; i <= num ; i++){
        for(int j = 1 ; j <= i ; j++){
            System.out.print("* ");
        }
        System.out.println(" ");
     }
     System.out.println();

     // Star pattern 2
     for(int i = num; i >= 1 ; i--){
        for(int j = 1 ; j <= i ; j++){
            System.out.print("* ");
        }
        System.out.println(" ");
     }
     System.out.println();

    // Character pattern 1
     char starChar = 'A';
     for(int i = 1; i <= num ; i++){
        char star = starChar;
        for(int j = 1 ; j <= i ; j++){
            System.out.print(star + " ");
            star++;
        }
        System.out.println(" ");
     }
     System.out.println();

     // Character pattern 2
     
     char starChar1 = 'A';
     for(int i = num; i >= 0 ; i--){
        char star1 = starChar1;
        for(int j = 1 ; j <= i ; j++){
            System.out.print(star1 + " ");
            star1++;
        }
        System.out.println(" ");
     }
   }
    
}