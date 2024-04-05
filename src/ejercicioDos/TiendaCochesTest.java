package ejercicioDos;

import static org.junit.Assert.*;

import org.junit.Test;


public class TiendaCochesTest {
	TiendaCoches instancia=new TiendaCoches();
	@Test
	public void testValorarCoche() {
		//Primero vamos con las condiciones
		//coches de mas de 20 años
		assertEquals(-1, instancia.valorarCoche(80, 1000, 1970), .1);
		//Coches posteriores a 2013
		assertEquals(-1, instancia.valorarCoche(80, 1000, 2170), .1);
		//Potencias
		//coches de menos de 80 cv
		assertEquals(-1, instancia.valorarCoche(79, 1000, 2011), .1);
		//coches de mas de 250 cv
		assertEquals(-1, instancia.valorarCoche(251, 1000, 2011), .1);
		//kilometrajes, 0 o negativos
		assertEquals(-1, instancia.valorarCoche(80, -1, 2011), .1);
		//con más de 200.000
		assertEquals(0, instancia.valorarCoche(80, 200001, 2011), .1);
		//Una vez superada las condiciones vamos a probar valores
		assertEquals(6300, instancia.valorarCoche(100, 20000, 2007), .1);
	}
	@Test
	public void testTasarimpuestos(){
		assertEquals(-1, instancia.tasarImpuestos('f', 80), .1);
		assertEquals(500, instancia.tasarImpuestos('d', 80), .1);
		assertEquals(450, instancia.tasarImpuestos('g', 80), .1);
	}
	@Test
	public void testvalidarPrestamo(){
		instancia.setRiesgo(5);
		assertTrue(instancia.validarPrestamo(30000, 30000));
		assertFalse(instancia.validarPrestamo(3300, 10000));
		
	}
}
