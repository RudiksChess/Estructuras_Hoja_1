
public class Reproductor implements RadioInterface {
	
	private double frecuencias[]; 
	private double favoritas[];
	private int contador;
	private boolean AM;
	
	
	public Reproductor(double[] frecuencias, double[] favoritas, int contador) {
		this.frecuencias = frecuencias;
		this.favoritas = favoritas;
		this.contador = contador;
	}
	
	/**
	* Se utiliza para determinar la frecuencia actual que se está reproduciendo. 
	* @param  ninguno
	* @return la posición del array, según el contador. 
	*/
	public double actual() {
		return frecuencias[contador];
	}
	/**
	* Se utiliza para moverse hacia delante en el contador de emisoras.  
	* @param  ninguno
	* @return la suma del contador +1  
	*/
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

	/**
	* Se utiliza para moverse hacia atrás en el contador de emisoras.  
	* @param  ninguno
	* @return la resta del contador -1  
	*/
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
	/**
	* Se utiliza para guardar las emisoras favoritas en un array.   
	* @param  indice, de donde lo quiere ubicar su nueva emisora. 
	* @param nuevo, la emisora favorita que quiere guardar
	* @return se modifica el array de favoritas.  
	*/

	public void guardar(int indice, double nuevo) {
		favoritas[indice] = nuevo;
	}
	
	@Override
	public void aumentarEmisoraActual(boolean AM) {
		//no implementado
		this.AM=AM;
		
	}
	
	


}
