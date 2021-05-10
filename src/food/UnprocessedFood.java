package food;

import java.util.Scanner;

public class UnprocessedFood extends Food implements FoodInput {
	
	public UnprocessedFood(FoodKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Food ID:");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Food Name:");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Food Type:");
		String type = input.next(); 
		this.setType(type);
		
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
		
		System.out.println("kind:"+skind+" name:"+name+" id:"+id+" type:"+type+" expirationdate:"+expirationdate);
	}

}
