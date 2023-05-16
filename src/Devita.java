import java.util.Scanner;

// Chiamare la classe col proprio cognome
public class Devita
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Raggio");
		double n=scan.nextDouble();
		Cerchio a=new Cerchio(n);
		a.perimetro();
		a.area();
		a.risultati();
		
	}

}
