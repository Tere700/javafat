package tw.org.iii.teresaaaaaaapp;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Enter the first number:");
		int x = scanner.nextInt();
		System.out.print("Enter the second number");
		int y = scanner.nextInt();
		
		int sum = x + y;
		int difference = x - y;
		int product = x * y;
		int quotient = x / y;
		int remainder = x % y;
		System.out.println("Sum:" + sum);
		System.out.println("Difference:" +difference);
		System.out.println("Product:" + product);
		System.out.println("Quotient:" + quotient);
		System.out.println("Remainder:" + remainder);
		scanner.close();
		
	}

}
