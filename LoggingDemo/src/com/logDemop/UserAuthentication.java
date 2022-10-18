package com.logDemop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class UserAuthentication {

	Log logger=LogFactory.getLog(UserAuthentication.class);
	
	public void loginUser(String username, String password){
	
		if(username.isBlank()) {
			logger.info("Username is blank");
			throw new RuntimeException("user invalid");
		}
	}
}