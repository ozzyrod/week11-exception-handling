/*
 * @project Week11
 * @author  Osbardo Rodriguez
 * Date:    5/8/18
 */
package Week11;

/*
 * Import necessary java packages.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	Scanner input = new Scanner( System.in );
    	boolean repeatLoop = true;

    	do {
		    try {

			    System.out.print( "Enter numerator: " );
			    int num = input.nextInt();

			    System.out.print( "Enter denominator: " );
			    int denom = input.nextInt();

			    int quotient = num / denom;
			    System.out.printf( "Quotient is %d\n", quotient );
			    repeatLoop = false; // If all is well, change the variable to false.

		    } catch ( InputMismatchException e ) {

			    System.out.println( "You need to enter an integer, try again." );

		    } catch ( ArithmeticException e ) {

		    	System.out.println( "You're not allowed to divide by zero, try again." );

		    } catch ( Exception e ) { // Much like the "default" in a switch statement.

			    System.out.println( e );
			    input.nextLine(); // Add so the try block doesn't repeat endlessly
			    // If you add the input.nextLine() into the 'finally', it is unnecessary here.

		    } finally { // Always runs and then goes back up to the top or exits.

		    	input.nextLine();

		    }
	    } while ( repeatLoop == true );
    }
}
