package com.driving;

public class DrivingL {
	
	  String name;
	  Integer age;
	 boolean policeVerification;
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public boolean isPoliceVerification() {
		return policeVerification;
	}
	public void setPoliceVerification(boolean policeVerification) {
		this.policeVerification = policeVerification;
	}
	public boolean isMedical() {
		return medical;
	}
	public void setMedical(boolean medical) {
		this.medical = medical;
	}
	@Override
	public String toString() {
		return "DrivingL [name=" + name + ", age=" + age + ", policeVerification=" + policeVerification + ", medical="
				+ medical + "]";
	}
	public DrivingL(String name, Integer age, boolean policeVerification, boolean medical) {
		super();
		this.name = name;
		this.age = age;
		this.policeVerification = policeVerification;
		this.medical = medical;
	}
	 boolean medical;
	public boolean getMedical() {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean getPoliceVerification() {
		// TODO Auto-generated method stub
		return false;
	}
}