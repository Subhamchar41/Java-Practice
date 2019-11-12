package com.TheMasterMindGroup.Inheritance;

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
		return "Dogs [barking=" + barking + ", getWalk()=" + getWalk() + ", getEat()=" + getEat() + ", getCuddle()="
				+ getCuddle() + "]";
	}
	
	
	
	
	
}
