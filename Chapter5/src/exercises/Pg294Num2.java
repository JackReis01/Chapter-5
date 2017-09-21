package exercises;
import javax.swing.*;
public class Pg294Num2 {
	   public static void main (String args[]) 
	   {
	      int one, two, three;
	      String str;
	      str = JOptionPane.showInputDialog(null,"Enter an integer");
	      one = Integer.parseInt(str);
	      str = JOptionPane.showInputDialog(null,"Enter an integer");
	      two = Integer.parseInt(str);
	      str = JOptionPane.showInputDialog(null,"Enter an integer");
	      three = Integer.parseInt(str);
	      if(one > two & one > three & two > three) {
		      JOptionPane.showMessageDialog(null, "Descending " + one +"," + two +"," + three);
	      JOptionPane.showMessageDialog(null, "Ascending " + three +"," + two +"," + one);
	   }
	      else
	    	  JOptionPane.showMessageDialog(null,  "Number 1 is not the biggest, followed by number 2");
	      if(one > two & one > three & three > two) {
		      JOptionPane.showMessageDialog(null, "Descending " + one +"," + three +"," + two);
	      JOptionPane.showMessageDialog(null, "Ascending " + two + + three + + one);
	      }
	      else
	    	  JOptionPane.showMessageDialog(null,  "Number 1 is not the biggest followed by number 3");
	      if(two > one & two > three & one > three) {
		      JOptionPane.showMessageDialog(null, "Descending " + two +"," + one +"," + three);
	      JOptionPane.showMessageDialog(null, "Ascending " + three +"," + one +"," + two);
	      }
	      else
	    	  JOptionPane.showMessageDialog(null,  "Number 2 is not the biggest followed by number 1");
	      if(two > one & two > three & three > one) {
		      JOptionPane.showMessageDialog(null, "Descending " + two +"," + three +"," + one);
	      JOptionPane.showMessageDialog(null, "Ascending " + one +"," + three +"," + two);
	      }
	      else
	    	  JOptionPane.showMessageDialog(null,  "Number 2 is not the biggest followed by number 3");
	      if(three > two & three > one & two > one) {
		      JOptionPane.showMessageDialog(null, "Descending " + three +"," + two +"," + one);
	      JOptionPane.showMessageDialog(null, "Ascending " + one +"," + two +"," + three);
	      }
	      else
	    	  JOptionPane.showMessageDialog(null,  "Number 3 is not the biggest followed by number 2");
	      if(three > two & one < three & two < one) {
		      JOptionPane.showMessageDialog(null, "Descending " + three +"," + one +"," + two);
	      JOptionPane.showMessageDialog(null, "Ascending " + two +"," + one +"," + three);
	      }
	      else
	    	  JOptionPane.showMessageDialog(null,  "Number 3 is not the biggest followed by number 1");
	             

	   }
}
