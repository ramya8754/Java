public class Main38 {
    public static void main(String[] args) {
        int n = 5; // Example number

        long factorial = calculateFactorial(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
    }

    public static long calculateFactorial(int n) {
        return n == 0 ? 1 : n * calculateFactorial(n - 1);
    }
}
