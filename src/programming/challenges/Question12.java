package programming.challenges;
import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		Scanner key= new Scanner(System.in);
		String city;
		System.out.println("Enter your favourate City");
		city= key.nextLine();
		System.out.println("your city name has "+  city.length() +" character in length.");
		System.out.println("Name of the city in all "+ city.toUpperCase()+ " Uppercase.");
		System.out.println("Name of the City in all "+ city.toLowerCase()+" lowercase.");
		System.out.println("First character of city "+ city.charAt(0));
		key.close();
		
		 
		

	}

}
