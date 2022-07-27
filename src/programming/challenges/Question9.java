package programming.challenges;
import java.util.Scanner;


public class Question9 {

	public static void main(String[] args) {
		double milesDriven;
		double gallonsOfGasUsed;
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your mile driven:");
		milesDriven= key.nextDouble();
		System.out.println("Gallon of gas used");
		gallonsOfGasUsed= key.nextDouble();
		
		key.close();
		System.out.println("My car drive " + String.format("%.2f", milesDriven/gallonsOfGasUsed)   + " miles per galon.");
		// Sting.format("%.2f", args) to round up to two decimal place.

	}

}
