import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import food.Food;
import food.FoodInput;
import food.FoodKind;
import food.ProcessedFood;
import food.RetortFood;
import food.UnprocessedFood;

public class FoodManager {
	ArrayList<FoodInput> foods = new ArrayList<FoodInput>();	
	Scanner input;
	FoodManager(Scanner input){
		this.input = input;	
	}

	public void addFood() {
		int kind = 0;
		FoodInput foodInput;
		while (kind < 1 || kind > 3) {
			try {
			    showaddMenu();
			    kind = input.nextInt();
			    switch(kind) {
			    case 1:
			    	foodInput = new UnprocessedFood(FoodKind.Unprocessed);
				    foodInput.getUserInput(input);
			    	foods.add(foodInput);
			    	break;
		    	case 2:
			    	foodInput = new ProcessedFood(FoodKind.Processed);
		        	foodInput.getUserInput(input);
			    	foods.add(foodInput);
			    	break;
		    	case 3:
		    		foodInput = new RetortFood(FoodKind.Retort);
		        	foodInput.getUserInput(input);
			    	foods.add(foodInput);
			    	break;
			    default:
		    		System.out.println("Select num for Food KInd between 1 - 3:");
				    continue;
			    }
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void showaddMenu() {
		System.out.println("1.for Unprocessed");
		System.out.println("2.for Processed");
		System.out.println("3.for Retort");
		System.out.print("Select num 1, 2, or 3 for Food KInd:");
	}
	
	public void deleteFood() {
		System.out.print("Food ID:");
		int foodId = input.nextInt();
		int index = findIndex(foodId);
		removefromFoods(index, foodId);
	}
	
	public int findIndex(int foodId) {
		int index = -1;
		for (int i = 0; i<foods.size(); i++) {
			if(foods.get(i).getId() == foodId) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromFoods(int index, int foodId) {
		if(index >= 0) {
			foods.remove(index);
			System.out.println("the food " + foodId + "is deleted");
			return 1;
		}
		else {
			System.out.println("the food has not been reistered");
			return -1;
		}
	}
		
    public void editFood() {
		System.out.print("Food ID:");
		int foodId = input.nextInt();	
		for (int i = 0; i<foods.size(); i++) {
			FoodInput food = foods.get(i);
			if(food.getId() == foodId) {
				int num = 0 ;
				while (num != 5) {
					showEditMenu();
					num = input.nextInt();			
					switch(num) {
					case 1:
						food.setFoodID(input);
						break;
					case 2:
						food.setFoodName(input);
						break;
					case 3:
						food.setFoodType(input);
						break;
					case 4:
						food.setFoodExpirationdate(input);
						break;
					default:
						continue;
					}//switch
				}//while 
				break;
			}//if
	    }//for
	}	
	
	public void viewFoods() {
		System.out.println("# of registered foods: " + foods.size());
		for (int i = 0; i<foods.size(); i++) {
			foods.get(i).printInfo();
		}
	}	
		
	public void showEditMenu() {
		System.out.println("** Food Info Edit Menu **");
		System.out.println("1. Edit Id");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Type");
		System.out.println("4. Edit Expiration date");
		System.out.println("5. Exit");
		System.out.println("Selsct one number between 1-5");
	}

}
