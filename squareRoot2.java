import java.util.Scanner;

public class squareRoot2 {

	public static double calculateSqrt2(double userInput) {
		if (userInput < 0) {
			double badDouble = Double.NaN;
			return badDouble;
		} 
		
		else if (userInput == 0) {
			return 0;
		} 
		
		else {
			double approximation = 1;
			double previousApproximation = 1;
			double nextApproximation = 0;
			while (nextApproximation != previousApproximation) {
				previousApproximation = nextApproximation;
				nextApproximation = 0.5 * (approximation + (userInput / approximation));
				approximation = nextApproximation;
			}
			return approximation;
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number.");
		Scanner input = new Scanner(System.in);
		double keypadInput = input.nextDouble();
		System.out.println(calculateSqrt2(keypadInput));

	}

}
