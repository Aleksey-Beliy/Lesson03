package edu.academy.it.lesson3;

public class Main11 {

	public static void main(String[] args) {

		double num = 1234;
		double chet = 1;
		double nechet = 1;
		double num1 = num % 10;
		
		if (num1 % 2 == 0) {
			chet = chet * num1;
		} else {
			nechet = nechet * num1;
		}
		
		double a = num % 100;
		double num2 = (int) a / 10;
		
		if (num2 % 2 == 0) {
			chet = chet * num2;
		} else {
			nechet = nechet * num2;
		}
		
		double b = (int) num / 100;
		double num3 = b % 10;
		
		if (num3 % 2 == 0) {
			chet = chet * num3;
		} else {
			nechet = nechet * num3;
		}
		double num4 = (int) num / 1000;
		
		if(num4 % 2 == 0) {
			chet = chet * num4;
		} else {
			nechet = nechet * num4;
		}
		double chastnoe = chet / nechet;
		System.out.println(chastnoe);

		

	}

}
