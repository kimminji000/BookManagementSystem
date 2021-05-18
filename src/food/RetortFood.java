package food;

import java.util.Scanner;

import exception.TypeFormatException;

public class RetortFood extends GoodFood {
	
	protected String beforeprocessingtype;
	
	public RetortFood(FoodKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setFoodID(input);
		setFoodName(input);
		setFoodTypewithYN(input);
		setFoodbeforeprocessingtypewithYN(input);
		setFoodExpirationdate(input);
	}
	
	public void setFoodbeforeprocessingtypewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'y'&& answer != 'N' && answer != 'n'){	
			System.out.print("Do you have a before processing food Type? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'Y' || answer == 'y') {
					setFoodType(input); 
					break;
				}
				else if (answer== 'N' || answer == 'n') {
					this.setType("");
					break;
				}
				else {		
				}
			}
			catch(TypeFormatException e) {
				System.out.println("Incorrect Type Format. Put the Type that contains \'.\' ");
			}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:"+skind+" name:"+name+" id:"+id+" type:"+type+" expirationdate:"+expirationdate+" before processing type:"+beforeprocessingtype);
	}
	
}
