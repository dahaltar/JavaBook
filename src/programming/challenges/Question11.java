package programming.challenges;
import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double retailPrice;
		double profit=0.4;
		System.out.println("Enter your retail price:");
		retailPrice= key.nextDouble();
		double amountOfProfit= retailPrice*profit;
		System.out.println("your profit is " + String.format("%.1f", amountOfProfit) );
		key.close();

	}

}
