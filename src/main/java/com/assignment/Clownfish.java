package com.assignment;

public class Clownfish extends Fish {
	
	String sizeAttribute;	
	String colorAttribute;
	String behaviorAttribute;
	
	public Clownfish() {
		this.sizeAttribute = "Small";
		this.colorAttribute = "Orange";
		this.behaviorAttribute = "Make jokes";
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
