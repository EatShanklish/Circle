package com.Shanklish.Circle;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleApp
    {

	public static void main( String[] args )
	{
	    Scanner scan = new Scanner(System.in);
	    
	   // ArrayList<Circle> circleArrayList = new ArrayList<Circle>();
	    
	    Circle c1 = new Circle();
	    
	    int count = 0;
	    
	    String choice = "y";
	    
	    do
		{
		    System.out.println("Please enter the radius of the circle: ");
        	    double radius = scan.nextDouble();
        	    scan.nextLine();
        	    
        	    double mCircumference = c1.calcCircumference(radius);
        	    double mArea = c1.calcArea(radius);
        	       
        	    System.out.println("Circumference: " +  c1.calcFormattedCircumfernece(mCircumference));
        	    System.out.println("Area: " + c1.calcFormattedArea(mArea));
        	    
        	    count++;
        	    
        	    System.out.println("Would you like to create another circle?");
        	    choice = scan.nextLine();
        	   // scan.nextLine();
        	    
		} while ( (choice.equalsIgnoreCase("y")) );
		
	
		
		System.out.println("Goodbye. You created " + count + " circles");
	}

    }
