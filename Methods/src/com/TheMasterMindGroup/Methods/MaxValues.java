package com.TheMasterMindGroup.Methods;

public class MaxValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstValue = 111;
		int secondValue = 222;
		
		
		
		int result = maxValue(firstValue, secondValue);
		System.out.println("The Max is : " + result);
		
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
}
