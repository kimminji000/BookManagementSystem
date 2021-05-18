package food;
import java.util.Scanner;

import exception.TypeFormatException;

public abstract class Food implements FoodInput{
	protected FoodKind kind = FoodKind.Processed;
	protected String name;
	protected int id;
	protected String type;
	protected int expirationdate;
	
	public Food() {
		
	}
	
	public Food(FoodKind kind) {
		this.kind=kind;
	}
	
	public Food(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	public Food(String name, int id, String type, int expirationdate) {
		this.name=name;
		this.id=id;
		this.type=type;
		this.expirationdate=expirationdate;
	}
	
	public Food(FoodKind kind, String name, int id, String type, int expirationdate) {
		this.kind=kind;
		this.name=name;
		this.id=id;
		this.type=type;
		this.expirationdate=expirationdate;
	}
	
	public FoodKind getKind() {
		return kind;
	}

	public void setKind(FoodKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) throws TypeFormatException {
		if (!type.contains(".") && !type.equals("")) {
			throw new TypeFormatException();
		}
		
		this.type = type;
	}
	
	public int getExpirationdate() {
		return expirationdate;
	}

	public void setExpirationdate(int expirationdate) {
		this.expirationdate = expirationdate;
	}
		
	public abstract void printInfo();

	public void setFoodID(Scanner input) {
		System.out.print("Food ID:");
		int id = input.nextInt();
		this.setId(id);
	}
	
	public void setFoodName(Scanner input) {
		System.out.print("Food Name:");
		String name = input.next();
		this.setName(name);
	}
	
	public void setFoodType(Scanner input) {
		String type = "";
		while(!type.contains(".")) {
			System.out.print("Food Type:");
			type = input.next();
			try {
				this.setType(type);
			} catch (TypeFormatException e) {
				System.out.println("Incorrect Type Format. Put the Type that contains \'.\' ");
			}
		}
	}
	
	public void setFoodExpirationdate(Scanner input) {
		System.out.print("Food Expirationdate:");
		int expirationdate = input.nextInt();
		this.setExpirationdate(expirationdate);
	}
	
	public String getKindString() {
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
		return skind;
	}
}
