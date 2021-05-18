package food;

import java.util.Scanner;

import exception.TypeFormatException;

public interface FoodInput {
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setType(String type) throws TypeFormatException;
	
	public void setExpirationdate(int expirationdate);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setFoodID(Scanner input);
	
	public void setFoodName(Scanner input);

	public void setFoodType(Scanner input);
		
	public void setFoodExpirationdate(Scanner input);
}
