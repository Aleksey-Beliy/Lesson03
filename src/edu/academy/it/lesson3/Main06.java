package edu.academy.it.lesson3;

public class Main06 {

	public static void main(String[] args) {
		
		double a = 4;
		double b = 9;
		double c = 6;
		double aa = Math.cos((Math.pow(a, 2)+Math.pow(c, 2)-Math.pow(b, 2))/(2*a*c));
		double bb = Math.cos((Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 2))/(2*a*b));
		double cc = Math.cos((Math.pow(b, 2)+Math.pow(c, 2)-Math.pow(a, 2))/(2*b*c));
		System.out.println(Math.toDegrees(aa));
		System.out.println(Math.toDegrees(bb));
		System.out.println(Math.toDegrees(cc));

		
		
		
	}
	}