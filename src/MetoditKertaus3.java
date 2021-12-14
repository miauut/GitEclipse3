
import java.util.Scanner;

public class MetoditKertaus3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String kohde;
		int lampotila;
		
		System.out.println("Valitse kohde. Kirjoita ihminen, koira tai hevonen.");
		kohde = in.nextLine();
		
		System.out.println("Anna lampotila."); 
		lampotila = Integer.parseInt(in.nextLine());
		
		tulostaKuumerajat();
		if (onkoKuumetta(kohde,lampotila)==true)
		{
			System.out.println("Kohteella on kuumetta.");
		}
		else
		{
			System.out.println("Kohteella ei ole kuumetta.");
		}
	}
	
	public static void tulostaKuumerajat()
	{
		System.out.println("Ihminen 37");
		System.out.println("Koira 39");
		System.out.println("Hevonen 38");
	}
	public static boolean onkoKuumetta(String kohde, int lampotila)
	{
		boolean kuumetta;
		
		if (kohde.equalsIgnoreCase("ihminen") && lampotila >= 37)
		{
			kuumetta=true;
		}
		else if (kohde.equalsIgnoreCase("hevonen") && lampotila >= 38)
		{
			kuumetta=true;
		}
		else if (kohde.equalsIgnoreCase("koira") && lampotila >= 39)
		{
			kuumetta=true;
		}
		else
		{
			kuumetta = false;
		}
		
		return kuumetta;
	}
} 
