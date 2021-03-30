import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
	    int num = 0;
	    Scanner input = new Scanner(System.in);
	    
		while (num != 6) {
			System.out.println("*** Food Management Menu ***");
			System.out.println("1. Add Foods");
			System.out.println("2. Delete Foods");
			System.out.println("3. Edit Foods");
			System.out.println("4. View Foods");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Selsct one number between 1-6");
			num = input.nextInt();			
			switch(num) {
			case 1:
				addFood();
				break;
			case 2:
				deleteFood();
				break;
			case 3:
				editFood();
				break;
			case 4:
				viewFood();
				break;
			}
		}
	}
	
	public static void addFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Food ID:");
		int foodID = input.nextInt();
		System.out.print("Food Type:");
		String foodType = input.next();
		System.out.print("Food Name:");
		String foodName = input.next();
	}
	
	public static void deleteFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Food ID:");
		int foodID = input.nextInt();
	}
		
	public static void editFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Food ID:");
		int foodID = input.nextInt();		
		
	}
	
	public static void viewFood() {
		Scanner input = new Scanner(System.in);
		System.out.print("Food ID:");
		int foodID = input.nextInt();
	}	

}
