import java.util.Scanner;
/*I first imported the scanner package 
 * By Abdirizaq Hussein
 * 
 */

//This is the start of your class 
public class CalcTotal {
	//this is your main method 
	public static void main(String[] args) {
		// this is an import that reads your keyboard 
		Scanner input = new Scanner(System.in);
		// this statement just prints whatever is in between the quotations
		System.out.println("Enter Subtotal and gratuityRate");
	// double is a datatype that gives you a precise number and uses decimals so its necessary for this code.
		// this line declaring the variable "subtotal"
		double subtotal = input.nextDouble(); 
		// this line is declaring the variable "subtotal"
		double gratuityRate = input.nextDouble();
		
		// this line is just initializing  what gratuity will be equal to.
	    gratuityRate  = (15 * 0.10);
	    //this line is just initializing what subtotal will be equal to.
		subtotal = (gratuityRate + 10);
		
		 
	
		// This line is just printing into the console.
		System.out.println("Compute Subtotal and gratuityRate");
		// this line prints subtotal into the console box.
		System.out.println(subtotal);
		// this line prints gratuityRate into the console box. 
		System.out.println(gratuityRate);
		
		
		
	
	}
}
