package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer id;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    AdminUser(Integer id, String role){
    	this.id = id;
    	this.role = role;
    	this.securityIncidents = new ArrayList<>();
    }
    // TO DO: Implement HIPAACompliantUser!
    
    @Override
    public boolean assignPin(int pin) {
        if (pin < 100000) {
            return false;
        }

        setPin(pin);
        return true;
    }
	
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
	    if (id != null && id.equals(confirmedAuthID)) {
	        return true;
	    }
	    authIncident();
	    return false;
	}
    
    // TO DO: Implement HIPAACompliantAdmin!
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return securityIncidents;
	}
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }


    // TO DO: Setters & Getters
	public Integer getEmployeeID() {
		return id;
	}


	public void setEmployeeID(Integer id) {
		this.id = id;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}

	
    
}
