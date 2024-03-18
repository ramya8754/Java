public class Main32 {
    public static void main(String[] args) {
        int quantity = 5; // Example quantity
        double priceEach = 10.0; // Example price per item
        double salesTaxRate = 0.08; // Sales tax rate of 8%

        double totalCost = calculateTotalCost(quantity, priceEach, salesTaxRate);
        System.out.printf("The total cost is: $%.2f%n", totalCost);
    }

    public static double calculateTotalCost(int quantity, double priceEach, double salesTaxRate) {
        
        // Total Cost = Quantity × PriceEach × (1 + SalesTax Rate)
        
        double totalCost = quantity * priceEach * (1 + salesTaxRate);
        return totalCost;
    }
}
