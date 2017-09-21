package tutorials;
import javax.swing.JOptionPane;
public class Door {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice;
		int doorChoice;
		choice = JOptionPane.showInputDialog(null, "Pick a door 1, 2, or 3", "Door", JOptionPane.INFORMATION_MESSAGE);
		doorChoice = Integer.parseInt(choice);
		
		if (doorChoice == 1)
		{
			JOptionPane.showMessageDialog(null, "You win nothing");
		}
		if (doorChoice == 2)
		{
			 JOptionPane.showMessageDialog(null, "you win less than nothing");
		}
		if (doorChoice == 3)
		{
			 JOptionPane.showMessageDialog(null, "You win a Huffy bike!");
		}
		else JOptionPane.showMessageDialog(null, "Not an option. I said 1-3");
	}

}
