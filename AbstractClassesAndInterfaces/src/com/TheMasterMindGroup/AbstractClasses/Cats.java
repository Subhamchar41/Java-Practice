package com.TheMasterMindGroup.AbstractClasses;

public class Cats extends Animals {

	private String mial;

	public Cats() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cats(String mial) {
		this.mial = mial;
		
	}

	public Cats(String mial, String walk, String eat, String cuddle) {
		super(walk, eat, cuddle);
		setWalk(walk);
		setEat(eat);
		setCuddle(cuddle);
	}

	public String getMial() {
		return mial;
	}

	public void setMial(String mial) {
		this.mial = mial;
	}

	@Override
	public String toString() {
		return "Cats [mial=" + mial + ", animalsDescription()=" + animalsDescription() + "]";
	}

	@Override
	public String animalsDescription() {
		// TODO Auto-generated method stub
		return "Find boxes to fit in!";
	}


	
	
	
	
}
