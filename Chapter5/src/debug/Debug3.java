package debug;
import java.util.Scanner;

public class Debug3 {
	private static Scanner input  = new Scanner(System.in);
	   public static void main(String[] args)
	   {
	      final int LOW = 111;
	      final int HIGH = 999;
	      final int CUTOFF = 500;
	      int item = 0;
	      String output = null;
	    
	      calculateOutPut(item, LOW, output, HIGH, CUTOFF);
	   }
	   public static void calculateOutPut(int item, final int LOW, String output, final int HIGH, final int CUTOFF)
	   {
	           
	      System.out.println("Please enter item number");
	      item = input.nextInt();
	      if(item < LOW) output = "Item number too low";
	      else
	if(item > HIGH)
	output = "Item number too high";
	      else
	if(item > CUTOFF)
	             output = "Valid - in Automotive Department";
	          else
	             output = "Valid - Item in Housewares Department";
	       System.out.println(output);
	   }
}

