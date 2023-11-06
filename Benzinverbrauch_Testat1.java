import java.util.Scanner;
public class Benzinverbrauch_Testat1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		final double dva = 5.4f;
		final double dvb = 9.8f;
		double kmAutoA = sc.nextDouble();
		double kmAutoB = sc.nextDouble();
		double benzinverbrauchA;
		double benzinverbrauchB;
		
		if (kmAutoA > 0 && kmAutoB > 0 && kmAutoA < 960 && kmAutoB < 960) {
			benzinverbrauchA = ((dva * kmAutoA) * 365);
			benzinverbrauchB = ((dva * kmAutoA) * 365);
			System.out.println("Verbrauch A im Jahr: " + benzinverbrauchA + " Liter" + " Verbrauch B im Jahr: " + benzinverbrauchB + " Liter");
		}else {
			System.out.println("Eingabefehler");
		}
		
		
	}
}
