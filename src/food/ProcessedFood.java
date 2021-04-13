package food;

import java.util.Scanner;

public class ProcessedFood extends Food {
	
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
	}

}
