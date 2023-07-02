package com.bean;

public class Triangle {
	
	private float h,b;
	private String type;
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void display() {
		System.out.println("Display Triangle h=" + h +", b="+ b +", type=" + type);
	}
	
	
	

}
