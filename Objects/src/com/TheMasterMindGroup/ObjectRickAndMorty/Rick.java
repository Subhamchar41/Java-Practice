package com.TheMasterMindGroup.ObjectRickAndMorty;

public class Rick {

	public Boolean isDrinking;
	public Boolean isNeggingJery;
	public Boolean isOnAdventure;
	
	
	public Rick() {
		isDrinking = true;
		isNeggingJery = true;
		isOnAdventure = false;
	}
	
	public Rick(Boolean isDrinking, Boolean isNeggingJery,Boolean isOnAdventure) {
		
		this.isDrinking = isDrinking;
		this.isNeggingJery = isNeggingJery;
		this.isOnAdventure = isOnAdventure;
	}

	public Boolean getIsDrinking() {
		return isDrinking;
	}

	public void setIsDrinking(Boolean isDrinking) {
		this.isDrinking = isDrinking;
	}

	public Boolean getIsNeggingJery() {
		return isNeggingJery;
	}

	public void setIsNeggingJery(Boolean isNeggingJery) {
		this.isNeggingJery = isNeggingJery;
	}

	public Boolean getIsOnAdventure() {
		return isOnAdventure;
	}

	public void setIsOnAdventure(Boolean isOnAdventure) {
		this.isOnAdventure = isOnAdventure;
	}

	@Override
	public String toString() {
		return "Rick [isDrinking=" + isDrinking + ", isNeggingJery=" + isNeggingJery + ", isOnAdventure="
				+ isOnAdventure + "]";
	}


	
	
	
	
	
}
