public class Main13 {
    public static void main(String[] args) {
        int shapeNumber = 5;
        String shapeName ;
        switch (shapeNumber) {
            case 1:
                shapeName = "Circle" ;
                break;
            case 2:
                shapeName = "Square";
                break;
            case 3:
                shapeName = "Triangle";
                break;
        
            default:
                shapeName = "Unknown";
                break;
        }
        System.out.print("shape With Name " + shapeNumber + " is "+ shapeName);
    }
}
