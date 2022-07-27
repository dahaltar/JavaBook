package programming.challenges;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double chargeForTheMeal;
		double tax = 0.0675;
		double tip = 0.15;
		System.out.println("Your meal cost");
		chargeForTheMeal = key.nextDouble();
		key.close();
		double taxAmount = (tax * chargeForTheMeal);
		System.out.println("Your tax amount is " + taxAmount);
		double tipamount = (chargeForTheMeal + taxAmount) * tip;
		System.out.println("Your tip amount is " + tipamount);
		double totalBill = chargeForTheMeal + taxAmount + tipamount;
		System.out.println("Your total bill is " + String.format("%.2f", totalBill));

	}

}
