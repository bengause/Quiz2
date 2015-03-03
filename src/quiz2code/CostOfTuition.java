package quiz2code;

import java.util.Scanner;

public class CostOfTuition {

	// Main method
	public static void main(String[] args) {

		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Prompt user to enter two doubles for tuition and % increase
		System.out.print("Enter the tuition cost: $");
		double tuition = input.nextDouble();

		System.out.print("Enter the percentage increase: %");
		double increase = input.nextDouble();
		
		
		System.out
				.print("The total cost of tuition for four years with initial tuition $"
						+ tuition
						+ " and a "
						+ increase
						+ " percent increase is \n$");
		
		System.out.printf("%7.2f", calculateTuition(tuition, increase));

	}

	public static double calculateTuition(double tuition, double pctIncrease) {

		// Change the percent increase into something that can multiply tuition
		double rate = ((pctIncrease / 100) + 1);

		double totalTuition = tuition;

		for (int x = 1; x < 4; x++) {
			tuition = tuition * rate;
			totalTuition += tuition;
		}
		
		return totalTuition;

	}

}
