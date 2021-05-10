package food;

import java.util.Scanner;

public class RetortFood extends Food implements FoodInput {
	
	public RetortFood(FoodKind kind) {
		super(kind);
	}
	
	protected String beforeprocessingtype;
	
	public void getUserInput(Scanner input) {
		System.out.print("Food ID:");
		int id = input.nextInt();
		this.setId(id);
			
		System.out.print("Food Name:");
		String name = input.next();
		this.setName(name);
		
		char answer = 'x';
		while (answer != 'Y' && answer != 'y'&& answer != 'N' && answer != 'n')
		{	
			System.out.print("Do you have a Food Type? (Y/N)");
			answer = input.next().charAt(0);
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
		
		answer = 'x';
		while (answer != 'Y' && answer != 'y'&& answer != 'N' && answer != 'n')
		{	
			System.out.print("Do you have a before processing food Type? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.print("Before processing food Type:");
				beforeprocessingtype = input.next(); 
				break;
			}
			else if (answer== 'N' || answer == 'n') {
				beforeprocessingtype = "";
				break;
			}
			else {		
			}
		}
		
		
		System.out.print("Food Expirationdate:");
		int expirationdate = input.nextInt();
		this.setExpirationdate(expirationdate);
	}

	public void printInfo() {
		String skind="none";
		switch(this.kind) {
		case Unprocessed:
			skind="Unproc.";
			break;
		case Processed:
			skind="Proc.";
			break;
		case Retort:
			skind="Retort";
			break;
		default:
		}
		
		System.out.println("kind:"+skind+" name:"+name+" id:"+id+" type:"+type+" expirationdate:"+expirationdate+" before processing type:"+beforeprocessingtype);
	}
	
}
