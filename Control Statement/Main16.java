public class Main16 {
   public static void main(String[] args) {
    double totalAmount = 500;
    double discountPercentage;
    if(totalAmount >=500){
        discountPercentage = 20.0;
    }
    else if(totalAmount >= 200){
        discountPercentage = 10.0;
    }
    else{
        discountPercentage = 0.0;
    }
    double discountAmount = (discountPercentage / 100)* totalAmount;
     double discountPrice = totalAmount - discountAmount;
     
     System.out.println("Totel Amount : $" + totalAmount);
     System.out.println("Discount percentage : $"+ discountPercentage);
     System.out.println("Discount Price : $" + discountPrice);   
   } 
}
