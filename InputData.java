

import java.util.Scanner;

/* This class prompts the user to input data based on a String message 
 * passed as a parameter.  The input type is checked and the user prompted
 * to re-enter that data until the correct type is entered.  Typical use: 
 * int number1 = user.inputInteger("Enter a number: ");
*/
public class InputData {

	private static final String INT_MESSAGE = "Invalid data type. Please re-enter an integer value: ";
	private static final String DOUBLE_MESSAGE = "Invalid data type. Please re-enter a double value: ";

	private static Scanner inputStream = new Scanner(System.in);

	/*
	 * This method prompts the user with the message String parameter and then calls
	 * validateInt() to get the actual input value.
	 */
	public static int validateInt(String message) {
		System.out.print(message);
		int value = validateInt();
		return value;
	}

	/*
	 * This method loops until an int value is entered. Each time the incorrect data
	 * type is entered, the method outputs the INT_MESSAGE, asking the user to
	 * re-enter the correct data type.
	 */
	public static int validateInt() {
		boolean inputIsInvalid = true;
		int value = 0;
		while (inputIsInvalid) {
			if (inputStream.hasNextInt()) { // is data type good?
				value = inputStream.nextInt(); // then get that value...
				inputIsInvalid = false; // ...and break out on next loop
			} else {
				System.out.print(INT_MESSAGE); // bad data type; ask to re-enter
			}
			inputStream.nextLine(); // clean up input stream
		}
		return value;
	}

	/*
	 * This method prompts the user with the message String parameter and then calls
	 * validateDouble() to get the actual input value.
	 */
	public static double validateDouble(String message) {
		System.out.print(message);
		double value = validateDouble();
		return value;
	}

	/*
	 * This method loops until a double value is entered. Each time the incorrect
	 * data type is entered, the method outputs the DOUBLE_MESSAGE, asking the user
	 * to re-enter the correct data type.
	 */
	public static double validateDouble() {
		boolean inputIsInvalid = true;
		double value = 0.0;
		while (inputIsInvalid) {
			if (inputStream.hasNextDouble()) { // is data type good?
				value = inputStream.nextDouble(); // then get that value...
				inputIsInvalid = false; // ...and break out on next loop
			} else {
				System.out.print(DOUBLE_MESSAGE); // bad data type; ask to re-enter
			}
			inputStream.nextLine(); // clean up input stream
		}
		return value;
	}

	/*
	 * This method prompts the user using the message parameter provided, then
	 * inputs the String entered by the userString. Since everything entered can be
	 * treated as a String type, there is no way to actually validate String input.
	 * This method is provided for completeness only.
	 */
	public static String validateString(String message) {
		System.out.print(message);
		String value = inputStream.nextLine();
		return value;
	}

}