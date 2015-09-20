package ca.mcgill.ecse321.eventregistration.controller;

import ca.mcgill.ca.ecse321.eventregistration.model.Participant;
import ca.mcgill.ca.ecse321.eventregistration.model.RegistrationManager;
import ca.mcgill.ca.ecse321.eventregistration.persistence.PersistenceXStream;

public class EventRegistrationController {

	public EventRegistrationController()
	{
		
	}
	
	public String createParticipant(String name)
	{
		if(name ==null || name.trim().length() ==0){
			return "Participant name cannot be empty";
		}
		Participant p = new Participant(name);
		RegistrationManager rm = RegistrationManager.getInstance();
		rm.addParticipant(p);
		PersistenceXStream.saveToXMLwithXStream(rm);
		
		return null;
	}
}
