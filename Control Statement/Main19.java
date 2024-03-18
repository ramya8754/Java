public class Main19 {
    public static void main(String[] args) {
        int x = 10, y = 26, z = 35; 
        int largest;

        if (x > y) {
            if (x > z) {
                largest = x;
            } else {
                largest = z;
            }
        } else {
            if (y > z) {
                largest = y;
            } else {
                largest = z;
            }
        }

        System.out.println("Largest number is: " + largest);
    }
}
