package com.TheMasterMindGroup.Methods;

public class MaxValuesMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstValue = 111;
		int secondValue = 222;
		
		int result = maxValue(firstValue, secondValue);
//		System.out.println("The Max is : " + result);
		
		
		double firstValueDouble = 166.6;
		double secondValueDouble = 144.7;
		
		double resultDouble = maxValue(firstValueDouble,secondValueDouble);
		
		System.out.println("The max in double is: " + resultDouble);
		
		
		
	}

	
	public static int maxValue(int firstParam, int secondParam) {
		
		int result;
		
		if(firstParam > secondParam) {
			result = firstParam;
		} else {
			result = secondParam;
		}
		
		return result;
		
		
	}
	
	public static double maxValue(double firstParam, double secondParam) {
		
		double result;
		
		if(firstParam > secondParam) {
			result = firstParam;
		} else {
			result = secondParam;
		}
		
		return result;
		
		
	}
	
}
