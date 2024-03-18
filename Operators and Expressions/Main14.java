public class Main14 {
    public static void main(String[] args) {
        double side = 5.0;
        double perimeter = calculatePerimeter(side);
        System.out.println("The perimeter of the square is: " + perimeter);
    }

    public static double calculatePerimeter(double side) {
        return 4 * side;
    }
}
