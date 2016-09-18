package asgn01;

import java.util.Scanner;

public class Asgn01 {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 0;
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		int quit = 0;

		do {
			System.out.println("Enter two numbers:");
			System.out.println("Number 1: ");
			firstNum = scanner.nextInt();
			System.out.println("Number 2: ");
			secondNum = scanner.nextInt();

			System.out.println("Choose: \n 1. Add numbers \n 2. Subtract numbers");
			choice = scanner.nextInt();
			Calculator calculator = new Calculator(firstNum, secondNum);

			if (choice == 1) {
				System.out.println("Sum: " + calculator.add() + "\n");
			} else if (choice == 2) {
				System.out.println("Difference: " + calculator.subtract() + "\n");
			} else {
				System.out.println("Incorrect choice");
			}

			System.out.println("Would you like to calculate more numbers?");
			System.out.println("Enter 1 to continue or 2 to quit:");
			quit = scanner.nextInt();

		} while (quit != 2);

		System.out.println("\nGoodbye!");
		scanner.close();
	}

}
