package ejemploUno;

public class Bisiestos {
	/**
	 * Nos dice si un anno es bisiesto
	 * @param anno debe ser mayor que 399 y menor que 10000
	 * @return true si el anno es bisiesto y false en caso contrario
	 */
	public boolean esBisiestoDefensive(int anno){
		//en este clausa compruebo lo que no debe valer
		if(anno<=399||anno>=10000) return false;
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
	public boolean esBisiestoCG(int anno) throws BisiestosException{
		//en este clausa compruebo lo que no debe valer
		if(anno<=399||anno>=10000) throw new BisiestosException();
		//codigo
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
	
	public boolean esBisiestoContract(int anno){
		//programacion por contrato
		//compruebo los valores que deben valer
		assert (anno>399&&anno<10000):"Anno no valido";
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
