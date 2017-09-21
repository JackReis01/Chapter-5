package exercises;
import javax.swing.JOptionPane;
public class Pg294 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num;
		int math;
		int answer;
		
		num = JOptionPane.showInputDialog(null, "What is the number?", "Number", JOptionPane.INFORMATION_MESSAGE);
		math = Integer.parseInt(num); 
		answer = (math % 2);
		 if (answer == 0)
		 JOptionPane.showMessageDialog(null, "It is even");
		else
			JOptionPane.showMessageDialog(null, "Its odd");
	}

}
