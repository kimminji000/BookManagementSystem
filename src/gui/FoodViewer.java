package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import food.FoodInput;
import manager.FoodManager;

public class FoodViewer extends JPanel{
	
	WindowFrame frame;
	
	FoodManager foodManager;
	
	public FoodManager getFoodManager() {
		return foodManager;
	}

	public void setFoodManager(FoodManager foodManager) {
		this.foodManager = foodManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Type");
		model.addColumn("Expirationdate");
		
		for(int i=0; i< foodManager.size(); i++) {
			Vector row = new Vector();
			FoodInput fi = foodManager.get(i);
			row.add(fi.getId());
			row.add(fi.getName());
			row.add(fi.getType());
			row.add(fi.getExpirationdate());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public FoodViewer(WindowFrame frame, FoodManager foodManager) {
		this.frame = frame; 
		this.foodManager = foodManager;
		
		System.out.println("***" + foodManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Type");
		model.addColumn("Expirationdate");
		
		for(int i=0; i< foodManager.size(); i++) {
			Vector row = new Vector();
			FoodInput fi = foodManager.get(i);
			row.add(fi.getId());
			row.add(fi.getName());
			row.add(fi.getType());
			row.add(fi.getExpirationdate());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
