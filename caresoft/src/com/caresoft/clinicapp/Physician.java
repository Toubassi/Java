package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	private int IDcopy;
	
	// TO DO: Constructor that takes an IDcopy
	Physician(int id){
		this.id = id;
		this.patientNotes = new ArrayList<String>();

	}
    // TO DO: Implement HIPAACompliantUser!
	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		if (pin < 1000 || pin > 9999) {
	        return false;
	    }

	    setPin(pin);
	    return true;
	}
	
	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		return id != null && id.equals(confirmedAuthID);
	}
	
	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
	// TO DO: Setters & Getters
	public int getIDcopy() {
		return IDcopy;
	}
	public void setIDcopy(int iDcopy) {
		IDcopy = iDcopy;
	}


	

	
	
}

