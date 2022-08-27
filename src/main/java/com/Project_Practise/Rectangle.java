package com.Project_Practise;

public class Rectangle {

	private static  double length;
	private static  double breath;

	public double getLength(double l) {
		return length;
	}

	public void setLength(double l) {
		this.length = l;
	}

	public double getBreath(double b) {
		return breath;
	}

	public void setBreath(double b) {
		this.breath = b;
	}

	public double area() {
		return length * breath;
	}

	public double perimeter() {
		return 2 * (length + breath);
	}

	public static  boolean isSquare() {
		if (length == breath) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		r.setLength(5);
		r.setBreath(2);
		
//		System.out.println("Area of rectangle is "+ r.area());
//		System.out.println("Perimeter of rectangle is "+ r.perimeter());
//      System.out.println("It is square : "+ isSquare());
	}
}
