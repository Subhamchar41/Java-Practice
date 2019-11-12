package com.TheMasterMindGroup.AbstractClasses;

public class Dogs extends Animals {

	private String barking;

	public Dogs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Dogs(String barking) {
		this.barking = barking;
		
	}

	public Dogs(String barking, String walk, String eat, String cuddle) {
		super(walk, eat, cuddle);
		setWalk(walk);
		setEat(eat);
		setCuddle(cuddle);
	}

	public String getBarking() {
		return barking;
	}

	public void setBarking(String barking) {
		this.barking = barking;
	}

	@Override
	public String toString() {
		return "Dogs [barking=" + barking + ", animalsDescription()=" + animalsDescription() + "]";
	}

	@Override
	public String animalsDescription() {
		// TODO Auto-generated method stub
		return "Protect the house!";
	}
	
	

	
	
	
}
