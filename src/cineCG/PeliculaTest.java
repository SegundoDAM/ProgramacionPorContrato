package cineCG;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PeliculaTest {

	@Test
	void testPelicula() {
		//esto nunca funcionara porque defensivamente no 
		//puedo interrumpir la creacion de un objeto con
		//codigo java
		try {
			assertNull(new Pelicula(null, null));
		} catch (Exception e) {
			System.out.println("pos no te dije...");
		}
		//como veis da un error 
	}

}
