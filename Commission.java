package Exercise;
import java.util.Scanner;

public class Commission {
	
	public void setMonthlyCommission() {
		double itemCounter = 0;
		double totalPrice = 0;
		double commission;
		
		System.out.print("Enter the price of the item or -1 to cancel: ");
		Scanner input = new Scanner(System.in);
		double itemPrice = input.nextDouble();
		
		while (itemPrice != -1) {
			totalPrice = itemPrice + itemPrice;
			itemCounter++;
			
			System.out.print("Enter the price of the item or -1 to cancel: ");
			itemPrice = input.nextDouble();
		}
			
			if (itemPrice != 0.0) {
				commission = 200 + (0.9 * totalPrice);
				System.out.print("The monthly commision of the employee is: " + commission);
			}
			else 
				System.out.print("No value was input");
		}

	
}
