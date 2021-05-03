import java.util.ArrayList;
import java.util.Scanner;

import food.Food;
import food.FoodKind;
import food.ProcessedFood;
import food.RetortFood;

public class FoodManager {
	ArrayList<Food> foods = new ArrayList<Food>();	
	Scanner input;
	FoodManager(Scanner input){
		this.input = input;	
	}

	public void addFood() {
		int kind = 0;
		Food food;
		while (kind != 1 && kind !=  2) {
			System.out.println("1.for Unprocessed");
			System.out.println("2.for Processed");
			System.out.println("3.for Retort");
			System.out.print("Select num 1, 2, or 3 for Food KInd:");
			kind = input.nextInt();
			if (kind == 1) {
				food = new Food(FoodKind.Unprocessed);
				food.getUserInput(input);
				foods.add(food);
				break;
			}
		    else if (kind == 2){
		    	food = new ProcessedFood(FoodKind.Processed);
		    	food.getUserInput(input);
				foods.add(food);
				break;
			}
		    else if (kind == 3){
		    	food = new RetortFood(FoodKind.Retort);
		    	food.getUserInput(input);
				foods.add(food);
				break;
			}
			else {
				System.out.print("Select num for Food KInd between 1 - 3:");
			}
		}


	}
	
	public void deleteFood() {
		System.out.print("Food ID:");
		int foodId = input.nextInt();
		int index = -1;
		for (int i = 0; i<foods.size(); i++) {
			if(foods.get(i).getId() == foodId) {
				index = i;
				break;
			}
		}
		
		if(index >= 0) {
			foods.remove(index);
			System.out.println("the food " + foodId + "is deleted");
		}
		else {
			System.out.println("the food has not been reistered");
			return;
		}
	}
		
    public void editFood() {
		System.out.print("Food ID:");
		int foodId = input.nextInt();	
		for (int i = 0; i<foods.size(); i++) {
			Food food = foods.get(i);
			if(food.getId() == foodId) {
				int num = 0 ;
				while (num != 5) {
					System.out.println("** Food Info Edit Menu **");
					System.out.println("1. Edit Id");
					System.out.println("2. Edit Name");
					System.out.println("3. Edit Type");
					System.out.println("4. Edit Expiration date");
					System.out.println("5. Exit");
					System.out.println("Selsct one number between 1-5");
					num = input.nextInt();			
					switch(num) {
					case 1:
						System.out.print("Food ID:");
						int id = input.nextInt();
						food.setId(id);
						break;
					case 2:
						System.out.print("Food Name:");
						String name = input.next();
						food.setName(name);
						break;
					case 3:
						System.out.print("Food Type:");
						String type = input.next();
						food.setType(type);
						break;
					case 4:
						System.out.print("Food Expirationdate:");
						int expirationdate = input.nextInt();
						food.setExpirationdate(expirationdate);
						break;
					}//switch
				}//while 
				break;
			}//if
	    }//for
	}	
	
	public void viewFoods() {
//		System.out.print("Food ID:");
//		int foodId = input.nextInt(); 
		System.out.println("# of registered foods: " + foods.size());
		for (int i = 0; i<foods.size(); i++) {
			foods.get(i).printInfo();
		}
	}	

}
