package exercises;
import java.util.Scanner;
public class Pizza {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choiceYes;
		String toppingsChoice;
		String choiceHotDog;
		String size;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Would you like a pizza? Yes or no >>>>");
		choiceYes = input.nextLine();
		// Do they really want pizza
		if ("Yes".equalsIgnoreCase(choiceYes)||"Y".equalsIgnoreCase(choiceYes))
		{
			System.out.println("You said " + choiceYes + " to having pizza.");
			System.out.print("Please choose a size small, medium, or large >>>>");
			size = input.nextLine();
			if ("small".equals(size)|| "Small".equals(size))
				{
				System.out.println("You said " + size + " pizza size.");
					
				if ("Medium".equalsIgnoreCase(size))
				{
				
				}
				if ("Large".equalsIgnoreCase(size))
				{
					
				}
				}
			
		}
		public static void displayPizzaSize(String size) {
			String pizzaKind;
			Scanner input = new Scanner(System.in);
			System.out.println("You said " + size + " pizza size.");
		}	
		public static void displayPizzaType()
		{
			System.out.print("What kind of pizza do you want? Pepperoni, Sausage, Cheese >>>>");
			String pizzaKind = input.nextLine();
			if (("pepperoni".equalsIgnoreCase(pizzaKind)|| "Sausage".equalsIgnoreCase(pizzaKind)|| "Cheese".equalsIgnoreCase(pizzaKind)))
			{
				
			}
		public static void displayPrice(String Size) 
		{
			double mediumCost = 9.99;
			double largeCost = 12.99;
			double smallCost = 6.99;
			if ("small".equalsIgnoreCase(size))
				System.out.println(smallCost);
			if ("Medium".equalsIgnoreCase(size))
				System.out.println(mediumCost);
			if ("Large".equalsIgnoreCase(size))
				System.out.println(largeCost);
		}
	}
}

}
