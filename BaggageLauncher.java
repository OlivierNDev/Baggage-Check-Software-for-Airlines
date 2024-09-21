/*
 * Assessment: Lab Project 2
 * Student Name: Olivier Niyonshima
 * Lab Professor Name: Leanne Seaward
 * Lab Section Number: 301
 * Due Date: Jul 28, 2024 11:59 PM

 * Program description: This program handles baggage information,
 * checks weight and dimensions, and determines if a bag can be
 * used as a carry-on, applying surcharges if necessary.
 */

public class BaggageLauncher {

	public static void main(String[] args) {
		System.out.println("Welcome to the Baggage Handler Software Program ");

		// I've initialized variables to hold total bags and weight entered
		int totalValidBags = 0;
		double totalWeightEntered = 0.0;

		while (true) {
			// infinite loop
			// if it is true collect bag details
			int length = InputData.validateInt("Enter the length of the baggage (in cm): ");
			int width = InputData.validateInt("Enter the width (in cm): ");
			int height = InputData.validateInt("Enter the height (in cm): ");
			double weight = InputData.validateDouble("Enter the weight (in kg): ");

			// Here I've called my Baggage class by creating new Baggage object
			Baggage bag = new Baggage(length, width, height, weight);
			System.out.println(bag.toString()); // I've to call toString method to print out some messages on console
												// like (This bag can be used as a carry-on.), etc

			double result1 = BaggageChecker.calculateWeightSurcharge(bag);
			if (bag.getWeight() > BaggageChecker.MAX_REGULAR_WEIGHT) {
				System.out.printf(
						"This bag is overweight; it exceeds the allowed weight of 22.00 kg. A surcharge of $%.2f applies.%n",
						result1);
			}

			// Here I've added if statement to check if the bag can be used as carryOn
			boolean result2 = BaggageChecker.canBeUsedAsACarryOn(bag);
			if (bag.getLength() + bag.getWidth() + bag.getHeight() < BaggageChecker.MAX_CARRYON_DIMENSION) {

			} else

				totalValidBags++;
			totalWeightEntered += weight;

			String result = InputData
					.validateString("Do you wish to continue? Enter 'No' to quit, anything else to continue: ");
			// Asking the user if they wish to continue

			if (result.equalsIgnoreCase("No")) {
				break; // Exit the loop if the user chooses to quit
			}
		}

		// to Display the total number of valid bags and total weight entered
		System.out.println("Total number of valid bags entered: " + totalValidBags);
		System.out.printf("The total weight entered was: %.2f kg%n", totalWeightEntered);
		System.out.println("The program has terminated.");
		System.out.println("Program by Olivier Niyonshima");
	}
}
