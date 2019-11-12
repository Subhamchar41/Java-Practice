package com.TheMasterMindGroup.Homework;

import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		final double PI = 3.14159265359;

		System.out.print("Enter the radius of a cylinder: ");
		double radius = input.nextDouble();
		System.out.print("Enter the length of a cylinder: ");
		double length = input.nextDouble();

		// Comput the area and volume 
		double area = radius * radius * PI;
		double volume = area * length;

		// Display results
		System.out.println("The area is " + area);
		System.out.println("The volume is " + volume);
	}
}
