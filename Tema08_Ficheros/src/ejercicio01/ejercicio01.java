package ejercicio01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio01 {

	public static void main(String[] args) {
		
		String linea;
		
		int suma = 0;
		
		double media = 0;
		
		String[] cadena;

		//buffered reader para leer el fichero
		try {
			BufferedReader in = new BufferedReader(new FileReader("src/ejercicio01/NumerosReales.txt"));
			
			try {
				//guarda la linea que va a leer el reader
				linea = in.readLine();
				//guarda los números de la linea en un array 
				cadena = linea.split(" ");
				
				
				//recorre el array para sumar los números, pasándolos antes a String
				for( String valor : cadena) {
					suma += Integer.valueOf(valor);
				}
				
				media = (double) suma / cadena.length;
				
				System.out.println("Suma: " + suma + " " + "Media: " + media);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
	}

}
