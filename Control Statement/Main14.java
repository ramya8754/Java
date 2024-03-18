public class Main14 {
    public static void main(String[] args) {
        int quantity = 1;
        double priceEach = 13.0;
        double salesTaxRate = 0.08;
        
        double totalCost = quantity * priceEach;
        double salesTax = totalCost * salesTaxRate;
        double totalCostWithTax = totalCost + salesTax;

        if(totalCostWithTax > 100){
            double discount = totalCostWithTax * 0.1;
            totalCostWithTax = totalCostWithTax - discount;
            System.out.println("Applied 1 10% discount" + totalCostWithTax);
        }
        else{
            System.out.println("Total cost with $" + totalCostWithTax);
        }
    }
}
