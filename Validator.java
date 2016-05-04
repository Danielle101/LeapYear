package leapYearFinder;

import java.util.Scanner;

public class Validator {
	static Scanner sc = new Scanner(System.in);

	// validates that the user has entered a string
	public static String get_String(String prompt) {
		String s = "";
		boolean isValid = false;

		while (!isValid) { // loops until user enters a non-blank line

			System.out.print(prompt);
			s = sc.nextLine();
			if (!s.equals(""))
				isValid = true;
		}

		return s;

	}

	// validates that the string entered is either "y" or "n"
	public static String getString(String prompt) {

		String s = null;
		boolean isValid = false;
		while (!isValid)

		{
			s = get_String(prompt);
			if (s.compareTo("Y") == 0 || s.compareTo("y") == 0 || s.compareTo("N") == 0 || s.compareTo("n") == 0)
				isValid = true;
			else
				System.out.println("\nError! You must enter 'y' or 'n'!");
		}

		return s;
	}

	// validates that the user has entered an integer
	public static int readValidInt() {
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.print("Please make a valid selection! Enter a number: ");
		}
		int x = sc.nextInt();
		sc.nextLine();
		return x;
	}
}
