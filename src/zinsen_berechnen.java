import java.util.Scanner;
import java.lang.Math;
public class zinsen_berechnen {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Geben Sie das investierte Kapital in € ein: ");
            double kapital = input.nextDouble();

            System.out.print("Geben Sie den vereinbarten Zinssatz pro Jahr in Prozent ein: ");
            double zinssatzProzent = input.nextDouble();

            System.out.print("Geben Sie die vereinbarte Laufzeit in Jahren (nur ganze Jahre) ein: ");
            int laufzeitJahre = input.nextInt();
            double zinssatz = zinssatzProzent / 100.0; // Umrechnung des Prozentsatzes in einen Dezimalwert

            double kn = kapital * (Math.pow(1 + zinssatz, laufzeitJahre));
            double zinsen = kn - kapital;

            System.out.println("Der durch Zinsen erwirtschaftete Betrag nach " + laufzeitJahre + " Jahren beträgt: " + zinsen + " €");
            System.out.println("Das nach " + laufzeitJahre + " Jahren angesparte Gesamtkapital beträgt: " + kn + " €");
            input.close();

        }

}
