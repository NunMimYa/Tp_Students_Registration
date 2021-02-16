package com.m2iformation.TPEcole;

public class Elève {
	private String firstname;
	private String lastname;
	private int old;
	private int year;
	private String dicipline;
	
	public Elève(String firstname, String lastname, int old, int year, String dicipline) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.old = old;
		this.year = year;
		this.dicipline = dicipline;
	}

	public final String getFirstname() {
		return firstname;
	}

	public final void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public final String getLastname() {
		return lastname;
	}

	public final void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public final int getOld() {
		return old;
	}

	public final void setOld(int old) {
		this.old = old;
	}

	public final int getYear() {
		return year;
	}

	public final void setYear(int year) {
		this.year = year;
	}

	public final String getDicipline() {
		return dicipline;
	}

	public final void setDicipline(String dicipline) {
		this.dicipline = dicipline;
	}

	@Override
	public String toString() {
		return "Elève [firstname=" + firstname + ", lastname=" + lastname + ", old=" + old + ", year=" + year
				+ ", dicipline=" + dicipline + "]";
	}
	
	
	
	
	
	
	
	
}
