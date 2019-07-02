import java.util.Scanner;
import java.util.InputMismatchException;

public class Lab8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String[] name = { "Graham", "Donna", "Tim", "Sam", "Beth", "Mary", "Sandya", "Gary", "Nick", "Tonya" };

		String[] hometown = { "Ferndale", "Royal Oak", "Rochester Hills", "Detroit", "Troy", "Clawson", "Dearborn",
				"Sterling Heights", "Auburn Hills", "Clinton Township" };

		String[] food = { "Pizza", "Burgers", "Ice Cream", "Cookies", "Fried Rice", "Pretzels", "Pasta", "Seafood",
				"Noodles", "Soup" };

		System.out.println("Welcome to our Java Class.");

		int choice1 = 1;

		String answer = "yes";

		do {

			try {

				System.out.println("Which student would you like to learn more about? (enter a number from 1-10)");

				choice1 = input.nextInt();

				System.out.println(
						"Student " + choice1 + " is " + name[(choice1 - 1)] + ". What would you like to know about "
								+ name[(choice1 - 1)] + "? (enter 'hometown' or 'favorite food'):");

			} catch (ArrayIndexOutOfBoundsException | InputMismatchException ex) {

				System.out.println("That data does not exist.  Please try again.");
				
				input.nextLine();
				
				continue;

			}

			input.nextLine();
			
			String choice2 = input.nextLine();

			if (choice2.equalsIgnoreCase("hometown")) {

				System.out.println(name[(choice1 - 1)] + " is from " + hometown[(choice1 - 1)]
						+ ", MI.  Would you like to know more? (enter 'yes' or 'no'):");

			} else if (choice2.equalsIgnoreCase("favorite food")) {

				System.out.println(name[(choice1 - 1)] + " likes to eat " + food[(choice1 - 1)]
						+ ".  Would you like to know more? (enter 'yes' or 'no'):");

			} else {

				System.out.println(
						"That data does not exist.  Please try again.");
				continue;
			}

			answer = input.nextLine();

		} while (answer.equalsIgnoreCase("yes"));
		
		input.close();

	}
}