package ca.mcgill.ca.ecse321.eventregistration.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import ca.mcgill.ecse321.eventregistration.controller.EventRegistrationController;


public class EventRegistrationPage extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8955345853519870017L;

	private JTextField participantNameTextField;
	private JLabel participantNameLabel;
	private JButton addParticipantButton;
	
	/** Creates new Form EventRegistrationPage */
	public EventRegistrationPage(){
		initComponents();
		refreshData();
	}
	
	private void initComponents(){
		//elements for participant
		participantNameTextField = new JTextField();
		participantNameLabel = new JLabel();
		addParticipantButton = new JButton();
		
		//global settings and listeners
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Event Registration");
		
		participantNameLabel.setText("Name:");
		this.addParticipantButton.setText("Add Participant");
		this.addParticipantButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {

				addParticipantButtonActionPerformed(e);
			}
		});
		
		//layout
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		layout.setHorizontalGroup(
				layout.createSequentialGroup()
				.addComponent(participantNameLabel)
				.addGroup(layout.createParallelGroup()
						.addComponent(participantNameTextField, 200,200,400)
						.addComponent(addParticipantButton)));
		
		layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component []{addParticipantButton, participantNameTextField});
		
		layout.setVerticalGroup(
				layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup()
						.addComponent(participantNameLabel)
						.addComponent(participantNameTextField))
				.addComponent(addParticipantButton)
				);
		
		pack();
	}
	
	private void refreshData(){
		participantNameTextField.setText("");
	}
	
	
	private void addParticipantButtonActionPerformed(ActionEvent evt){
		//call the controller
		EventRegistrationController erc = new EventRegistrationController();
		erc.createParticipant(participantNameTextField.getText());
		
		//update visuals
		refreshData();
	}
	
	
}
