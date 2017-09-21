package exercises;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your age. >>>>>");
		age = input.nextInt();
		if (age>= 23 & age <= 30)
		{
			System.out.println("The user is old.");
		}
		if (age >= 31 & age < 50)
		{
			System.out.println("User is very old.");
		}
		if (age >= 50 & age < 65)
		{
			System.out.println("User is a bag of bones.");
		}
		if (age >= 66 & age <= 100)
		{
			System.out.println("User is ancient.");
		}
	}

}
