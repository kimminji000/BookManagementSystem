package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exception.TypeFormatException;
import food.Food;
import food.FoodInput;
import food.FoodKind;
import food.UnprocessedFood;
import manager.FoodManager;

public class FoodAdderListener implements ActionListener {
    JTextField fieldID;
	JTextField fieldName;
	JTextField fieldType;
	JTextField fieldExpirationdate;
	
	FoodManager foodManager;
	
	public FoodAdderListener(
			JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldType,
			JTextField fieldExpirationdate, FoodManager foodManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldType = fieldType;
		this.fieldExpirationdate = fieldExpirationdate;
		this.foodManager = foodManager;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		FoodInput food = new UnprocessedFood(FoodKind.Unprocessed);
		try {
			food.setId(Integer.parseInt(fieldID.getText()));
			food.setName(fieldName.getText());
			food.setType(fieldType.getText());
			food.setExpirationdate(Integer.parseInt(fieldExpirationdate.getText()));
		    foodManager.addFood(food);
		    putObject(foodManager, "foodmanager.fer");
			food.printInfo();
		} catch (TypeFormatException e1) {
			e1.printStackTrace();
		}
				
	}

	public static void putObject(FoodManager foodManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(foodManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
