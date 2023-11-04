package edu.academy.it.lesson3;

public class Main10 {

	public static void main(String[] args) {

		double n = 5;
		double m = 122;

		double a = m / n;

		int a1 = (int) a / 10;
		System.out.println(a1);

		int a2 = (int) ((a * 10) % 10);
		System.out.println(a2);

	}

}
