package com.Shanklish.Circle;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Circle
    {
	private double radius;
	private int count;
	private double circumference;
	private double area;
	
	
	public Circle()
	{
	    radius = 0;
	}

	//--------Getters and setters-----------
	
	public int getCount()
		{
		    return count;
		}

		
	public void setCount( int count )
		{
		    this.count = count;
		}

	public double getRadius()
	{
	    return radius;
	}

	
	public void setRadius( double radius )
	{
	    this.radius = radius;
	}
	
	//---------------------
	
	public double calcCircumference(double r)
	{
	    circumference = 2*(Math.PI * r);
	    return circumference;
	}
	
	public double calcArea(double r)
	{
	    area = (Math.PI * (r*r));
	    return area;
	}
	
	//-------Formatting--------------
	
	public String calcFormattedArea(double pArea)
	{
	    DecimalFormat dFormat = new DecimalFormat("##.##");
	    return  dFormat.format(pArea);
	}
	
	public String calcFormattedCircumfernece(double pCircumference)
	{
	    DecimalFormat dFormat = new DecimalFormat("##.##");
	    return dFormat.format(pCircumference);
	}
	
	
	
    }
