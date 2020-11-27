import java.util.Scanner;
//modifica
public class GestRettangolo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Rettangolo rett = new Rettangolo(5, 10, 5, 5);
		
		double base;
		double altezza;
		double quota;
		
		System.out.print("Inserisci la base: ");
		base = input.nextDouble();
		rett.setBase(base);
		
		System.out.print("Inserisci l'altezza: ");
		altezza = input.nextDouble();
		rett.setAltezza(altezza);
		
		System.out.println("Il perimetro del rettangolo è: " + rett.getPerimetro());
		System.out.println("L'area del rettandolo è: " + rett.getArea());
		
		System.out.print("Il rettangolo si trova alle coordinate: (" + rett.getX() + ";" + rett.getY() + ") \ndi quante unità "
				+ "vuoi traslare il rettangolo? ");
		quota = input.nextDouble();
		rett.traslazione(quota);
		
		System.out.print("Il rettangolo ora si trova alle coordinate: (" + rett.getX() + ";" + rett.getY() + ")");

	}

}
