import java.util.Scanner;

class pattern3 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print(" Enter the Number :  ");  
    int num = Integer.parseInt(scanner.nextLine());
    //  int num = 6;
     // 1
       for(int i = 0 ; i <= num ; i++)
       {
        for(int j = 2*(num - i); j >= 0 ; j--)
        {
            System.out.print(" ");
        }
        for(int j = 0; j <= i; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
       }

       System.out.println();


       for(int i = num ; i >= 0 ; i--)
       {
        for(int j = 2*(num - i); j >= 0 ; j--)
        {
            System.out.print(" ");
        }
        for(int j = 0; j <= i; j++)
        {
            System.out.print("* ");
        }
        System.out.println();
       }

       for(int i = 0 ; i <= num ; i++)
       {
        for(int j = 2*(num - i); j >= 0 ; j--)
        {
            System.out.print(" ");
        }
        for(int j = 0; j <= i; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
       }

       System.out.println();

       
       for(int i = num ; i >= 0 ; i--)
       {
        for(int j = 2*(num - i); j >= 0 ; j--)
        {
            System.out.print(" ");
        }
        for(int j = 0; j <= i; j++)
        {
            System.out.print(j+" ");
        }
        System.out.println();
       }

       char starChar = 'A';
       for(int i = 0 ; i <= num ; i++)
       {
        for(int j = 2*(num - i); j >= 0 ; j--)
        {
            System.out.print(" ");
        }
        char star = starChar;
        for(int j = 0; j <= i; j++)
        {
            System.out.print(star+" ");
            star++;
        }
        System.out.println();
       }

       System.out.println();
       
       for(int i = num ; i >= 0 ; i--)
       {
        for(int j = 2*(num - i); j >= 0 ; j--)
        {
            System.out.print(" ");
        }
        char star = starChar;
        for(int j = 0; j <= i; j++)
        {
            System.out.print(star+" ");
            star++;
        }
        System.out.println();
       }


   }
} 
    