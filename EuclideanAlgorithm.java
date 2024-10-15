import java.util.Scanner;

public class EuclideanAlgorithm {

    public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
        //welcome
		System.out.println("- - GCD Calculator by Kevin Mongey - -");

		//loop code for ease of use
		int x = 5;
		while (x > 0) {

			//taking inputs and loops againn if user enters a negative number
	 	    double input1 = -1, input2 = -1;
	 	    while (input1 < 0 || input2 < 0) {
				System.out.println(); //decoration
	 	    	System.out.print("Enter first number: ");
	 	        input1 = keyboard.nextDouble();
	 		    System.out.print("Enter second number: ");
	 		    input2 = keyboard.nextDouble();

	 		    if (input1 < 0 || input2 < 0) {
					System.out.println();
			   		System.out.println("Negative numbers are not allowed. Please try againn and enter a positive number.");
			   		System.out.println();
			System.out.println("--------------------------------------");
			   }
		   }
	 	   //setting higher number as a for division a = higher, b = lower
	 	   double a = 0, b = 0;
	 	   if (input1 >= input2) {
				a = input1;
				b = input2;
			}
			else if (input2 > input1) {
				a = input2;
				b = input1;
			}

			//loop code while b is not 0. When b is 0, a (the divider) is the answer
			double remainder;
			while (b != 0) {
				remainder = a%b;
				a = b;
				b = remainder;
			}
			//print output
			System.out.println();
			System.out.println("Answer: " + a);
			System.out.println();
			System.out.println("--------------------------------------");
		}
    }
}