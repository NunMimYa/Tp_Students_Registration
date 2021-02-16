package com.m2iformation.TPEcole;

import java.util.ArrayList;

public class Cours {
	private String name;
	private int hours;
	private int year;
//	private El�ve[] ele;
	private ArrayList<El�ve> ele;
	
	public Cours(String name, int hours, int year, ArrayList<El�ve> ele) {
		super();
		this.name = name;
		this.hours = hours;
		this.year = year;
		this.ele = ele;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getHours() {
		return hours;
	}
	public final void setHours(int hours) {
		this.hours = hours;
	}
	public final int getYear() {
		return year;
	}
	public final void setYear(int year) {
		this.year = year;
	}
	public final ArrayList<El�ve> getEle() {
		return ele;
	}
	public final void setEle(ArrayList<El�ve> ele) {
		this.ele = ele;
	}
	@Override
	public String toString() {
		return "Cours [name=" + name + ", hours=" + hours + ", year=" + year + ", ele=" + ele + "]";
	}
	
	
	

	
	
	
	
}
