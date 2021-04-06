import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
    	FoodManager foodManager = new FoodManager(input);
	    int num = 0 ;
	    
		while (num != 5) {
			System.out.println("*** Food Management Menu ***");
			System.out.println("1. Add Foods");
			System.out.println("2. Delete Foods");
			System.out.println("3. Edit Foods");
			System.out.println("4. View Foods");
			System.out.println("5. Exit");
			System.out.println("Selsct one number between 1-5");
			num = input.nextInt();			
			switch(num) {
			case 1:
				foodManager.addFood();
				break;
			case 2:
				foodManager.deleteFood();
				break;
			case 3:
				foodManager.editFood();
				break;
			case 4:
				foodManager.viewFood();
				break;
			}
		}
	}
	
}
