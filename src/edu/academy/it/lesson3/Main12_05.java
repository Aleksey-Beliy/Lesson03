package edu.academy.it.lesson3;

public class Main12_05 {

	public static void main(String[] args) {

		double num = 234;

		double num1 = num / 100;
		double num2 = num % 10;
		double a = num / 10;
		double num3 = a % 10;
		double sum = num1 + num2 + num3;

		if (Math.pow(num, 2) == Math.pow(sum, 3)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
