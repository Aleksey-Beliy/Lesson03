package edu.academy.it.lesson3;

public class Main01 {

	public static void main(String[] args) {

		double d = 123.456;

		double a = (int) d / 1000.0;
		double b = (int)((d - (int) d) * 1000.0);
		System.out.println(a+b);

	}
}
