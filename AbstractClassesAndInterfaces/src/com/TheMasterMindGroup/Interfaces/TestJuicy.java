package com.TheMasterMindGroup.Interfaces;

public class TestJuicy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object[] objectsFruits = {new Apples(), new Bananas(), new Grepefruits(), new Lemons(), new Oranges()};
		
		for(int i=0; i<objectsFruits.length; i++) {
			
			if(objectsFruits[i] instanceof Juicy) {
				System.out.println((((Juicy)objectsFruits[i]).makeFresh()));
				
			}

		}
		
	}

}
