package ejerciciosCG;



import java.util.Scanner;
public class Telegrama04EjSolucion {
	public Telegrama04EjSolucion() {
	}
	public static void main(String[] args) {
		
		Telegrama04EjSolucion telegrama=new Telegrama04EjSolucion();
		char tipoTelegrama;
		int numPalabras;
		double costo = 0;
		
		tipoTelegrama = telegrama.leerTipo();
		numPalabras = telegrama.leerPalabras();
		try {
			costo=telegrama.calcularTelegrama(tipoTelegrama, numPalabras);
		} catch (TipoTelegramaException  e) {
			System.out.println("El tipo de telegrama no es valido");
		}catch (NumeroPositivoException e) {
			System.out.println("la cantidad de palabras no es correcta");
		}
		System.out.println("Costo del telegrama: " + costo);
	}
	//El tipo solo puede ser "O" o "U"
	//el numpalabras debe ser positivo
	public double calcularTelegrama(char tipoTelegrama, int numPalabras) throws TipoTelegramaException, NumeroPositivoException {
		tipoTelegrama = Character.toUpperCase(tipoTelegrama);
		if(tipoTelegrama!='U'&& tipoTelegrama!='O') throw new TipoTelegramaException();
		if(numPalabras<=0) throw new NumeroPositivoException();
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
