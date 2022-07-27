package chapterWork;
import javax.swing.JOptionPane;
public class Chapter3 {
	public static void main(String[]args) {
		double score1;
		double score2;
		double score3;
		double average;
		String input;
		input= JOptionPane.showInputDialog("Enter score # 1");
		score1= Double.parseDouble(input);
		
		input= JOptionPane.showInputDialog("Enter score #2");
		score2 = Double.parseDouble(input);
		
		input= JOptionPane.showInputDialog("Enter Score# 3");
				score3 = Double.parseDouble(input);
				
				average= (score1+score2+score3)/3;
				JOptionPane.showMessageDialog(null, "The average Score is" + average);
				
				if(average>95) 
					JOptionPane.showMessageDialog(null, "this is a great score");
				
				if (average<95)
				JOptionPane.showMessageDialog(null, "Try again");
					
					
				
					
				
	
					
				
		
		
	}

}
