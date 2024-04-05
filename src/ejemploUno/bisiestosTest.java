package ejemploUno;

import static org.junit.Assert.*;

import org.junit.Test;

public class bisiestosTest {
	
	@Test
	public void testEsBisiesto() {
		//creo un array para las pruebas que deben dar true y otroo para las
		//que deben dar false
		int[] bisis={400,2008,2012,2016};
		int[] nobisis={2007,2009,2010,2011,2013,2014,2015};		
		int[] invalid= {-1,4,100,399,10000};
		Bisiestos instancia=new Bisiestos();
		//con dos bucles for pruebo los diferentes elementos de cada
		//array
		for(int x=0;x<bisis.length;x++)
			assertTrue(instancia.esBisiestoDefensive(bisis[x]));
		for(int x=0;x<nobisis.length;x++)
			assertFalse(instancia.esBisiestoDefensive(nobisis[x]));	
		//No se diferenciar entre invalido y no bisiesto
		for(int x=0;x<invalid.length;x++)
			assertFalse(instancia.esBisiestoDefensive(invalid[x]));		
	}
	@Test
	public void testEsContract() {
		//creo un array para las pruebas que deben dar true y otroo para las
		//que deben dar false
		int[] bisis={400,2008,2012,2016};
		int[] nobisis={2007,2009,2010,2011,2013,2014,2015};
		Bisiestos instancia=new Bisiestos();
		assertFalse(instancia.esBisiestoContract(399));
		//con contrato no necesito probar los valores que no admite
		for(int x=0;x<bisis.length;x++) {
			System.out.println(bisis[x]);
			assertTrue(instancia.esBisiestoContract(bisis[x]));}
		for(int x=0;x<nobisis.length;x++)
			assertFalse(instancia.esBisiestoContract(nobisis[x]));	
			
	}

}
