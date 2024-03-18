public class Main28 {
    public static void main(String[] args) {
        // Example calculation with radius=3 and height=5
        // formula  Cylinder = πr2h 
        double radius = 3;
        double height = 5;
        double volume = cylinderVolume(radius, height);
        System.out.printf("The volume of the cylinder is: %.2f%n", volume);
    }

    public static double cylinderVolume(double radius, double height) {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }
}
