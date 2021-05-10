package food;

import java.util.Scanner;

public interface FoodInput {
	
	public int getId();
	
	public void setId(int id);
	
	public void setName(String name);
	
	public void setType(String type);
	
	public void setExpirationdate(int expirationdate);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();

}
