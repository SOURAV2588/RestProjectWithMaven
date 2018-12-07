package com.sourav.RestProjectWithMaven;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DSEmployee {
	
	private String firstName;
	private String lastName;
	private String trigramId;
	private String teamName;
	private String brand;
	
	public DSEmployee() {
	}

	public DSEmployee(String firstName, String lastName, String trigramId, String teamName, String brand) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.trigramId = trigramId;
		this.teamName = teamName;
		this.brand = brand;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTrigramId() {
		return trigramId;
	}

	public void setTrigramId(String trigramId) {
		this.trigramId = trigramId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}
