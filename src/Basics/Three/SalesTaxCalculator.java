package Basics.Three;

import java.util.Scanner;

public class SalesTaxCalculator {

    public static void main(String[] args) {
        final double SALES_TAX_RATE = 0.07;
        Scanner in = new Scanner(System.in);
        double price,actual_price,salesTax;
        double totalPrice = 0.0, totalActualPrice = 0.0,
                totalSalesTax = 0.0;
        System.out.print("Enter the full price of the product( \"-1\" to exit):");
        price = in.nextDouble();
        while (price != -1){
            //Calculating
            actual_price = price/(1+SALES_TAX_RATE);
            salesTax = price-actual_price;
            //Summing
            totalPrice+=price;
            totalActualPrice+=actual_price;
            totalSalesTax+=salesTax;
            //Printing
            System.out.printf("Actual price: $%.0f, Sales tax: $%.0f %n",actual_price,salesTax);
            //Taking new input
            System.out.println("Enter the full price of the product( \"-1\" to exit):");
            price = in.nextDouble();
        }
        System.out.printf("Total Price: $%.2f%n",totalPrice);
        System.out.printf("Total Actual Price: $%.2f%n",totalActualPrice);
        System.out.printf("Total Sales Tax: $%.2f%n",totalSalesTax);
    }
}
