package com.Project_Practise;

public class rectangle_Test {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		
		r.setBreath(2);
		r.setLength(2);
		
		System.out.println("Area of rectangle is "+ r.area());
		System.out.println("Perimeter of rectangle is "+ r.perimeter());
      System.out.println("It is square : "+r. isSquare());
	}
	
}
