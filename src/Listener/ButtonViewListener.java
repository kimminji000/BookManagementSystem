package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.FoodViewer;
import gui.WindowFrame;
import manager.FoodManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FoodViewer foodViewer= frame.getFoodviewer();
		FoodManager foodManager = getObject("foodmanager.fer");
		foodViewer.setFoodManager(foodManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(foodViewer);
		frame.revalidate();
		frame.repaint();
	}

	public static FoodManager getObject(String filename) {
		FoodManager foodManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			foodManager = (FoodManager)in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return foodManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return foodManager;	
	}
}
