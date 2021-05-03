package food;
import java.util.Scanner;

public class Food {
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

	public void setType(String type) {
		this.type = type;
	}
	
	public int getExpirationdate() {
		return expirationdate;
	}

	public void setExpirationdate(int expirationdate) {
		this.expirationdate = expirationdate;
	}
		
	public void printInfo() {
		String skind="none";
		switch(this.kind) {
		case Unprocessed:
			skind="Unproc.";
			break;
		case Processed:
			skind="proc.";
			break;
		case Retort:
			skind="Retort";
			break;
		default:
		}
		
		System.out.println("kind:"+skind+" name:"+name+" id:"+id+" type:"+type+" expirationdate:"+expirationdate);
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
	
}
