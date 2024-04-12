package ejerciciosCG;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Telegrama04EjSolucionTest {

	@Test
	void testCalcularTelegrama() {
		Telegrama04EjSolucion telegrama=new Telegrama04EjSolucion();
		//casos en los que falla
		try {
			telegrama.calcularTelegrama('a', 1);
			fail("no vale la letra");
			
		} catch (Exception e) {
		}
		try {
			telegrama.calcularTelegrama('o', -1);
			fail("cantidad negativa");
		} catch (Exception e) {
		}
		//casos en los que no falla
		try {
			assertEquals(25,telegrama.calcularTelegrama('u', 1));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
