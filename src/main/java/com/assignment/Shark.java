package com.assignment;

public class Shark extends Fish {
	
	String sizeAttribute;	
	String colorAttribute;
	String behaviorAttribute;
	
	public Shark() {
		this.sizeAttribute = "Large";
		this.colorAttribute = "Grey";
		this.behaviorAttribute = "Eat other fish";
	}
	
	public String getSizeAttribute() {
		return sizeAttribute;
	}
	public void setSizeAttribute(String sizeAttribute) {
		this.sizeAttribute = sizeAttribute;
	}
	public String getColorAttribute() {
		return colorAttribute;
	}
	public void setColorAttribute(String colorAttribute) {
		this.colorAttribute = colorAttribute;
	}
	public String getBehaviorAttribute() {
		return behaviorAttribute;
	}
	public void setBehaviorAttribute(String behaviorAttribute) {
		this.behaviorAttribute = behaviorAttribute;
	}
	
	
}
