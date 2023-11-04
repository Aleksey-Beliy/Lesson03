package edu.academy.it.lesson3;

public class Main02 {

	public static void main(String[] args) {

		double a = 2;
		double b = 5;
		double c = 3;
		double x1;
		double x2;
		double D;

		D = Math.pow(b, 2) - 4 * a * c;

		if (D < 0) {
			System.out.println("Корней нет");
		}
		x1 = ((-b + Math.sqrt(D)) / (2 * a));
		x2 = ((-b - Math.sqrt(D)) / (2 * a));

		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

	}

}
