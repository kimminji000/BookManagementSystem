package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.FoodManager;

public class WindowFrame extends JFrame{

	FoodManager foodManager; 
	
	MenuSelection menuselection;
	FoodAdder foodadder;
	FoodViewer foodviewer;
		
	public WindowFrame(FoodManager foodManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My frame");
		
		this.foodManager = foodManager;
		menuselection = new MenuSelection(this);
		foodadder = new FoodAdder(this);
		foodviewer = new FoodViewer(this, this.foodManager);
		
				
		this.add(menuselection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public FoodAdder getFoodadder() {
		return foodadder;
	}

	public void setFoodadder(FoodAdder foodadder) {
		this.foodadder = foodadder;
	}

	public FoodViewer getFoodviewer() {
		return foodviewer;
	}

	public void setFoodviewer(FoodViewer foodviewer) {
		this.foodviewer = foodviewer;
	}


}
