package ejerciciosCG;



import java.util.Scanner;
public class Telegrama04Ej {
	public Telegrama04Ej() {
	}
	public static void main(String[] args) {
		
		Telegrama04Ej telegrama=new Telegrama04Ej();
		char tipoTelegrama;
		int numPalabras;
		double costo;
		tipoTelegrama = telegrama.leerTipo();
		numPalabras = telegrama.leerPalabras();
		costo=telegrama.calcularTelegrama(tipoTelegrama, numPalabras);
		System.out.println("Costo del telegrama: " + costo);
	}
	//El tipo solo puede ser "O" o "U"
	//el numpalabras debe ser positivo
	public double calcularTelegrama(char tipoTelegrama, int numPalabras) {
		double costo=0;
		if(tipoTelegrama == 'O')
			if(numPalabras <= 10) costo = 25.0f;
			else costo = 25.0f + 5.0f * (numPalabras - 10);
		else 
			if(numPalabras <= 10) costo = 40.0f;
			else costo = 40.0f + 7.5f * (numPalabras - 10);
		return costo;
	}
	public int leerPalabras() {
		Scanner entrada = new Scanner(System.in);
		int numPalabras;
		// Lee el n�mero de palabras del telegrama
		System.out.println("N�mero de palabras? ");
		numPalabras = entrada.nextInt();
		return numPalabras;
	}
	public char leerTipo() {
		Scanner entrada = new Scanner(System.in);
		String sTipoTelegrama;
		char tipoTelegrama;
		// Lee el tipo de telegrama como una cadena
		System.out.println("Tipo de telegrama o/u? ");
		sTipoTelegrama = entrada.next();
		// Obten el primer caracter de la cadena
		tipoTelegrama = sTipoTelegrama.charAt(0);
		return tipoTelegrama;
	}
}
