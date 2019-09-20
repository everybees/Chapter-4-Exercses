package Exercise;
import java.util.Scanner;

public class SalaryCalculator {
	private String name;
	private double hours;
	private double hourlyRates;
	private double grossPay;
	
	public void calculateGrossPay() {
		System.out.print("Enter the Employee name: ");
		Scanner input = new Scanner(System.in);
		name = input.nextLine();
		
		System.out.print("Enter number of hours worked by the Employee: ");
		hours = input.nextDouble();
		
		System.out.print("Enter hourly rates for your Employees: ");
		hourlyRates = input.nextDouble();
		
		if (hours < 40.0) {
			grossPay = (hourlyRates * hours);
			System.out.println("The amount payable to this Employee is: " + grossPay);
		}
		else if (hours > 40.0) {
			grossPay = (hourlyRates * 40) + ((hours - 40) * hourlyRates / 2);
			System.out.println("The amount payable to this Employee is: " + grossPay);
		}
		else if (hours == 40) {
			grossPay = hourlyRates * 40;
			System.out.println("The amount payable to this Employee is: " + grossPay);
		}
	}
}
