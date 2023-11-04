package edu.academy.it.lesson3;

public class Main05 {

	public static void main(String[] args) {

		int a = 1;
		double grad = 180 * a / Math.PI;
		double grad1 = (int) grad;
		double c = grad - (int) grad;
		double min = c * 60;
		double min1 =(int)min;
		double e = min - (int) min;
		double sec = e * 60;
		System.out.println(grad1 + " градусов " + min1 + " минут " + sec + " секунд ");

	}
}
