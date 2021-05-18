package food;

import java.util.Scanner;

import exception.TypeFormatException;

public abstract class GoodFood extends Food {

	public GoodFood(FoodKind kind) {
		super(kind);
	}
	
	public abstract void getUserInput(Scanner input);

	public void printInfo() {
		String skind = getKindString();		
		System.out.println("kind:"+skind+" name:"+name+" id:"+id+" type:"+type+" expirationdate:"+expirationdate);
	}
	
	public void setFoodTypewithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'y'&& answer != 'N' && answer != 'n')
		{	
			System.out.print("Do you have a Food Type? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'Y' || answer == 'y') {
					System.out.print("Food Type:");
					String type = input.next(); 
					this.setType(type);
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

}
