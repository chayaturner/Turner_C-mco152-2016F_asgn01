package asgn01;

import java.util.Scanner;

public class Asgn01 {

	public static void main(String[] args) {
		int firstNum = 0;
		int secondNum = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two numbers:");
		System.out.println("Number 1: ");

		firstNum = scanner.nextInt();

		System.out.println("Number 2: ");
		secondNum = scanner.nextInt();

		Adder adder = new Adder(firstNum, secondNum);

		sum = adder.add();
		System.out.println("Sum: ");
		System.out.println(sum);

		scanner.close();
	}

}
