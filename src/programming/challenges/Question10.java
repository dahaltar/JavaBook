package programming.challenges;
import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		int score1;
		int score2;
		int score3;
		
		Scanner key = new Scanner(System.in);
		System.out.println("Enter your score:");
		score1 = key.nextInt();
		score2= key.nextInt();
		score3= key.nextInt();
		double avarage= (double)(score1+score2+score3)/3;
		key.close();
		System.out.println("Your average score is :" + String.format("%.3f", avarage));
		
		
		
		
		
		
		
		
		

	}

}