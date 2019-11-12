package com.TheMasterMindGroup.Polymorphism;

public class Animals {

	private String walk;
	private String eat;
	private String cuddle;
	
	public Animals() {
		
	}
	
	
	public Animals(String walk, String eat, String cuddle) {
		super();
		this.walk = walk;
		this.eat = eat;
		this.cuddle = cuddle;
	}


	public String getWalk() {
		return walk;
	}


	public void setWalk(String walk) {
		this.walk = walk;
	}


	public String getEat() {
		return eat;
	}


	public void setEat(String eat) {
		this.eat = eat;
	}


	public String getCuddle() {
		return cuddle;
	}


	public void setCuddle(String cuddle) {
		this.cuddle = cuddle;
	}


	@Override
	public String toString() {
		return "Animals [walk=" + walk + ", eat=" + eat + ", cuddle=" + cuddle + "]";
	}
	
	
	
	
	
}
