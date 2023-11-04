package edu.academy.it.lesson3;

public class Main12_08 {

	public static void main(String[] args) {

		int n = 27;
		int a = 3;

		if ((n == 1) || (n == a) || (n == Math.pow(a, 2)) || (n == Math.pow(a, 3)) || (n == Math.pow(a, 4))) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
