import java.util.Scanner;

public class squareRoot1 {

	public static double calculateSqrt(double userInput) {

		if (userInput < 0) {
			double badDouble = Double.NaN;
			return badDouble;
		}

		else {
			double approximation = 0;
			for (double i = 0; i >= 0; i++) {
				if ((i * i) > userInput) {
					break;
				}
				approximation = i;
			}

			for (double j = 0.000000000001; j >= 0.000000000001;) {
				approximation = approximation + j;
				if ((approximation * approximation) > userInput) {
					approximation = approximation - j;
					break;
				}
				j = j + 0.000000000001;
			}

			return approximation;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number.");
		Scanner input = new Scanner(System.in);
		double keypadInput = input.nextDouble();
		System.out.println(calculateSqrt(keypadInput));

	}

}
