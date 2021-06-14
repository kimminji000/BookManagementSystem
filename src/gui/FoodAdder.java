package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import Listener.FoodAdderCancelListener;
import Listener.FoodAdderListener;
import manager.FoodManager;

public class FoodAdder extends JPanel {
	
	WindowFrame frame;
	
	FoodManager foodManager; 
	
	public FoodAdder(WindowFrame frame, FoodManager foodManager) {
		this.frame = frame;
		this.foodManager = foodManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("ID: ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);
		
		JLabel labelName = new JLabel("Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelType = new JLabel("Type: ", JLabel.TRAILING);
		JTextField fieldType = new JTextField(10);
		labelType.setLabelFor(fieldType);
		panel.add(labelType);
		panel.add(fieldType);
		
		JLabel labelExpirationdate = new JLabel("Expirationdate: ", JLabel.TRAILING);
		JTextField fieldExpirationdate = new JTextField(10);
		labelExpirationdate.setLabelFor(fieldType);
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new FoodAdderListener(fieldID, fieldName, fieldType, fieldExpirationdate, foodManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new FoodAdderCancelListener(frame));
		
		panel.add(labelExpirationdate);
		panel.add(fieldExpirationdate);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		this.add(panel);
		this.setVisible(true);
		
		
	}

}
