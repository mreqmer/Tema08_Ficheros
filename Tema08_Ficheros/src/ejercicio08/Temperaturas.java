package ejercicio08;

import java.util.TreeSet;

public class Temperaturas {

	static TreeSet <Temperatura> temperaturas = new TreeSet <>();
	static Temperatura auxTemperaturas;
	
	public static boolean addTemperatura(Temperatura t) {
		boolean added = false;
		
		if(temperaturas.add(t)) {
			added = true;
		}
		
		return added;
	}
	
	public static void listar() {
		int maxTotal = Integer.MIN_VALUE;
		int minTotal = Integer.MAX_VALUE;
		for(Temperatura valor : temperaturas) {
			
			System.out.println(valor);
			
			if(valor.gettMin() < minTotal) {
				minTotal = valor.gettMin();
			}
			if(valor.gettMax() > maxTotal) {
				maxTotal = valor.gettMax();
			}
		}
		System.out.println("Minimo: " + minTotal);
		System.out.println("Máximo: " + maxTotal);
		
	}
	
}
