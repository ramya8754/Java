public class Main35 {
    public static void main(String[] args) {
        int num = 16; // Example number

        if (isPerfectSquare(num)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }
    }

    public static boolean isPerfectSquare(int num) {
        double squareRoot = Math.sqrt(num);
        return squareRoot == Math.floor(squareRoot);
    }
}
