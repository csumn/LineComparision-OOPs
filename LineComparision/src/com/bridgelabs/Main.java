package com.bridgelabs;

public class Main {

	public static void main(String[] args) {
		LineComparision line1 = new LineComparision(77,64,77,72);
		double lengthOfline_1 = line1.calculate_length();
		System.out.println("Length of Line one is : " +lengthOfline_1);

		LineComparision line2 = new LineComparision(77,72,82,72);
		double lengthOfline_2 = line2.calculate_length();
		System.out.println("Length of Line two is : " +lengthOfline_2);
		LineComparision.compare_Lines(lengthOfline_1, lengthOfline_2);
	}
}
