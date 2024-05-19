package ejercicio08;

public class Temperatura implements Comparable <Temperatura> {
	
	String fecha = "0";
	
	int tMin= 0;
	
	int tMax = 0;
	
	public Temperatura(String fecha, int tMin, int tMax) {
		if (validaFecha(fecha)) {
			this.fecha = fecha;
		}
		this.tMin = tMin;
		this.tMax = tMax;
	}
	

	public String getFecha() {
		return fecha;
	}


	public int gettMin() {
		return tMin;
	}


	public int gettMax() {
		return tMax;
	}
	


	/**
	 * Valida que la fecha esté en fomato aaaa-mm-dd, si es incorrecta saca el
	 * mensaje default del atributo fecha, puede dar una excepción si no se
	 * introducen números en la fecha
	 *
	 * @param fecha Fecha del viaje
	 * @return booleano para saber si la fecha tiene formato válido
	 */
	public boolean validaFecha(String fecha) {
		String[] cadena = fecha.split("-");
		boolean valida = false;
		int dia;
		int mes;
		// Valida que cada parte de la fecha tenga la longitud que debe
		if (cadena.length == 3) {
			if (cadena[0].length() == 4 && cadena[1].length() == 2 && cadena[2].length() == 2) {
				valida = true;
			}
		}
		// Si tiene todo el formato que debe tener comprueba que los números de la fecha
		// sean correctos
		if (valida) {
			dia = Integer.parseInt(cadena[2]);
			mes = Integer.parseInt(cadena[1]);
			Integer.parseInt(cadena[2]);
			if ((dia < 1 || dia > 31) || (mes < 1 || mes > 12)) {
				valida = false;
			}
		}
		return valida;
	}

	public boolean equals(Object obj) {
		boolean iguales = false;
		Temperatura t = (Temperatura) obj;
		if(this.fecha.equals(t.getFecha())) {
			iguales = true;
		}
		return iguales;
	}

	public int compareTo(Temperatura t) {
		int res = 0;
		
		if(this.fecha.compareTo(t.getFecha()) > 1) {
			res = 1;
		}else if(this.fecha.compareTo(t.getFecha()) < 1) {
			res = -1;
		}
		
		return res;
	}
	public String toString() {
		String cadena;
		cadena = this.fecha + "," + this.tMin + "," + this.tMax;
		return cadena;
	}
}
