
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
	
	public void printInfo() {
		System.out.println("name:"+name+"id:"+id+"type:"+type);
	}

}
