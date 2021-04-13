package food;
import java.util.ArrayList;
import java.util.Scanner;

public class Food {
	protected FoodKind kind = FoodKind.Processed;
	protected String name;
	protected int id;
	protected String type;
	
	public Food() {
		
	}
	
	public Food(String name, int id, String type) {
		this.name=name;
		this.id=id;
		this.type=type;
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

	public void setType(String type) {
		this.type = type;
	}
		
	public void printInfo() {
		System.out.println("name:"+name+" id:"+id+" type:"+type);
	}
    
	public void getUserInput(Scanner input) {
		System.out.print("Food ID:");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Food Type:");
		String type = input.next(); 
		this.setType(type);
		
		System.out.print("Food Name:");
		String name = input.next();
		this.setName(name);
	}
	
}
