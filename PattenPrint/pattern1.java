import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        // Pattern 1
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(i + "" +j + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 2
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
   
        // Pattern 3
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 4
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i == 1 || i == num || j == 1 || j == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 5
        for (int i = 0; i < num; i++) {
            System.out.print("*");

            for (int j = 0; j <= num; j++) {
                if (j == num || (i == j && i <= num / 2) || (i + j == num - 1 && i <= num / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println();


        // 6 pattern  
        int mid = num / 2;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == 0 || i == num-1  || j == mid) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
