package com.passport;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Application {
	
	Log logger=LogFactory.getLog(Application.class);
	 
	public boolean passportEligibility() throws InvalidAge, Nationality, CriminalRecord {
		boolean application=checkApplicationForPassport();
		return application;
		
	}
	private String name ;
	private int age;
	private String nationality;
	private String crimanalRecord;
	public Application(String name, int age, String nationality, String crimanalRecord) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.crimanalRecord = crimanalRecord;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getCrimanalRecord() {
		return crimanalRecord;
	}
	public void setCrimanalRecord(String crimanalRecord) {
		this.crimanalRecord = crimanalRecord;
	}
	@Override
	public String toString() {
		return "Application [name=" + name + ", age=" + age + ", nationality=" + nationality + ", crimanalRecord="
				+ crimanalRecord + "]";
	}
	
	 public boolean checkApplicationForPassport()throws InvalidAge, CriminalRecord,Nationality{
		 if(this.age<18) {
			 logger.info("Age is not valid");
			throw new InvalidAge("Age not valid for applying");
		}
			 
			 
		 
	 else if((this.crimanalRecord).equals("criminal")) {
		 {
				logger.info("Criminal Record not clean");
				throw new CriminalRecord(" criminal record is not clean");
			}
		 }else if((this.nationality).equals("outsider")) {
				logger.info("Nationality not accepted");

				throw new Nationality("Applicant is not Indian");
			}
	 
		return true;
		 
	 
	 }
	public String getName() {
		return name;
	}
	
	
	 }


