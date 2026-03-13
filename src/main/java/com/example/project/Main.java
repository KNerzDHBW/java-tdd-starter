package com.example.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();


		System.out.println("Enter first integer:");
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			System.out.println("Enter second integer:");
			int b = scanner.nextInt();
			System.out.println("Result: " + calculator.add(a, b));
		}
		catch (Exception ex) {
			System.err.println("Invalid input. Please enter integer values.");
			System.exit(1);
		}
	}

}