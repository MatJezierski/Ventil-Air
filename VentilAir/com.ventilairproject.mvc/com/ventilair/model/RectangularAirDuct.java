package com.ventilair.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RectangularAirDuct {
	
	@NotNull(message="is required")
	@Size(min=100, message="is required")
	private int width;
	
	@NotNull(message="is required")
	@Size(min=100, message="is required")
	private int height;
	
	@NotNull(message="is required")
	private int length;
	
	private int mass;
	private double circuit;
	private double area;
	
	private String tightnessClass;
	private String resistanceClass;
	
	
	public double calculateTheCircuit(int width, int height) {
		
		 circuit = 2*width + 2*height;
		 circuit /= 1000;
		 
		 return circuit;		
	}
	
	public double calculateTheArea(double circuit, int length) {
		
		area = circuit * length;
		area = Math.round(area);
		area /= 1000;
		
		return area;
	}
	
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getMass() {
		return mass;
	}
	public void setMass(int mass) {
		this.mass = mass;
	}
	public String getTightnessClass() {
		return tightnessClass;
	}
	public void setTightnessClass(String tightnessClass) {
		this.tightnessClass = tightnessClass;
	}
	public String getResistanceClass() {
		return resistanceClass;
	}
	public void setResistanceClass(String resistanceClass) {
		this.resistanceClass = resistanceClass;
	}

	public double getCircuit() {
		return circuit;
	}

	public double getArea() {
		return area;
	}
}
