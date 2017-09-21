package tutorials;
import javax.swing.JOptionPane;
public class StudentSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id;
		int user;
		id = JOptionPane.showInputDialog(null, "Please enter student number", "Id Number", JOptionPane.INFORMATION_MESSAGE);
		user = Integer.parseInt(id);
		switch(user)
	{
	case 311508:
		JOptionPane.showMessageDialog(null, "Hello Keegan");
		break;
	case 132043:
		JOptionPane.showMessageDialog(null, "Hello Alyssa");
		break;
	case 201524:
		JOptionPane.showMessageDialog(null, "Hello Dylan");
		break;
	case 131512:
		JOptionPane.showMessageDialog(null, "Hello Austin");
		break;
	case 17998:
		JOptionPane.showMessageDialog(null, "Hello Braden");
		break;
	case 138445:
		JOptionPane.showMessageDialog(null, "Hello Chance");
		break;
	case 122552:
		JOptionPane.showMessageDialog(null, "Hello Aaron");
		break;
	case 138082:
		JOptionPane.showMessageDialog(null, "Hello Jack");
		break;
		
	}
	}

}
