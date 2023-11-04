package edu.academy.it.lesson3;

public class Main07 {

	public static void main(String[] args) {

		int m = 12;
		int n = 20;
		int k = 42;

		int p = 15;
		int q = 30;
		int r = 90;

		int hour;
		int min;
		int sec;

		int TimeInSec = r + k + ((n + q) * 60) + ((p + m) * 3600);
		hour = TimeInSec / 3600;
		TimeInSec = TimeInSec - hour * 3600;
		min = TimeInSec / 60;
		TimeInSec = TimeInSec - min * 60;
		sec = TimeInSec;

		int hour24 = 0;
		if (hour > 24) {
			hour24 = hour - (hour / 24) * 24;
		}
		System.out.println(hour24 + " ч. " + min + " мин. " + sec + " сек. ");
	}

}
