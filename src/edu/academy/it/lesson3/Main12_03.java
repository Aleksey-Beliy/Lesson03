package edu.academy.it.lesson3;

public class Main12_03 {

	public static void main(String[] args) {

		int n = 234;
		
		int num1 = n / 100;
		int num2 = n % 10;
		int a = n % 100;
		int num3 = a / 10;
		
		int sum = num1 + num2 + num3;
		
		if(sum % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
	}

}
