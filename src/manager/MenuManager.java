package manager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import gui.WindowFrame;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
    	FoodManager foodManager = getObject("foodmanager.fer");
    	if(foodManager==null) {
    		foodManager = new FoodManager(input);
    	}
    	else {
    		foodManager.setScanner(input);
    	}
    	
    	WindowFrame frame = new WindowFrame(foodManager); 
    	selectMenu(input, foodManager);
    	putObject(foodManager, "foodmanager.fer");
	}
	
	public static void selectMenu(Scanner input, FoodManager foodManager) {
		int num = -1 ;
		while (num != 5) {
			try {
			    showMenu();
			    num = input.nextInt();
			    switch(num) {
			    case 1:
				    foodManager.addFood();
				    logger.log("add a food");
				    break;
			    case 2:
				    foodManager.deleteFood();
				    logger.log("delete a food");
				    break;
			    case 3:
				    foodManager.editFood();
				    logger.log("edit a food");
			    	break;
			    case 4:
		    		foodManager.viewFoods();
		    		logger.log("view a list of food");
			    	break;
			    default:
			    	continue;
		    	} 
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("*** Food Management Menu ***");
		System.out.println("1. Add Food");
		System.out.println("2. Delete Food");
		System.out.println("3. Edit Food");
		System.out.println("4. View Foods");
		System.out.println("5. Exit");
		System.out.println("Selsct one number between 1-5");			
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
