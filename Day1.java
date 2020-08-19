package assignments;

import java.util.Scanner;

public class Day1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the price of 1st Product: ");
		float priceOfProduct1 = in.nextFloat();
		System.out.println("Enter the price of 2nd Product: ");
		float priceOfProduct2 = in.nextFloat();
		System.out.println("Enter the price of 3rd Product: ");
		float priceOfProduct13 = in.nextFloat();
		
		float totalPrice = priceOfProduct1 + priceOfProduct2 + priceOfProduct13;
		
		System.out.println("Enter the tax percentage: ");
		float taxPercentage = in.nextFloat();
		
		in.close();
		float finalTaxAmount = (taxPercentage/100) * (totalPrice);
		
		System.out.println("The final Tax Amount is: " + finalTaxAmount);
		
	}

}
