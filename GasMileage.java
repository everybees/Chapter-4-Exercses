package Exercise;
import java.util.Scanner;

public class GasMileage {
	private double kilometre;
	private double litre;
	private double kiloTotal = 0;
	private double litreTotal = 0;
	private int trip = 0;

	public void setKilometrePerLitre() {
		System.out.print("Enter the distance travelled or -1 to end: ");
		Scanner input = new Scanner(System.in);
		kilometre = input.nextDouble();
		System.out.println("Enter the litres of fuel consumed or -1 to end: ");
		litre = input.nextDouble();
		
		
		double kilometrePerLitre = kilometre / litre;
		System.out.printf("Your Mileage is: %.2f km/litre%n", kilometrePerLitre);
		
		while (kilometre != -1 || litre != -1) {
			kiloTotal = kiloTotal + kilometre;
			litreTotal = litre + litreTotal;
			trip++;
			System.out.print("Enter the distance travelled or -1 to end: ");
			kilometre = input.nextDouble();
			System.out.println("Enter the litres of fuel consumed or -1 to end: ");
			litre = input.nextDouble();
			
			kilometrePerLitre = kiloTotal / litreTotal;
			System.out.printf("Your Mileage is: %.2f km/litre%n", kilometrePerLitre);
			
		}
		if (kilometre != 0 && litre != 0) {
			kilometrePerLitre = kiloTotal / litreTotal;
			System.out.println("The total Distance travelled is: " + kiloTotal + " km");
			System.out.println("The total amount of fuel consumed is: " + litreTotal + " litres");
			System.out.printf("Your Mileage is: %.2f km/litre%n", kilometrePerLitre);
		}
		else
			System.out.print("No value for kilometre or litre was inserted");
	}

}
