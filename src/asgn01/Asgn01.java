package asgn01;

import java.util.Scanner;

public class Asgn01 {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 0;
		int sum = 0;
		int difference = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two numbers:");
		System.out.println("Number 1: ");

		firstNum = scanner.nextInt();

		System.out.println("Number 2: ");
		secondNum = scanner.nextInt();

		Adder adder = new Adder(firstNum, secondNum);
		Subtractor subtractor = new Subtractor(firstNum, secondNum);

		// display sum and difference
		sum = adder.add();
		System.out.println("Sum: " + sum);
		difference = subtractor.subtract();
		System.out.println("Difference: " + difference);

		scanner.close();
	}

}
