package food;

import java.util.Scanner;

public class ProcessedFood extends GoodFood {
	
	public ProcessedFood(FoodKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setFoodID(input);
		setFoodName(input);
		setFoodTypewithYN(input);
		setFoodExpirationdate(input);
	}
	
}
