package edu.academy.it.lesson3;

public class Main12_07 {

	public static void main(String [] args) {
		
		int n = 123;
		
		int num1 = n % 10;
		int num2 = n / 100;
		int a = n % 100;
		int num3 = a / 10;

		
		if((num1 + num2 == num3) || (num1 + num3 == num2) || (num2 + num3 == num1)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
