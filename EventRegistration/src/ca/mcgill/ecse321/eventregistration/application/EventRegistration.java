package ca.mcgill.ecse321.eventregistration.application;

import ca.mcgill.ca.ecse321.eventregistration.view.EventRegistrationPage;

public class EventRegistration {

	public static void main(String[] args) {

		//start UI
		java.awt.EventQueue.invokeLater(new Runnable(){
			public void run(){
				new EventRegistrationPage().setVisible(true);
			}
		});
	}
}
