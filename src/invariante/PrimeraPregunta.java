package ejercicioUnoInvariante;



public class PrimeraPregunta {
	//propiedades
	private long renta;
	private byte hijos;
	private double distancia;
	private double[] notas=new double[5];
	
	//para explicar la invariante de clase
	//métodos
	public boolean admitirAlumno(){
		int contador=0;//cuenta las asignaturas aprobadas
		if(renta/hijos<20000)//FALLO 200.000 por 20.000
			if(distancia<3){//FALLO >3 por <3
				for (int indice=0;indice<5;indice++){
					if(notas[indice]>=5)
						contador++;
				}//del for
				if (contador<3) //FALLO >2 por <3
					return false;//no se admite por notas
				else
					return true;
			}//if de distancia
			else
				return false;//no se admite por distancia
		else
			return false;//no se admite por C.R.	
	}//admitirAlumno
	public static void main(String[] args) {
		long[] rentaPrueba={20000,60000,150000};
		byte[] hijosPrueba={3,3,10};
		double[] distanciaPrueba={2.33,5,2.67};
		double[][] notasPrueba={{3.45,5,6,8,9},{3,4,4.5,7,8},{3.2,2.3,2.1,2,4}};
		PrimeraPregunta probando=new PrimeraPregunta();
		//el alumno 0 es aceptado
		//el alumno 1 no es aceptado
		//el alumno 2 no es aceptado
		for (int x=0;x<3;x++){
			probando.setRenta(rentaPrueba[x]);
			probando.setHijos(hijosPrueba[x]);
			probando.setDistancia(distanciaPrueba[x]);
			probando.setNotas(notasPrueba[x]);

			if(probando.admitirAlumno())
				System.out.println("El alumno "+x+" ha sido aceptado");
			else
				System.out.println("El alumno "+x+" no ha sido aceptado");
			
		}//for
	}//main
	public void setRenta(long renta) {
		this.renta = renta;
	}
	public void setHijos(byte hijos) {
		this.hijos = hijos;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
}//class