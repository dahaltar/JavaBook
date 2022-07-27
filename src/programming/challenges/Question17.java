package programming.challenges;

public class Question17 {

	public static void main(String[] args) {
		 int purchasedStock= 1000;
		 double purchasedPerShare= 32.87;
		 double purchasedCommissionPaid= 0.02;
		 double salesPerShare= 30.92;
		 
		 double purchaseAmount= purchasedPerShare*purchasedStock;
		System.out.println("The amount joe paid " + purchaseAmount);
		
		double purchaseCommission= purchaseAmount*purchasedCommissionPaid;
		System.out.println("Commission paid "+purchaseCommission);
		
		double soldAmount= purchasedStock*salesPerShare;
		System.out.println("Sold amount of stock "+soldAmount);
		
		double salesCommission= soldAmount*purchasedCommissionPaid;
		System.out.println("Commission paid "+salesCommission);
		
		double profit= (soldAmount-salesCommission)-(purchaseAmount+purchaseCommission);
		
		if(profit>0) {
			System.out.println("Joe is at Profit with " +profit);
			
		}else {
			System.out.println("joe is at loss with " + Math.abs(profit));
		}
		
		
		 

	}

}
