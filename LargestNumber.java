package Exercise;
import java.util.Scanner;

public class LargestNumber {
	private int number;
	
	public void getLargestNumber() {
		int counter = 0;
		int largest = 0;
		
		Scanner input = new Scanner(System.in);
		
		while (counter < 10) {
			
			System.out.print("Enter other number numbers: ");
			number = input.nextInt();
			++counter;
		if (number > largest) {
			largest = number;
		}
		
		}
		
		System.out.println("The largest number is: " + largest);
	}
}

