
public class Reproductor implements RadioInterface {
	
	private double frecuencias[]; 
	private double favoritas[];
	private int contador;
	
	
	public Reproductor(double[] frecuencias, double[] favoritas, int contador) {
		this.frecuencias = frecuencias;
		this.favoritas = favoritas;
		this.contador = contador;
	}

	public double actual() {
		return frecuencias[contador];
	}
	
	@Override
	public int continuar() {
		
		if (contador ==frecuencias.length) {
			contador = 0; 
			return contador;
		}		
		else {
			contador = contador +1;
			return contador;}
	}


	@Override
	public int retroceder() {
		if (contador ==0) {
			contador = frecuencias.length; 
			return contador;
		}	
		
		else {
		contador = contador -1;
		return contador;}
	}


	public void guardar(int indice, double nuevo) {
		favoritas[indice] = nuevo;
	}



}
