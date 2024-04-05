package ejercicioDos;

import java.time.LocalDate;

public class TiendaCoches {
	// El valor por defecto de riesgo es 0

	private int riesgo;

	//Este método es private. funciona. no hay que probarlo
	/**
	 * Calcula los año que tiene un coche hasta el anno actual
	 * 
	 * @param anno
	 *            año de fabricacion
	 * @return la antiguedad en años del coche. Si el año es posterior a 2013 o
	 *         la antiguedad mayor que 20 años retorna -1
	 */
	private int calculaAntiguedad(int anno) {
		int antiguedad = -1;
		int year = LocalDate.now().getYear();
		if (anno < year)
			antiguedad = year - anno;
		if (antiguedad > 20)
			return -1;
		else
			return antiguedad;
	}

	/**
	 * Calcula el valor del coche dependiendo de su potencia, antigüedad y kilometraje
	 * Cada caballo vale 100€, El kilometraje resta valor al coche segun un coefienciente
	 * que divide los km entre 200.000. Cada año de antiguedad resta un 5% del valor
	 * del coche al que ya hemos descontado la devaluacion por kilometraje
	 *  
	 * @param potencia valor entre 80 y 250, otro valor retorna -1
	 * @param numeroKilometros el número de km del coche
	 * @param anno numero entre 1993 y 2012, otro numero retorna -1
	 * @return el valor final calculado o -1 si no se cumplen las condiciones expuestas
	 */
	public double valorarCoche(int potencia, long numeroKilometros, int anno) {
		int minPotencia=80;
		int maxPotencia=250;
		int minKilometros=1;
		int base=100;
		if (numeroKilometros < minKilometros)
			return -1;
		if (potencia >= minPotencia && potencia <= maxPotencia) {
			long valorBase = potencia * base;
			int maxKilometros=200000;
			double constanteKilometraje = (double) numeroKilometros / maxKilometros;
			double valorConKilometraje = (double) valorBase
					- ((double) valorBase * constanteKilometraje);
			int antiguedad = calculaAntiguedad(anno);
			if (antiguedad != -1) {
				int maxAntiguedad=5;
				double coeficienteDevaluacionPorAntiguedad = ((double) antiguedad * maxAntiguedad) / base;
				double valorFinal = valorConKilometraje
						- (valorConKilometraje * coeficienteDevaluacionPorAntiguedad);
				return valorFinal;
			} else
				return -1;
		} else
			return -1;
	}

	/**
	 * Metodo que no debéis probar. comprueba si el tipo es una g o una d
	 * 
	 * @param tipo un caracter
	 * @return true si es una g o una d y false en caso contrario
	 */
	private boolean validarCaracterGoD(char tipo) {
		if (tipo == 'D' || tipo == 'd')
			return true;
		if (tipo == 'G' || tipo == 'g')
			return true;
		return false;
	}

	/**
	 * Comprueba si tipo es una g
	 * @param tipo caracter
	 * @return true si es una g o false en caso contrario
	 */
	private boolean esGasolina(char tipo) {
		if (tipo == 'G' || tipo == 'g')
			return true;
		return false;
	}

	/**
	 * Calcula los impuestos que un coche debe pagar dependiendo de su potencia
	 * y tipo de combustible. cuando el vehiculo es de gasolina incrementa el impuesto
	 * en un 10%. los tramos de impuestos son:
	 * 500€ entre 80 y 105cv
	 * 2000€ entre 106 y 180cv
	 * 4000€ entre 181 y 250cv
	 * @param tipoCombustible 'g' si es gasolina o 'd' si es de diesel
	 * @param potencia valor que condiciona el impuesto, debe estar entre 80 y 250
	 * @return
	 */
	public double tasarImpuestos(char tipoCombustible, int potencia) {
		int potenciaA=80,potenciaB=105,potenciaC=180,potenciaD=250;
		double totalImpuestos = -1;
		if (validarCaracterGoD(tipoCombustible)) {
			if (potencia >= potenciaA && potencia <= potenciaB) {
				totalImpuestos = 500;
			}
			if (potencia >= potenciaB+1 && potencia <= potenciaC) {
				totalImpuestos = 2000;
			}
			if (potencia >= potenciaC+1 && potencia <= potenciaD) {
				totalImpuestos = 4000;
			}
			if (esGasolina(tipoCombustible))
				totalImpuestos -= totalImpuestos * 0.1;
		}
		return totalImpuestos;
	}

	/**
	 * Calcula la viabilidad de un prestamo. Divide el valorCoche entre 60. Si el porcentaje
	 * especificado en la propiedad de la clase, riesgo, de la rentaBruta del comprador es
	 * superior a este calculo, el prestamo es viable 
	 * @param rentaBruta renta bruta mensual del trabajador
	 * @param valorCoche valor total del coche
	 * @return true si cumple con los requisitos especificados y con el valor de riesgo o 
	 * false en caso contrario
	 */
	public boolean validarPrestamo(double rentaBruta, double valorCoche) {
		System.out
				.println("debe poner el riesgo entre 5 y 30 siendo 5 el más bajo");
		// se paga en cinco años 60 cuotas
		double cuota = valorCoche / 60;
		if ((rentaBruta * riesgo) / 100 > cuota)
			return true;
		else
			return false;

	}

	// Getters & Setters
	public int getRiesgo() {
		return riesgo;
	}

	public void setRiesgo(int riesgo) {
		this.riesgo = riesgo;
	}
}
