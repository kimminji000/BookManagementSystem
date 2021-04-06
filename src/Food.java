import java.util.ArrayList;

public class Food {
	String name;
	int id;
	String type;
	
	public Food() {
		
	}
	
	public Food(String name, int id, String type) {
		this.name=name;
		this.id=id;
		this.type=type;
	}
	
	public void addlist() {
		ArrayList<Food> foodlist = new ArrayList<Food>();
		foodlist.add(new Food(name, id, type));
	}
	
	public void printInfo() {
		System.out.println("name:"+name+" id:"+id+" type:"+type);
	}

}
