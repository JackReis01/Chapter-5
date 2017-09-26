package gameZone;
import java.util.Random;
import javax.swing.JOptionPane;
public class RoShamBo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int score = 0;
		while (x<5) {
			++x;
			displayRPS(x, score);
		
		}
		if(x == 5) {
			JOptionPane.showMessageDialog(null, "" + score);
			}
}		
	public static void displayRPS(int x, int score)	{
		String user;
		int math;
		Random rand = new Random();
		int  n = rand.nextInt(3) + 1;
		user = JOptionPane.showInputDialog(null,
				"Pick one please\n1 - Rock\n2 - Paper"
				+ "\n3 - Scissors\n4 If you are Brosius pick this one");
		math = Integer.parseInt(user);
		if(math == 1) {
			if (n == 1) {
			 JOptionPane.showMessageDialog(null,"You picked rock. Its a tie");
			}
			if (n == 2) {
				 JOptionPane.showMessageDialog(null,"You picked rock. You lose");
				}
			if (n == 3) {
				 JOptionPane.showMessageDialog(null,"You picked rock. You win!");
				 ++score;
				}
		}
		if(math == 2) {
			if (n == 1) {
			 JOptionPane.showMessageDialog(null,"You picked paper. You win!");
			 ++score;
			}
			if (n == 2) {
				 JOptionPane.showMessageDialog(null,"You picked paper. Its a tie");
				}
			if (n == 3) {
				 JOptionPane.showMessageDialog(null,"You picked paper. You lose!");
				}
		}
		if(math == 3) {
			if (n == 1) {
			 JOptionPane.showMessageDialog(null,"You picked scissors. You lose");
			}
			if (n == 2) {
				 JOptionPane.showMessageDialog(null,"You picked scissors. You win");
				 ++score;
				}
			if (n == 3) {
				 JOptionPane.showMessageDialog(null,"You picked scissors. Its a tie");
				}
		}
		if(math == 4) {
			JOptionPane.showMessageDialog(null, "You lose!");
		}
		
		}
		
	}