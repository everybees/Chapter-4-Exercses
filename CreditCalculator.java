package Exercise;
import java.util.Scanner;

public class CreditCalculator {
	private int accountNumber;
	private int beginBalance;
	private int creditLimit;
	
	public void accountNumberAndBalance() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Account Number");
		accountNumber = input.nextInt();
		
		System.out.print("Enter the Starting Balance: ");
		beginBalance = input.nextInt();
		
		System.out.print("Enter the Credit Limit: ");
		creditLimit = input.nextInt();
	}
	public void itemChargesAndCredit() {
		Scanner input = new Scanner(System.in);
		int itemCharge = 0;
		int totalCharge = 0;
		int creditCharge = 0;
		int totalCredit = 0;
		System.out.print("Enter the amount charged or -1 to end: ");
		itemCharge = input.nextInt();
		System.out.print("Enter the credit charge or -1 to end: ");
		creditCharge = input.nextInt();
		
		while (itemCharge != -1 && creditCharge != -1) {
			totalCharge = itemCharge + totalCharge;
			totalCredit = totalCredit + creditCharge;
			System.out.print("Enter the charge or -1 to end: ");
			itemCharge = input.nextInt();
			System.out.print("Enter the credit charge or -1 to end: ");
			creditCharge = input.nextInt();
		}
		if (itemCharge != 0 && creditCharge != 0) {
			System.out.println(totalCharge);
			System.out.println(totalCredit);
			
			int newBalance = beginBalance + totalCharge - totalCredit;
			
			System.out.println(newBalance);
			System.out.println(totalCredit > creditLimit? "Credit Limit Exceeded" : "Thank You for Shopping with US");
		}
		else {
			System.out.print("No value was inserted");
		}
		
	}
	
	
}
