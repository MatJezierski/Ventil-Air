package com.ventilair.model;

import javax.validation.constraints.NotNull;

public class CircularAirDuct {

	@NotNull(message="is required")
	private int diameter;
	
	@NotNull(message="is required")
	private int length;
	
	private int mass;
	private double circuit;
	private double area;
	
	private String tightnessClass;
	private String resistanceClass;
	
	
	public double calculateTheCircuit(int diameter) {
		
		double pi = Math.PI;
				pi = Math.round(pi);
				pi /= 100;
		
		double circuit = pi * diameter;	
			   circuit = Math.round(circuit);
			   circuit /= 100;
				
		 return circuit;		
	}
	
	public double calculateTheArea(double circuit, int length) {
		
		area = circuit * length;
		area = Math.round(area);
		area /= 1000;
		
		return area;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
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
