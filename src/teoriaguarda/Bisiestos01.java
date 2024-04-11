package teoriaguarda;



public class Bisiestos01 {
	/**
	 * Nos dice si un anno es bisiesto
	 * @param anno debe ser mayor que 399 y menor que 10000
	 * @return
	 * @throws Exception 
	 */
	public boolean esBisiestoDefensive(int anno) throws Exception{
		if(anno<=399||anno>=10000) throw new Exception("anno no valido");
		if(!(anno%400==0)){
			if (!(anno%100==0)){
				if(anno%4==0)
					return true;
				else 
					return false;
			}
			else return false;
		}
		else return true;
	}
	
}
