package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean check = true;
		do {
			System.out.print("Input Age here: ");
			String input = scanner.nextLine();
			try {
				System.out.println("Your age is: " + inputAge(input));
				check = true;
			} catch (InvalidAgeException iae) {
				System.out.println(iae.getMessage());
				check = false;
			} catch (InputMismatchException ime) {
				System.out.println(ime.getMessage());
				check = false;
			}
		} while (check == false);
		scanner.close();
	}

	private static int inputAge(String input) throws InvalidAgeException, InputMismatchException {
		try {
			int x = Integer.parseInt(input);
			if (x > 0) {
				return x;
			} else {
				throw new InvalidAgeException("Wrong inputing! The age must be greater than 0, please input again! ");
			}
		} catch (NumberFormatException e) {
			throw new InputMismatchException("Wrong inputting! Please input an age as int! ");
		}

	}

}
