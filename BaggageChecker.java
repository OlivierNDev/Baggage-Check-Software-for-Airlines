/*
 * Assessment:  Lab Project 2
 * Student Name: Olivier Niyonshima
 * Lab Professor Name: Leanne Seaward
 * Lab Section Number: 301
 * Due Date: Jul 28, 2024 11:59 PM

 * Program description: This program handles baggage information,
 * checks weight and dimensions, and determines if a bag can be
 * used as a carry-on, applying surcharges if necessary.
 */
public class BaggageChecker {
	public static final int MAX_REGULAR_WEIGHT = 22;
	public static final double SURCHARGE_PER_KG = 3.00;
	public static final double MAX_CARRYON_DIMENSION = 36;
	public static final double MAX_SUM_DIMENSIONS = 192;

	public static boolean allowedWeightIsMoreThanMax(Baggage bag) {
		if (bag.getWeight() > MAX_REGULAR_WEIGHT) {
			return true;

		} else {
			return false;
		}

	};

	public static double calculateWeightSurcharge(Baggage bag) {
		double result = (bag.getWeight() - MAX_REGULAR_WEIGHT) * SURCHARGE_PER_KG;
		return result;

	};

	public static boolean canBeUsedAsACarryOn(Baggage bag) {
		if (bag.getLength() < MAX_CARRYON_DIMENSION &&

				bag.getWidth() < MAX_CARRYON_DIMENSION &&

				bag.getWeight() < MAX_CARRYON_DIMENSION) {

			return true;
		}

		else {
			return false;
		}

	}

	public static boolean sumDimensionsExceedsMax(Baggage bag) {
		double result = (bag.getLength() + bag.getWidth() + bag.getWeight());
		if (result > MAX_SUM_DIMENSIONS) {
			return true;
		} else {
			return false;
		}
	}

}
