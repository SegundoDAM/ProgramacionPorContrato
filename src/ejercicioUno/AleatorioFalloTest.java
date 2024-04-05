package ejercicioUno;

import static org.junit.Assert.*;

import org.junit.Test;


public class AleatorioFalloTest {
	AleatorioFallo instancia=new AleatorioFallo();
	@Test
	public void testGenerarAleatorio() {
		int min=1;
		int max=10;
		int resultado;
		for (int i = 0; i < 10000; i++) {
			resultado=instancia.generarAleatorio(min, max);
			if(resultado<min||resultado>max)
				fail("sale del rango");
		}
	}
	@Test
	public void testGenerarAleatorioDos(){
		int min=1;
		int max=10;
		int resultado;
		boolean bandera=true;
		for (int i = 0; i < 10000; i++) {
			resultado=instancia.generarAleatorio(min, max);
			if(resultado<min||resultado>max)
				bandera=false;
			assertTrue(bandera);
		}
	}

}
