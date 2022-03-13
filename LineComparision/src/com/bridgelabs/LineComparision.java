package com.bridgelabs;

public class LineComparision {
	private double x1;
	private double y1;
	private double x2;
	private double y2;

	public LineComparision(double X1, double Y1, double X2, double Y2) {
		this.x1 = X1;
		this.y1 = Y1;
		this.x2 = X2;
		this.y2 = Y2;
	}
	public double calculate_length() {
		double LengthOfLine = Math.sqrt( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ));
		return LengthOfLine;	
	}
	static void check_Equality(Double lengthOfline_1,Double lengthOfline_2) {
		if(lengthOfline_1.equals(lengthOfline_2)) {
			System.out.println("Both the lines are equal");
		}else
			System.out.println("Both the lines are not equal");
	}
}
