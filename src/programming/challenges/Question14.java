package programming.challenges;

public class Question14 {

	public static void main(String[] args) {
		double share= 600;
		double perShare= 21.77;
		double commission= 0.02;
		double amountForTheShare= share*perShare;
		double amountOfCommission= amountForTheShare*commission;
		double totalAmountPaid= amountForTheShare+amountOfCommission;
		System.out.println("The amount paid for the Stock alone is " + amountForTheShare);
		System.out.println("The amount of the commission is "+ amountOfCommission);
		System.out.println("The total amount paid is "+ totalAmountPaid);
		

	}

}
