package food;

import java.util.Scanner;

public class UnprocessedFood extends Food {
	
	public UnprocessedFood(FoodKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setFoodID(input);
		setFoodName(input);
		setFoodType(input);
		setFoodExpirationdate(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:"+skind+" name:"+name+" id:"+id+" type:"+type+" expirationdate:"+expirationdate);
	}

}
