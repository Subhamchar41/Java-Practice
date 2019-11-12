package com.TheMasterMindGroup.Inheritance;

public class TestAnimals {

	public static void main(String[] args) {

		Dogs germanShepart = new Dogs();
		germanShepart.setBarking("Barking");
		germanShepart.setCuddle("Cudling");
		germanShepart.setEat("Give me Food!");
		germanShepart.setWalk("Running");
		
		System.out.println(germanShepart.toString());

		
		Dogs smallDog = new Dogs();
		smallDog.setBarking("Too small to bark");
		System.out.println(smallDog.toString());
		
		Cats littleKitty = new Cats();
		littleKitty.setMial("Miaaall");
		System.out.println(littleKitty.toString());
		
		
		
	}

}
