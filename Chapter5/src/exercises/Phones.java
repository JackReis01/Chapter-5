package exercises;
import javax.swing.JOptionPane;
public class Phones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Plan A 500 min 0 text 0 data
		//Plan B 500 min any text 0 data
		//Plan C 500 or more min less than 100 text 0 data
		//Plan D 500 or more min more than 100 text 0 data
		//Plan E Any data
		//Plan F More than 2 gigs
		String strData;
		String strMinutes;
		String strText;
		int text;
		int minutes;
		double data;
		strData = JOptionPane.showInputDialog(null, "How much data do you need?", "Data", JOptionPane.INFORMATION_MESSAGE);
		strMinutes = JOptionPane.showInputDialog(null, "How many minutes do you need?", "Minutes", JOptionPane.INFORMATION_MESSAGE);
		strText = JOptionPane.showInputDialog(null, "How many texts do you need?", "Text", JOptionPane.INFORMATION_MESSAGE);
		data = Double.parseDouble(strData);
		minutes = Integer.parseInt(strMinutes);
		text = Integer.parseInt(strText);
		if(minutes <= 500 && data == 0 && text == 0) {
			 JOptionPane.showMessageDialog(null, "Your best option is option A for 49$ a month.");
		}
			 if(minutes <= 500 && data == 0 && text >= 1) {
			JOptionPane.showMessageDialog(null, "Your best option is option B for 55$ a month.");
		}
			if(minutes >= 500 && data == 0 && text <= 100) {
			JOptionPane.showMessageDialog(null, "Your best option is option C for 61$ a month.");
		}
			if(minutes >= 500 && data == 0 && text > 100) {
			JOptionPane.showMessageDialog(null, "Your best option is option D for 70$ a month.");
		}
			if(data > 0 && data <= 2) {
			JOptionPane.showMessageDialog(null, "Or you can get option E for 79$ a month. (just 2 gigs of data)");
		}
			if(data > 2) {
			JOptionPane.showMessageDialog(null, "Or you can get option F for 87$ a month. (just 2 or more gigs of data)");
		}					 
	      }
}

