package edu.academy.it.lesson3;

public class Main12_02 {

	public static void main(String[] args) {

		int n = 1234;

		int num1 = n % 10;// 4
		int num2 = n / 1000;// 1
		int a = n / 100;
		int num3 = a % 10;// 2
		int b = n % 100;
		int num4 = b / 10;// 3

		if (num2 + num3 == num1 + num4) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
