package com.driving;

public class MainClass {

	public static void main(String[] args) {

		DrivingL dl1 = new DrivingL("manaz", 23, true,false );
		DrivingL dl2 = new DrivingL("ujwal", 20, false,true );
		DrivingL dl3 = new DrivingL("adarsh", 22,true , true);
		DrivingL dl4 = new DrivingL("abhi", 27, false,false );
		DrivingL dl5 = new DrivingL("ashwini",10, true,true);
		
        System.out.println(application(dl1));
        System.out.println(application(dl2));
        System.out.println(application(dl3));
        System.out.println(application(dl4));
        System.out.println(application(dl5));
	}
	private static String application(DrivingL dl) {
		if(dl.getAge()>=18 && dl.getMedical() &&  dl.getPoliceVerification()) {
		return "Eligible";
	}	else 
	return"not Eligible";}


}
