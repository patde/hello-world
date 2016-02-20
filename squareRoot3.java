import java.util.Scanner;

public class squareRoot3 {

	public static double calculateSqrt3(double userInput) {
		if (userInput < 0) {
			double badDouble = Double.NaN;
			return badDouble;
		}

		else if (userInput == 0) {
			return 0;
		}

		else {
			double x = 1;
			double y = 1;
			double temp = 0;
			double approximation = 1;
			double previousApproximation = 0;
			/*
			 * for (int i = 1; i < 154; i++) { temp = x; x = x + (y *
			 * userInput); y = temp + y; } approximation = x / y;
			 */

			while (approximation != previousApproximation) {
				previousApproximation = approximation;
				temp = x;
				x = x + (y * userInput);
				y = temp + y;
				approximation = x / y;
			}

			return approximation;

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number.");
		Scanner input = new Scanner(System.in);
		double keypadInput = input.nextDouble();
		System.out.println(calculateSqrt3(keypadInput));

	}

}
