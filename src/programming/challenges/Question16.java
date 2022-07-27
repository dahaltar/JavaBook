package programming.challenges;
import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		String name;
		int age;
		String city;
		String college;
		String profession;
		String animal;
		String petName;
		Scanner game= new Scanner(System.in);
		System.out.println("your name");
		name= game.nextLine();
		System.out.println("your age");
		age= game.nextInt();
		game.nextLine();    // when int and line get connected always use nextline(); to seperate the line or breakdown.
		System.out.println("your City");
		city= game.nextLine();
		
		System.out.println("Your College");
		college= game.nextLine();
		//game.hasNext();
		System.out.println("Your Proffession");
		profession= game.nextLine();
		System.out.println("your animal");
		animal= game.nextLine();
		System.out.println("your Pet Name");
		petName= game.nextLine();
		game.close();
		
		System.out.println("There once was a person named "+name+"who lived in "+ city+".At the age of"+age+ ","+name+"went to college at "
					+college+"."+name+"grauduated and went to work as a "+ profession+ "then,"+name+ "adopted a(n)"+animal+
					"named"+petName+".They both lived happily ever after!");
		
		
		

	}

}
