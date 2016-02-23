package MainPackage;

import java.util.Scanner;

public class main {
	static Scanner UserInput = new Scanner(System.in);

	public static void main(String[] args) {

		float Yard, Completion, Attempted;
		int Touchdown, Interception;

		System.out.println("Please Enter the Number of Yards: ");
		Yard = UserInput.nextFloat();

		System.out.println("Please Enter the Number of Completion: ");
		Completion = UserInput.nextFloat();

		System.out.println("Please Enter the Number of Attempted: ");
		Attempted = UserInput.nextFloat();

		System.out.println("Please Enter the Number of Touchdown: ");
		Touchdown = UserInput.nextInt();

		System.out.println("Please Enter the Number of Interception: ");
		Interception = UserInput.nextInt();

		float a, b, c, d, Rating; // NFL passer rating formula 0 to 158.3

		a = (float) ((Completion / Attempted - 0.3) * 5);
		b = (float) ((Yard / Attempted - 3) * 0.25);
		c = (float) (20 * Touchdown / Attempted);
		d = (float) (2.375 - (25 * Interception / Attempted));
		Rating = (float) (100 * (a + b + c + d) / 6);

		if (Rating >= 0 && Rating <= 158.3)
			System.out.println("Your QB rating is: " + Rating);
		else
			System.out.println("Your data entered is not accurate. Please try a again!");

	}

}
