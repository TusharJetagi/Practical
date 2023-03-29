package com.cognizant.shapes;

import java.util.Scanner;
// PB Stat 1
public class Circle 
{
private float radius; // declaring instance variable
static float pi=3.5f;

Circle()     //Default constructor 1
{  
	radius =1.5f;
	
}
Circle(float radius) // Constructor 2
{  
	this.radius = radius;
	
}

Circle(float radius,float pi) // Constructor 3
{  
	this.radius = radius;
}

static float calculateCircleArea(float radius) 
{
	return pi*radius*radius; 
}

static float calculateCircumference(float radius)
{
	return 2*pi*radius;
}

public static void main(String[] args) 
{
	Circle obj = new Circle();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius: ");
	float radius = sc.nextFloat();
	System.out.println("The area is: "+calculateCircleArea(radius));
	System.out.println("The circumference is: " +calculateCircumference(radius));
	
}
}
