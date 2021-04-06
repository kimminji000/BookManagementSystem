import java.util.Scanner;

public class FoodManager {
	Food food;	
	Scanner input;
	FoodManager(Scanner input){
		this.input=input;	
	}

	public void addFood() {
		food = new Food();
		System.out.print("Food ID:");
		food.id = input.nextInt();
		System.out.print("Food Type:");
		food.type = input.next();
		System.out.print("Food Name:");
		food.name = input.next();
	}
	
	public void deleteFood() {
		System.out.print("Food ID:");
		int foodId = input.nextInt();
		if (food == null) {
			System.out.println("the food has not been reistered");
			return;
		}
		if(food.id == foodId) {
			food = null;
			System.out.println("the food is deleted");
		}
	}
		
    public void editFood() {
		System.out.print("Food ID:");
		int foodId = input.nextInt();		
		if(food.id == foodId) {
			System.out.println("the food to be edited is "+ foodId);
	    }
	}	
	
	public void viewFood() {
		System.out.print("Food ID:");
		int foodId = input.nextInt();
		if (food.id == foodId) {
			food.printInfo();
		}
	}	


}
