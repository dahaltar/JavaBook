package programming.challenges;

import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {

		double purchaseAmount;
		double sSalesTax = 0.04;
		double cSalesTax = 0.02;
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your Purchase amount:");
		purchaseAmount = key.nextDouble();
		double stateSalesTax = purchaseAmount * sSalesTax;
		System.out.println("Your State Sales Tax is " + stateSalesTax);
		double countySalesTax = purchaseAmount * cSalesTax;
		System.out.println("Your County sales Tax is " + countySalesTax);
		double totalOfSales = purchaseAmount + stateSalesTax + countySalesTax;
		key.close();
		System.out.println("Your total of sales is " + totalOfSales);

	}

}
