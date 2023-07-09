package tw.org.iii.teresaaaaaaapp;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("height(cm): ");
		double height = scanner.nextDouble()/100;
		System.out.print("weight(kg): ");
		double weight = scanner.nextDouble();
		double BMI = weight / (height*height);
		if (BMI<18.5) {
			System.out.println("Underweight");}
		else if (BMI <25) { 
			System.out.println("Normal");} 
		else if (BMI <35) {
			System.out.println("Overweight");}
		else{System.out.println("Obesity");}
		
		scanner.close();
			}
		}