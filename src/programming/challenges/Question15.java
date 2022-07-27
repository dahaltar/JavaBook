package programming.challenges;

public class Question15 {

	public static void main(String[] args) {
		int customers = 12467;
		double energyDrink = 0.14;
		double citrusDrink = 0.64;
		int energyDrinkCustomer =  (int)(customers *energyDrink);
		int citrusDrinkCustomer = (int)(energyDrinkCustomer * citrusDrink);
		System.out.println("Customer who purchase one or more energy drinks per week is " + energyDrinkCustomer);
		System.out.println("Customer who prefer citrus-flavored energy drinks is " + citrusDrinkCustomer);

	}

}
