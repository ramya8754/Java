public class Main18 {
    public static void main(String[] args) {
        double height = 2.67;//Height in meters
        double weight = 65.87;// Weight in meters
        double bmi = weight /(height * height);
        String bmiCategory ;
        if(bmi < 18.5){
            bmiCategory = "Underweight";
        }
        else if(bmi < 25){
            bmiCategory = "NormalWeight";
        }
        else if(bmi < 30){
            bmiCategory = "OverWeight";
        }
        else{
            bmiCategory = "Obesity";
        }
        System.out.println("BMI : "+ String.format("%.2f ", bmi));
        System.out.println("BMI Category : " + bmiCategory);
    }
}
